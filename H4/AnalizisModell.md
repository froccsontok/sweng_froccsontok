Usecase 1:
==========

Meghívok három barátot és elindítunk egy játékot.

## Játékosok:

	Client 1:
		steamID: "0001"
	-> hívó

	Client 2:
		steamID: "0002"

	Client 3:
		steamID: "0001"

	Client 4:
		steamID: "0001"
	-> hívottak


Bejelentkezés:
==============

A websocket kapcsolat a kliens indításakor létrejön, ezen keresztül kommunikál a szerverrel, az üzenet JSON formátumban van elküldve, a type tag tartalmazza az üzenet típusát.

	Client 1:
		{ "type": "login", "steamID": "0001" } -> Server

	Client 2 - 4:
		{ "type": "login", "steamID": "..." } -> Server

A login típusú üzenetet a kliens a Steam-re való bejelentkezés után küldi, a steamID a Steam-től kapott token.

	Server:
		Map<Session, PlayerInfo>
		Session@0x0001 -> PlayerInfo [ steamID: "0001" ]
		Session@0x0002 -> PlayerInfo [ steamID: "0002" ]
		Session@0x0003 -> PlayerInfo [ steamID: "0003" ]
		Session@0x0004 -> PlayerInfo [ steamID: "0004" ]

A szerver minden websocket kapcsolathoz rendel egy PlayerInfo objektumot, amely a csatlakozott játékos adatait tárolja.


Meghívás:
=========

	Client 1:
		{ "type": "invite", "players": [ "0002", "0003", "0004" ] } -> 
		
A leader játékos a barátai közül választ játékosokat, akiket meghív. A meghívást az invite típusú üzenetben elküldi a szervernek.

	Server:
		Set<Game>
		Game [ status: GameStatus.Inactive, leader: "0001", players: [ "0001", "0002", "0003", "0004" ], accepted: [] ]

A szerver meghíváskor létrehoz egy Game objektumot, ahol az adott játék adatait tárolja.

		{ "type": "inviteToGame", "leader": "0001" } -> Client 2
		{ "type": "inviteToGame", "leader": "0001" } -> Client 3
		{ "type": "inviteToGame", "leader": "0001" } -> Client 4

Minden meghívott játékosnak küld egy inviteToGame üzenetet. Az üzenetet akkor tudja elküldeni, ha a játékos be van jelentkezve, ezt a PlayerInfo objektumokból tudja meghatározni. Ha megtalálja az adott játékost, akkor a hozzá tartozó Session objektumon keresztül elküldi az üzenetet.


Meghívás elfogadása:
====================

	Client 2-4:
		{ "type": "respondToInvite", "response": "accept" } -> Server

A meghívott játékosok respondToInvite üzenetben tudják elfogadni vagy elutasítani a meghívást.

	Server:
		{ "type": "waiting", "players": [...] } -> Minden várakozó Client, a Server az accepted-ből tudja + a leader

A leader és a meghívást elfogadó játékosok egy töltőképernyőre kerülnek, ahol láthatják, hogy ki fogadta el a meghívást, ezért a szerver minden elfogadáskor elküldi az aktuálisan várakozó játékosok azonosítóját.


Meghívás elutasítása:
=====================

	Client 2-4:
		{ "type": "respondToInvite", "response": "reject" } -> Server


Válaszok összesítése:
=====================

	Server:
		Game [ status: GameStatus.Inactive, leader: "0001", players: [ "0001", "0002", "0003", "0004" ], accepted: [ "0002", ... ] ]

Ha egy játékos elfogadja a meghívást, akkor a Game objektumban az azonosítója eltárolásra kerül az accepted listában.

Játék indítása:
===============

Client 1 indíthatja a játékot, ha elegendő játékos (1 db) elfogadja a meghívást.

	Client 1:
		{ "type": "startGame" } -> Server

A szerver a meghívott játékosoknak elküldi egy gameWasStarted üzentben, hogy a játék elindult.

	Server:
		{ "type": "gameWasStarted" } -> Client 2-4

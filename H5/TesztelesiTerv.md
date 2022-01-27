# Tesztelési terv

## 1. Bevezetés:
Tesztelésre azért van szükség, hogy megbizonyosodhatjunk a program zökkenőmentes és hiba nélküli működéséről. Továbbá biztosít minket arról, hogy későbbi bővítések során az új kódrészletek sem okoznak problémákat. Az egész tesztelés célja, hogy a a felhasználói élmény a lehető legjobb legyen. 

## 2. Felderítendő hibák:
Bemeneti/kimeneti hibák:
- helytelen bemenet elfogadása
- helyes bemenet megtagadása 
- bemeneti mező meghibásodása
- üres bemenet eseteén fellépő hiba
- adatok hibás megjelenítése
- megejelenítésért felelős osztályok meghibásodása

Logikai hiba: 
- hiányzó/duplikált esetek
- hibás operátorok
- hiányzó feltételek
- végtelen ciklus
- memória menedzsment hiba
- változó használat előtti lekérdezésének elmulasztása

Számítási hiba: 
- rossz algoritmus
- rossz belső függvény
- helytelen operandus/művelet
- hiányzó számításaok/műveletek

Adathiba:
- helytelen inicializáció
- rossz változóhasználat
- rossz kódolás
- nem megfelő elérési útvonal
- kliens-szerver kapcsolat hiánya


## 3. Manuális tesztek:

Név|Leírás|Teszt Pozitív Kimenetele
:-----:|:-----:|:-----:
Játék indítása teszt|A játék megnyitása.|A játék hiba nélkül elindul és megjeleníti a főmenüt.
Menü teszt|A menüpontok elérésének tesztelése. A menüben elérhető gombok tesztelése (Játék, Áruház, Rangsor, Beállítások, Profil, Tutorial).|A lenyomott gombnak megfelelő nézetre vált a kezelőfelület.
Főmenü kilépés teszt|A főmenü kilépés gombjának tesztelése.|A gombnyomás hatására a játékablak bezárul.
Matchmaking teszt|Az alkalmazás minden játékmódban képes meccset indítani (Offline singleplayer, Offline multiplayer, Online multiplayer, Online random).|A meccs sikeresen elindul, a kiválasztott játékmódban.
Felbontás teszt|A felbontás átállítása a beállítások menüpontban.|A játék átvált a kiválasztott felbontásra.
Hangerő teszt|A hangerő csúszka használata.|A hangerő beáll a kívánt értékre, a játék a megfelelő kimeneten szól.
Nyelv teszt|A játék nyelvének átállítása.|A kiválasztott nyelv az alkalmazás minden nézetében beállításra kerül.
Billentyűzet kiosztás teszt|Egy adott billentyű kombináció átállítása.|Meccs közben az adott kombináció a megfelelő műveletet hajtja végre.
Kártyapakolás teszt|Egy adott kártyalap mozgatása.|A választott lap elvehető az aktuális pakliból és elhelyezhető egy megfelelő paklira (a játékos saját paklija vagy a dobópakli). A játékos csak a saját körében mozgathat lapokat.
Játék elhagyása teszt|Meccs közben a játék elhagyása.|A játékos visszakerül a menübe, a többi játékos is kiléptetésre kerül. A szerver elveti a játékot, az eredményeket nem tárolja.
Fröccs ára teszt|A játékban különböző összetételű fröccsök eladása.|A játék közben a játékos a készített fröccsnek megfelő értékű coint kap.
Eredmények kiszámítása teszt|A játék végeredményének ellenőrzése.|A játékosok coin mennyisége megfelelően kerül összesítésre. Pontot csak az első két helyezett, holtverseny esetén az első helyezettek kapnak.
Névváltoztatás teszt|A név megváltoztatása.|A kívánt név elmentésre kerül. A játékban mindenhol az új név jelenik meg.
Profilkép változtatás teszt|A profilkép megváltoztatása.|Az új profilkép elmentésre kerül. A játékban mindenhol az új profilkép jelenik meg.

## 4. Automatizált tesztek:

Csoport|Metódus|Tesztadatok|Teszt Pozitív Kimenetele
:-----:|:-----:|:-----:|:-----:
LeaderboardView Tesztek|showLeaderboard()|Véletlenszerű felhasználók külöböző coin mennyiségekkel.|A ranglistán megfelelő helyezéssel jelennek meg a játékosok.
LeaderboardView Tesztek|showLeaderboard()|Játékos hozzáadása vagy játékos adatainak módosítása.|A ranglista frissül a megfelelő helyezésekre.
StoreView Tesztek|listItems()|Véletlenszerű termékek külöböző adatokkal.|Az összes termék megjelenik a megfelelő árakkal és akciókkal.
StoreView Tesztek|listItems()|Termék árának vagy akciójának módosítása.|Az összes termék megjelenik a megváltozott árakkal és akciókkal.
StoreView Tesztek|listOwnedItems()|Véletlenszerű megvásárolt termékek külöböző adatokkal.|Csak a megvásárolt termékek jelennek meg.

## 5. A tesztelés költségei:
### Időigény:

### Munkaerő igény:

## 6. Program validálása:

# Felhasználói felület

## Menü

![Menü UI](UI/Menu.png "Menü UI")

## Játékablak

![Játékablak UI](UI/Jatekablak.png "Játékablak UI")

## Profil

![Profil UI](UI/Profil.png "Profil UI")

## Rangsor

![Rangsor UI](UI/Rangsor.png "Rangsor UI")

## Áruház

![Áruház UI](UI/Aruhaz.png "Áruház UI")

## Beállítások
![Beállítások UI](UI/Beallitasok.png "Beállítások UI")

# Adatbázis

## Szemantikai adatmodell

![ER Modell](AnalizisModell/Froccs_adatbazis.png "ER Modell")

## Relációs adatmodell

	Termék
	======
	TermékID INT
	Név      VARCHAR
	Ár       INT
	Akció    FLOAT

	Játékos
	=======
	SteamID    VARCHAR
	Játékosnév VARCHAR
	Profilkép  INT - fájl azonosítója
	Coin       INT
	Helyezés   INT
	Szint      INT

	Tárgyak
	=======
	SteamID  INT
	TermékID INT

## Osztályok

### StoreDbContext

A játékosok által vásárolt, illetve a még nem birtokolt tárgyak adatainak tárolásáért felelős osztály. A játékos zsetonjainak számának illetve az újonnan vett tárgyainak elmentéséért felelős.

### ProfileDbContext

A játékoshoz tartozó profil adatainak tárolásáért és lekérdezéséért felelős osztály. Tárolt adatok: játékosnév, játékosazonosító, profilkép és a ranglistákon elért helyezés. A profilkép módosítása is ennek az osztálynak a segítségével történik.

# H3 - SRS dokumentum

## Gyakorlatvezető: Krizsán Zoltán

## FröccsÖntők - Csapattagok
Név|Neptunkód|Email|Feladat
:-----:|:-----:|:-----:|:-----:
Juhász Ákos|F58KQ8|juhaszakos7@gmail.com|játékfejlesztő, grafikus
Szűcs Attila|DJA75O|sz.attila0317@gmail.com|játékfejlesztő, dokumentáció
Molnár Balázs|KFIXBJ|molbazsa@gmail.com|játékfejlesztő, dokumentáció
Takács Bálint|P2GNFT|takacsb39@gmail.com|játékfejlesztő, prezentáló
Slyízs István Gábor|HVM06X|slyizsistvangabor@gmail.com|csapatkapitány, játékfejlesztő

## 1. Bevezetés
## 2. Áttekintés
## 3. A rendszer funkciói
### 3.1. Első követelmény
## 4. Használhatóság
## 5. Megbízhatóság
## 6. Teljesítmény
## 7. Támogatottság
## 8. Tervezési korlátozások

### 8.1 Szoftver-architektúra

Mivel szoftverünk egy online játszható, több játékos módot támogató játék, a legkézenfekvőbb architektúrát választottuk, a __kliens-szerver__ architektúrát.

A __szerver oldal__ a következők biztosításáért felel:
- a játékosok adattárolása
- a játékosok adatelérése
<!---->
- a játékmenetek létrehozása 
    - játékosok csatlakoztatása
    - adott esetben játékosok random kiválasztása
- a játékmenetek fenntartása
    - lépések szinkronizálása a játékosok között
    - inaktivitás/kapcsolat hiányának ellenőrzése
    - a kapcsolat helyreállítása (amennyiben lehetséges)
- a játékmenet lezárása
    - eredmény jelzése a résztvevők felé
    - a ranglista frissítése
    - a tapasztalati pontok/szintlépések rögzítése

A __kliens oldal__ a következők biztosításáért felel:
- kapcsolatfelvétel a szerverrel
    - a kapcsolat helyreállítása (amennyiben lehetséges)
- vizuális megjelenítés
    - menü
    - töltőképernyő
    - játéktér (játékablak)
        - ennek szinkronizálása a szerverrel (a játékosok lépéseivel)

### 8.2 Programozási nyelv

Csapatunk a Java (SE 16) programozási nyelvet használja a fejlesztéshez. A fejlesztés objektum orientáltan történik, az objektum orientált nyelvek közül a csapatunk a Java-t ismeri legjobban. Az objektum orientált paradigma azért előnyös játékfejlesztéshez, mert a játékban található objektumok jól megfeleltethetőek osztályoknak. Ezenkívül az egységbezárás segítségével jól elkülöníthetőek a játékon kívüli (pl. menü, beállítások, szerverkapcsolat) és a játékon belüli (pl. asztal, játékosok, megállítási menü) elemek.

### 8.3 Könyvtárak, újrafelhasználható elemek

A grafikus megjelenítéshez a JavaFX (17) könyvtárat fogjuk használni, a Steam, Google, Facebook, email bejelentkezéshez pedig újrafelhasználható, külön-külön módosítható komponenseket.

A játékon belül is találhatóak újrafelhasználható elemek, ilyenek pl. a menü, ill. az aktuális képernyőt megjelenítő komponensek.

### 8.4 Fejlesztőeszközök

A Java fejlesztést az Eclipse IDE-ben végezzük. A dokumentáció GitHub, Visual Studio Code, ill. Notepad++ segítségével készül. A játék grafikai elemeit Photoshop-ban készítjük el, a hangeffekteket/zenét pedig Ableton Live segítségével.

### 8.5 Fejlesztési módszertan

A fejlesztés az evolúciós modell mentén halad. A kezdeti implementációt követően, a csapat tesztelőinek véleményeit meghallgatva, folyamatosan finomítjuk majd a játékot. A szoftver a kiadást követően is fenntartást igényel, a szerverek működtetése és a hibák javítása is beletartozik a szoftver életciklusába.

## 9. On-line dokumentáció és Help rendszer
## 10. Felhasznált kész komponensek
## 11. Interfészek
### 11.1. Felhasználói interfészek
### 11.2. Hardware interfészek
### 11.3. Software interfészek
### 11.3. Kommunikációs interfészek
## 12. Alkalmazott szabványok
### 12.1. Kötelezően alkalmazandó szabványok
### 12.2. Választás alapján alkalmazott szabványok
## 13. Mellékletek

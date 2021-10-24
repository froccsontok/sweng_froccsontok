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
## 9. On-line dokumentáció és Help rendszer
## 10. Felhasznált kész komponensek
## 11. Interfészek
### 11.1. Felhasználói interfészek
### 11.2. Hardware interfészek
### 11.3. Software interfészek
### 11.3. Kommunikációs interfészek
A kommunikációs interface nevéből adódóan a komponensek közötti kommunikációért felel.
A szoftverünk esetében ez az interface 3 al interfacera bontható:
* Cliens-Szerver:
Ebben a kommunikációban a Felhasználói cliens és a játékot futtató szerver vesz részt. Itt történik az a kommunikáció mikor a játékos elindít egy meccs keresést és játszik.

* Szerver-Adatbázis:
Ebben a kommunikációban a játékot futtató szerver és az adatokat tároló adatbázis vesz rész. 
Itt történik a kommunikációnak az a része mikor a játékos kijátszik valamilyen lapot amit a szerver feldolgozáskor lekér az adatbázis azon részéből amiben a játékhoz tartozó lapok és adataik szerepelnek. Majd mikor ez megtörténik akkor az adatokat megkapva a szerver betölti a pályára az adott lapot és érvényesíti azt.

* Cliens-Adatbázis:
Ebben a kommunikációban a cliens és az adatokat tároló adatbázis vesz részt. 
Itt történik a kommunikáció azon része amikor egy regisztrált felhasználó a cliensbe belépve az adatokat elküldi az adatbázis szervernek azon részére ahol a felhasználók és azok adatai vannak nyilvántartva és ha szerepel a nyilvántartásban akkor a szerver visszaválaszol és belépteti az adott clienst, amennyiben nincs benne az nyilvántartásban akkor egy error üzenttel tér vissza a cliensnek mivel az a felhasználó nincs regisztrálva.
## 12. Alkalmazott szabványok
### 12.1. Kötelezően alkalmazandó szabványok
### 12.2. Választás alapján alkalmazott szabványok
## 13. Mellékletek

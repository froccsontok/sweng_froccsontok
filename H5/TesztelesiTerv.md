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

## 4. Automatizált tesztek: 

## 5. A tesztelés költségei:
### Időigény:
Az alkalmazás elkészítésének időigénye nagyban függ a tesztelés kimenetelétől. Ez előreláthatóan egy 2 hónapos folyamatot jelent, mely nagyban függ a tesztelés alatt felmerülő esetleges problémáktól és a fejlesztő csapat összedolgozási képességeitől. A tervezett kiadási dátum pontosítása is ebben a fázisban történik, de ennek megvátoztatására a jogot fenntartjuk.

### Munkaerő igény:
A tesztelés első fázisát az 5 fős fejlesztő csapatz fogja végezni. Később tesztelőket fogunk alkalmazni, hogy a játék menet közben, mindenre kiterjedő tesztelést folytassanak. A tesztelők egy nagyjából 100 fős brigád, akik önkéntes alapon jelentkezhetnek, cserébe korai hozzáférést és játékbeli ajándékokat kapnak majd.

## 6. Program validálása:

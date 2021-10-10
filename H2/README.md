# H2
FröccsÖntők

## 1. Bevezetés

## 2. Az alkalmazás helye

## 3. Érintettek és felhasználók

## 4. A végtermék áttekintése

## 5. A végtermék jellemzői, biztosított szolgáltatások

## 6. Korlátozások

## 7. Minőségi elvárások

## 8. Dokumentációkkal kapcsolatos követelmények

## 9. Kockázat lista

### A főbb kockázatok:

A tervezési szakaszban:

1. a szoftver nincs teljesen definiálva
2. a szoftver nincs egyértelműen definiálva

Az implementációs szakaszban:

3. valamelyik funkciót/komponenst nem tudjuk implementálni
4. a szoftver nem készül el időben
5. a szoftver a vártnál erőforrás-igényesebb

Az elkészült szoftvernél:

6. a vártnál kisebb az érdeklődés a játék iránt
7. a vártnál nagyobb az érdeklődés a játék iránt

### A lehetséges megoldások:

1. A szoftver nincs teljesen definiálva, ha nem határoztuk meg minden funkcióját/képességét, vagy azokat nem fejtettük ki elég részletesen. Ezt kiküszöbölhetjük ábrák készítésével, amelyeken könnyebb felfedezni, ha valami hiányzik, mint több oldal szövegben. Egy másik megoldási módszer az, hogyha különböző forgatókönyveket vizsgálunk (pl. a játékos hogy jut el a bejelentkezéstől a játék kezdetéig; mi történik, ha véget ér a játék; hogyan zajlik maga a kártyajáték).
2. A szoftver nincs egyértelműen definiálva, ha egy adott komponens leírása nem elég precíz, vagy ha egy komponens különböző helyeken különbözőképpen van definiálva. Ha valaki egy komponens leírását végzi, meg kell vizsgálnia a korábban elkészített dokumentációt, illetve egyeztetnie kell a többi csapattaggal. Ha egy dokumentumon több csapattag dolgozik egyszerre, egészében is gyakran ellenőrizni kell a dokumentumot. Végig lehet gondolni, meg lehet beszélni azt is, hogy az adott komponensre milyen szituációban lehet szükség, mert ha a csapattagoknak más az elképzelése a szituációkról, akkor valószínűleg a komponensről is más lesz az elképzelésük.
3. Ha egy funkció/ötlet túl ambiciózus, akkor lehetséges, hogy a funkció nem implementálható, vagy ha igen, akkor plusz eszközre, emberre, vagy időre lenne szükség. Hogy ez ne történjen meg, már a tervezésnél figyelembe kell venni az implementációt, minden funkciónál kell hogy legyen egy kezdeti elképzelésünk a megvalósításról. Minden funkcióhoz érdemes rendelni egy várt fejlesztési időt, így követhető, hogy a projekt határidejéig minden teljesíthető-e.
4. Annak kockázata, hogy a szoftver nem készül el időben, leginkább az előző pontra vezethető vissza. Ha a tervezéskor rosszul mérjük fel, hogy mennyi időt kell egyes komponensekre szánni, az csúszáshoz vezethet. Ennek megoldása a tervezéskor az alapos megfontolás, odafigyelés, de a kockázat nem iktatható ki teljesen.
5. A szoftver a vártnál erőforrás-igényesebb lesz, ha némelyik funkció nem valósítható meg elég hatékonyan. A probléma további optimalizációval általában orvosolható, de ez további pénzt és időt emészthet fel. A megelőzés hasonló a 3. pont megoldásához (azaz az implemetáció figyelembe vétele már tervezésnél). Ezen kívül folyamatos tesztekkel/benchmarkokkal a fejlesztés közben ellenőrizhetjük a komponens hatékonyságát, hamar észrevehetjük a későbbi problémákat. Viszont maga a tesztek írása és a tesztelés is erőforrásokat emészt fel, meg kell találni tehát az egyensúlyt.
6. Ha a végtermék iránt a vártnál kisebb az érdeklődés, akkor megvan a kockázata, hogy a projektbe fektetett idő, energia, pénz nem térül meg. Ennek megoldása egy előzetes felmérés lehet, ahol megnézzük, hogy jelenleg használatban vannak-e hasonló szoftverek, illetve ha nem létezik hasonló szoftver, akkor mekkora rá az igény.
7. Ha a végtermék iránt a vártnál nagyobb az érdeklődés, akkor annak van kockázata, hogy nem tud minden játékos csatlakozni a játékhoz (pl. a szerver leterheltsége miatt), vagy ha igen, akkor minden játékos játékminősége romolhat (pl. nagyobb várakozási idő, késleltetés a kapcsolatban a játék közben, "akadozás"). Ennek megoldása nem feltétlenül ütközik problémába (pl. a játék elég bevételt termel további szerverek beüzemeléséhez), de nem mindig triviális (pl. több szerver esetén magukat a szervereket is össze kell kapcsolni; meg kell oldani, hogy a játékosok ugyanazon a szerveren legyenek egy-egy játékmenet alatt). A 5. és a 6. pont kiküszöbölése is tervezést igényel (felmérés, bővítési terv), de az igény felmérése a rengeteg változó és szerencse-faktor miatt sosem oldható meg teljes mértékben.

## 10. Szótár

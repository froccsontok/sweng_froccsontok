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

### 2.1 A termék környezete és elhelyezkedése

Kinek készült (melyik / milyen szervezetnek): A majd elkészült Fröccs játék implementációját elsősorban a legjelentősebb és legelterjedtebb online játékáruház keretein belül, a Steam online áruházban tervezzük terjeszteni. Az itteni terjesztés széleskörben képes lesz eljuttatni a kész terméket a felhasználókhoz világszerte.

Ki fogja használni: Az általunk priorizált célközönség a 14 – 40–es korosztály lenne. Ez a célközönség értékelhetné legjobban a játék humorát és annak egyszerű, de mégis fondorlatos játékélményét. Ebben a korcsoportba beletartozik a 18 – 24 éves korosztály is, ami sok kutatás szerint magába foglalja a videó játékokkal foglalkozó emberek legnagyobb részét. A játék alapvető témája és az alkohol gyakori említése miatt a legfiatalabb korosztálynak nem feltétlenül lesz megfelelő a Fröccs játék használata.

Milyen alkalmazás kategóriába tartozik (pl. fejlesztőeszköz, vállalati információs rendszer, stb.): Az alkalmazás a játékszoftver kategóriában helyezkedik el. A játékszoftverek piaca folyamatosan növekszik, és rengeteg lehetőséget illetve magas bevételt hordoz magával. 2020-ban a komplett videójáték-piac értékét több, mint 1.59 billió amerikai dollárra becsülték. A Fröccsöntők csapata ezt a piacot tervezi megcélozni az új játékszoftver létrehozásával.

Mi az alapvető haszna: Az alkalmazást igénybevevő felhasználók számára nyugtató, relaxációs időtöltésként használható. Illetve a játék egy plusz kihívást, tanulási lehetőséget szolgáltat, annak fejlett stratégiai játékélményével. A program a szociális készségek fejlődésében is segítheti a felhasználót, hiszen a játék elengedhetetlen része a többi játékossal való érintkezés és tárgyalás.

Milyen alternatívák lehetnek a fejlesztésen kívül (meglevő más rendszer, másféle megoldás, ezek előnyei, hátrányai): Alapvető terjesztési célként a Steam online áruházat céloztuk meg. Ezáltal is elkötelezve a projektet az asztali számítógépeken való használat mellett. Csoportunk tisztában van a Google Play (Android) és az App Store (IOS) alapú terjesztés lehetőségével is. Ezeknek a felületeknek is jelentős vásárlói és követői közössége van, de arra jutottunk, hogy az alkalmazás lehető legjobb játékélményhez elengedhetetlen az asztali számítógépek környezete. A Fröccs játék első kiadását követően, a játék deputálásáról bejövő információk alapján még az imént említett platformokra való kiterjesztése sem lehetetlen.

Miben különbözik alapvetően az elkészült termék az alternatíváktól: A Fröccshöz hasonlóan rengeteg online kártya és társasjáték létezik a világon. Gondolhatunk itt Hearthstonera, Yu-gi-ohra vagy az egyszerűbb Uno virtuális változatára is. A Hearthstonehoz hasonló alkalmazások a játékélmény mellett a kártyák megszerzésének is nagy szerepet tulajdonítanak. Ezt a játékban eltöltött idővel vagy gyakrabban online tranzakciókkal próbálják implementálni. A fröccs játéknál viszont fontosnak tartjuk, hogy a felhasználó az alap játék minden részéhez alapból hozzáférjenek, ezáltal már a kezdetektől teljes játékélményben legyen része a felhasználóknak. Illetve a hasonló alternatíváknál gyakori az egy az egy elleni játékmenet használata, viszont mi megpróbáljuk az eredeti társasjátékot minél pontosabban előhozni az implementáció során. Ezáltal egy játékmenet akár 3 – 6 játékos számára is elérhető lesz egyszerre.

### 2.2 Legfontosabb funkciók

#### Bejelentkezési képernyő:
Ha a felhasználó rendelkezik Internet-kapcsolattal, akkor meg fog jelenni a bejelentkezési képernyő, ahol beléphet játékos profiljába. Amennyiben első használatkor vagy kijelentkezés után nincs kapcsolat, az egy játékos és lokális multiplayer módok elérhetőek lesznek bejelentkezés nélkül. Ha egy játékos be volt jelentkezve, akkor a legutoljára szinkronizált adatok (pl. szint) elérhetőek lesznek kapcsolat nélkül is, ezenkívül az előbb említett két játékmód is használható lesz.

#### Menü:
Bejelentkezés után a menüt fogja látni a felhasználó.

A menü a következő menüpontokból fog állni:
- Játékmódok, azaz:
    - Local Matchmaking
    - Play with Friends
    - Random Matchmaking
    - Play against Bot
- Beállítások
- Profil
- Áruház

A Local Matchmaking segítségével lokális multiplayer módban játszhatunk, a játékosok ilyenkor külön billentyűkiosztást kapnak és egy számítógépen játszhatnak egymás ellen. A Play with Friends menüpontot választva a Steam-es barátainkkal indíthatunk játékot. A Random Matchmaking más játékosokkal sorsol össze minket. Az egy játékos mód a Play against Bot menüpont segítségével lesz elérhető.

A Profil menüpontban megtekinthetőek lesznek a bejelentkezett játékosok. Látható lesz szintjük, továbbá online módban az online ranglista, offline módban csak a 15 rekordtartó felhasználó eredményét tároló lokális ranglista.

Az Áruházban a partik után szerzett virtuális zsetonokért tudunk majd vizuális kiegészítőket venni a játékhoz.

#### Beállítások:

A következő beállításokat lesz lehetősége módosítani a játékosoknak:
- Nyelv
- Hangerő
- Felbontás
- Billenytűkiosztás

#### Játékablak:

A játékablakban fog megjelenni a virtuális asztal, illetve a játékosok paklijai, maguk elé helyezett vagy kijátszott lapjaik.

A játékmódtól függően a játékablak a következőképpen változik:
- Ha több játékos módban játszunk akkor a játékosok nevei is megjelennek. Online multiplayer esetén a Steam fiókhoz tartozó nevek, lokális multiplayer esetén a bejelentkezett felhasználó és a megadott játékosok nevei jelennek meg.
- Egy játékos mód esetén a bot(ok) fogják kezelni az ellenfél játékosok lapjait.

### 2.3 Felhasználók

### 2.4 Feltételezések és függőségek

A több játékos módhoz Internet-kapcsolatra lesz szükség, hogy elérhető legyen a többi játékos, ez alól kivételt képez a lokális multiplayer mód. Mivel egy kártyajátékról van szó, rövidebb ideig nem okoz problémát a kapcsolat hiánya. Ha egy kimaradás után visszatér a hálózati kapcsolat, a többi játékos lépéseit könnyedén szinkronizálhatjuk az újra csatlakozott klienssel. Ha egy játékosnak egy adott pillanatban nincs kapcsolata, minden játékos felé egy ikonnal lesz jelezve. Ha a kapcsolat 45 másodperc alatt nem jön újra létre, akkor a többi játékosnak egy felugró ablakban felajánljuk, hogy befejezzék a játékot, vagy tovább várakozzanak. A játékosok természetesen a 45 másodperc alatt is kiléphetnek a menü segítségével.

A játékosnév és fiók létrehozása lehetséges lesz email-cím segítségével, illetve Google- vagy Facebook-fiókkal. Ennek működése függ a Google és Facebook szervereinek elérhetőségétől, ezért ezekre csak regisztrációkor lesz szükség, a regisztrációt követően egy játékosnév és jelszó párossal mindig be lehet majd jelentkezni, feltéve, hogy a mi szerverünk elérhető.

A játékosok kapcsolódása egy szerver segítségével lesz megvalósítva, ennek megoldása egy szerver-bérlő szolgáltatás segítségével történne (pl. linode, AWS, Microsoft Azure). A játékunk így függ a szolgáltató elérhetőségétől.

Hogy minden játékos számára elérhetőek legyenek az esetleg utólag hozzáadott funkciók, illetve javítások, a több játékos módban feltételezzük, hogy minden játékos a legfrisseb verzióval rendelkezik. Ezt a játék minden induláskor ellenőrizni fogja, amennyiben a játékos rendelkezik Internet-kapcsolattal.

Feltételezzük, hogy a játékos rendelkezik a minimális hardverkövetelményekkel. Abban az esetben, ha nincs inkompatibilitás, csak lassabb hardverrel rendelkezik a felhasználó, a játék megpróbál majd elindulni, de a megfelelő játékélményt nem tudjuk garantálni.

A játékszabályok ismeretét is feltételezzük, a szabályok elérhetőek lesznek a menüben.

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
## 12. Alkalmazott szabványok
### 12.1. Kötelezően alkalmazandó szabványok
### 12.2. Választás alapján alkalmazott szabványok
## 13. Mellékletek

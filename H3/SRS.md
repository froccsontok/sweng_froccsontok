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

A projektünk célja a Fröccs nevű kártyajáték megalkotása digitális formában.

A játékmenet a társasjáték szabályait fogja követni, a játékosok különböző karaktereket magukra öltve vesznek majd részt a játékban. A játékosok rendelkezni fognak játékosnévvel, eredményeiket szintjük és egy rangsor fogja nyilvátartani. Játékunk a több játékos (más felhasználók elleni) és az egy játékos (botok elleni) játékmódot is támogatni fogja.

Az egy játékos módhoz nem lesz szükség Internet-kapcsolatra, a több játékos módhoz sem feltétlenül kell majd (ez lesz a lokális multiplayer mód).

Ez a dokumentum a fejlesztendő játékprogram részletes szoftverspecifikációját tartalmazza.

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

A felhasználók Steam-fiókkal rendelkező játékosok lesznek, ez alól kivétel, ha első indításkor vagy kijelentkezés után offline módban játszanak, ekkor nem Steam-fiókkal hanem a beírt nevekkel lesznek azonosítva a játékosok.

A jelenlegi időszakban várhatóan növekedni fog a felhasználók száma, ha a COVID-19 járvány újabb hulláma miatt az emberek újra home office-ba és karantánba kényszerülnek. Várhatóan egy felhasználó egyszerre nagyjából 1-2 óráig fogja használni a szoftvert, azonban ez az idő változhat különböző körülmények hatására (pl.: Ha több fős tarsaságban használják a szoftvert és így egymás ellen több partit is lejátszanak a felhasználók). Különböző frissítésekkel arra törekszünk majd, hogy a felhasználók hosszútávon is minél tovább használják a szoftvert.

### 2.4 Feltételezések és függőségek

A több játékos módhoz Internet-kapcsolatra lesz szükség, hogy elérhető legyen a többi játékos, ez alól kivételt képez a lokális multiplayer mód. Mivel egy kártyajátékról van szó, rövidebb ideig nem okoz problémát a kapcsolat hiánya. Ha egy kimaradás után visszatér a hálózati kapcsolat, a többi játékos lépéseit könnyedén szinkronizálhatjuk az újra csatlakozott klienssel. Ha egy játékosnak egy adott pillanatban nincs kapcsolata, minden játékos felé egy ikonnal lesz jelezve. Ha a kapcsolat 45 másodperc alatt nem jön újra létre, akkor a többi játékosnak egy felugró ablakban felajánljuk, hogy befejezzék a játékot, vagy tovább várakozzanak. A játékosok természetesen a 45 másodperc alatt is kiléphetnek a menü segítségével.

A játékosnév és fiók létrehozása lehetséges lesz email-cím segítségével, illetve Google- vagy Facebook-fiókkal. Ennek működése függ a Google és Facebook szervereinek elérhetőségétől, ezért ezekre csak regisztrációkor lesz szükség, a regisztrációt követően egy játékosnév és jelszó párossal mindig be lehet majd jelentkezni, feltéve, hogy a mi szerverünk elérhető.

A játékosok kapcsolódása egy szerver segítségével lesz megvalósítva, ennek megoldása egy szerver-bérlő szolgáltatás segítségével történne (pl. linode, AWS, Microsoft Azure). A játékunk így függ a szolgáltató elérhetőségétől.

Hogy minden játékos számára elérhetőek legyenek az esetleg utólag hozzáadott funkciók, illetve javítások, a több játékos módban feltételezzük, hogy minden játékos a legfrisseb verzióval rendelkezik. Ezt a játék minden induláskor ellenőrizni fogja, amennyiben a játékos rendelkezik Internet-kapcsolattal.

Feltételezzük, hogy a játékos rendelkezik a minimális hardverkövetelményekkel. Abban az esetben, ha nincs inkompatibilitás, csak lassabb hardverrel rendelkezik a felhasználó, a játék megpróbál majd elindulni, de a megfelelő játékélményt nem tudjuk garantálni.

A játékszabályok ismeretét is feltételezzük, a szabályok elérhetőek lesznek a menüben.

## 3. A rendszer funkciói
A következő pontokban a játék mindenki számára elérhető funkcióit mutatom be.

#### Steamen elérhető funkciók: 
-	Játék indítása: A gomb megnyomásával a játék automatikusan elindul vagy ha frissítés érhető el, akkor első sorban feltelepülnek a frissítések és a játék ezután indul el.
-	Fórum: Itt érhető el a játék hivatalos fórum felülete ahol a játékosok bejegyzéseket tehetnek közzé adott témák. A fórum a játékos közösség létrejöttét szolgálja majd és segíti majd a kapcsolattartást a játékosok és a fejlesztők között.
-	A játék profilja: Itt tálható a játék leírása különböző tulajdonságokkal és a rendszer követelményekkel együtt.
-	Barátok: Egy listában láthatjuk azokat a Steam-es barátainkat akik szintén játszanak a játékkal, és a nevük mellet láthatjuk hogy éppen aktívak-e vagy sem.
-	Jutalmak: Itt tálálhatjuk a játékban elért eredmények után megszerzett jutalmainkat, kitüntetéseinket.
-	Újdonságok: A készítők ezen a felületen tudják közzétenni a játékba érkező újdonságokat változásokat és további aktualitásokat.

#### A játékban elérhető funkciók:
-	Bejelentkezés: Steam-en keresztül a Steam fiókunkkal.
-	Játék Bot ellen: Elindul a játékmenet az általunk kiválasztott számú és nehézségi fokozatú botok ellen. A játékban elért eredményeinkért jutalompontokat és különböző ajándékokat kaphatunk
-	Lokális parti: Ezen játékmód elindításakor mindegyik játékosnak egyedi nevet kell megadnia, ami alapján a játék meg tudja őket különböztetni. Egyszerre 3-6 személy játszhat. Ezek után indul el a játékmenet, azonban itt a játékosok nem kapnak jutalmakat, csakis pontokat az eredményeik után, amelyek alapján egy rangsort állít fel a játék a partiban résztvevő játékosokról.
-	Online parti: A parti létrehozásakor először lehetőségünk van megadni, hogy hány embert szeretnénk meghívni a partiba. A Steam-es barátainkat is meg tudjuk hívni a partiba ezután elindíthatjuk a meccskeresést amely addig fut majd ameddig a rendszer nem tál annyi játékost amennyi játékos még szükséges ahhoz hogy meglegyen a meccskeresés elején beállított létszám. A játékmenet a hagyományos és az itt elért eredményeinkért is kapunk jutalompontokat valamint ajándékokat.
-	Grafikai beállítások: A beállítások menü ponton belül lehetőségünk van a játék megjelenítésén változtatni. Itt beállíthatjuk a felbontást, a képernyőmódot (ablakban/teljesképernyős), a grafika minőségét (alacsony/közepes/magas), valamint beállíthatjuk a képfrissítést is (30 Fps/60 Fps/ Korlátlan).
-	Nyelvi beállítások: Itt megváltoztathatjuk a játékban használt nyelvet (Magyar/Angol/Német).
-	Hang beállítások: A játék több fajta hangeffektet is tartalmaz majd, itt lehetőségünk lesz majd ezek hangerejét módosítani. Beállíthatjuk  majd a játék fő hangerejét, a háttérben játszódó zenék hangerejét, valamint a játékmenet közbeni hangeffektek hangerejét.
-	Irányítások: Ebben a menüpontban személyre szabhatjuk a játék irányítását. Változtathatunk a billentyűkiosztáson és az egér működését is beállíthatjuk. 
-	Tutorial: Egy próba játékmenet amelyben a felhasználó botok ellen játszik és játék közben üzeneteket kap segítség képpen. Ennek a módnak a célja, a játékmenet teljes bemutatása és segítség nyújtás a játékhoz szükséges tudás elsajátításában. Ennek befejeztével a játékos egy kezdő bónuszt kap.
-	Rangsor: A felhasználókat a játékban elért eredményeik alapján rangsorolják. Ez a rangsor ebben a menüpontban tekinthető meg.

A játékot használó személyeket alapvetően két csoportra oszthatók. Ezek a felhasználók (játékosok), akik program funkcióinak az élvezői, valamint vannak az adminok akiknek jogosultságuk van a szerver moderációjára is.

#### Felhasználó (játékos) számára elérhető funkciók:
-	A fent említett Steam-es és játékbeli funkciók teljes körű használata.
-	Regisztráció a Steam rendszerébe. Ezután lehetséges a játék aktiválása és használata.
-	Bejelentkezés : A regisztrált adatainkat megadva tudunk belépni a Steam rendszerébe ahonnan elérjük a játékot.
-	A játék számítógépen elfoglalt helyének pontos megadása a telepítéskor.
-	Adatok módosítása: A Steam-en belül a felhasználóknak lehetőségük van a profiljuk adatainak a módosítására (Pl.: jelszó, felhasználónév, e-mail cím).
-	A fórum megtekintése és bejegyzés írása.
-	Virtuális zsetonok gyűjtése: Minden parti után, különböző mérföldkövek elérése után és a napi bejelentkezések után virtuális zsetonokat kapunk amit a fiókunkon gyűjthetünk, természetesen ezt a program számon tartja.
-	Áruház használata: Az áruházban a virtuális zsetonjainkat szabadon fel tudjuk használni és vizuális kiegészítőket tudunk vásárolni.
-	Barátok hozzáadása: Steam felhasználókat tudunk hozzáadni a barát listánkhoz a felhasználónevük alapján.
-	Jelentés: A játékosok, ha a parti folyamán esetleg csalással, gyűlöletbeszéddel vagy olyan játékossal találkoznak akik mások játékát rontják el akkor azt jelenthetik és ennek a jogosságát az Admin fogja kivizsgálni.

#### Admin számára elérhető funkciók:
-	Az Admin számára minden funkció elérhető ami a játékos számára is!
-	Szerver moderáció: Az Admin felelős a szerver stabilitásáért és karbantartásáért, a bejelentkezések kezeléséért, a szoftver frissítéséért, a hibák kijavításáért, adatbázis szinkronizálásáért és a felhasználói jogosultságok beállításáért.
-	Fórum moderáció: Az Admin lesz a felelős a teljes fórumért. Ő hozhat létre új témákat de el is távolíthatja őket. Az Admin dolga az üzenetek moderálása, tehát az oda nem illő, a közösségi irányelvekkel szembemenő bejegyzéseket is eltávolíthatja és adott esetben a bejegyzés íróját ki is tilthatja a fórumról. A fórumban a fejlesztők felé érkező üzenetekre az Admin válaszol és az itt jelentett hibák kijavításáért is az Admin felel majd
-	Bannolás: A beérkező jelentéseket az Admin vizsgálja ki, és ha a vádak igaznak bizonyulnak, akkor büntetést szabhat ki feléjük. A jelentett játékos kitilthatja külön csak az online játékmódokból, de a teljes játékból is. Ilyenkor a jelentett játékos nem tud online partit létrehozni vagy már a játékba se tud belépni, ezt egy üzenet formájában jelezzük feléjük. Ezek a büntetések egy adott ideig vannak hatályban, de súlyos vagy rendszeresen visszaeső eseteknél a tiltás végleges is lehet.
-	Az Adminnak áll jogában a játék adatlapjának a szerkesztése és az újdonságok folyamatos közzététele.
-	Egyedül az Admin ruházhat fel admin jogosultsággal más felhasználókat.

## 3.1 Offline felhasználó számára elérhető funkciók

### 3.1.1 Lokális rangsor elérése

<table>

<tr><td>Name, description</td><td>
    Lokális rangsor megtekintése
</td></tr>

<tr><td>Primary Actor</td><td>
    Offline felhasználó
</td></tr>

<tr><td>Secondary Actors</td><td>
   Online felhasználó
</td></tr>

<tr><td>Pre-condition</td><td>
    Fröccs játék elindítva
</td></tr>

<tr><td>Post-condition</td><td>
    A lokális rangsor adatai betöltésre kerültek. Majd a tartalom be lett zárva.
</td></tr>

</table>

#### Main Success Path (primary flow)

A felhasználónak a főmenüből elérhetően meg kell nyitnia a rangsorok almenüpontot. Ez alapértelmezetten a lokális rangsort nyitja meg. Miután a program betölti az adatokat, a felhasználó egy görgetősáv használatával tölthet be újabb adatokat.

<table>

<tr><td>Actor Actions</td><td>System Responses</td></tr>

<!-- actor -->
<tr><td>
    1. Rangsor menü megnyitása
</td><td></td></tr>

<!-- system -->
<tr><td></td><td>
    2. Új menü megnyitása: ’Lokális rangsor’
</td></tr>
    
 <tr><td>
    3. Görgetősáv használata
</td><td></td></tr>

<!-- system -->
<tr><td></td><td>
    4. Új adatok betöltése
</td></tr>
    
<tr><td>
    5. Visszalépés menüpont használata
</td><td></td></tr>

<!-- system -->
<tr><td></td><td>
    6. Főmenü betöltése
</td></tr>

</table>

## 3.2 Online felhasználó számára elérhető funkciók

### 3.2.1 Globális rangsor elérése

<table>

<tr><td>Name, description</td><td>
    Globális rangsor megtekintése
</td></tr>

<tr><td>Primary Actor</td><td>
    Online felhasználó
</td></tr>

<tr><td>Secondary Actors</td><td>
   
</td></tr>

<tr><td>Pre-condition</td><td>
    Fröccs játék elindítva, 
    internethozzáférés, 
    Steambe való bejelentkezés online módban
</td></tr>

<tr><td>Post-condition</td><td>
    A globális rangsor adatai betöltésre kerültek. Majd a tartalom be lett zárva.
</td></tr>

</table>

#### Main Success Path (primary flow)

A felhasználónak a főmenüből elérhetően meg kell nyitnia a rangsorok almenüpontot. Ez alapértelmezetten a lokális rangsort nyitja meg, de a rangsor menüpontok váltásával a globális rangsor is elérhető lesz. Miután a program betölti az adatokat, a felhasználó egy görgetősáv használatával tölthet be újabb adatokat.

<table>

<tr><td>Actor Actions</td><td>System Responses</td></tr>

<!-- actor -->
<tr><td>
    1. Rangsor menü megnyitása
</td><td></td></tr>

<!-- system -->
<tr><td></td><td>
    2. Új menü megnyitása: ’Lokális rangsor’
</td></tr>
    
<tr><td>
    3. Rangsor váltása
</td><td></td></tr>

<!-- system -->
<tr><td></td><td>
    4. Új rangsor adatok betöltése: 'Globális rangsor'
</td></tr>
    
 <tr><td>
    5. Görgetősáv használata
</td><td></td></tr>

<!-- system -->
<tr><td></td><td>
    6. Új adatok betöltése
</td></tr>
    
<tr><td>
    7. Visszalépés menüpont használata
</td><td></td></tr>

<!-- system -->
<tr><td></td><td>
    8. Főmenü betöltése
</td></tr>

</table>

#### Exception Path

A felhasználó nem rendelkezik internet hozzáféréssel: a felhasználó képtelen lesz a lokális rangsorról a globális rangsorra váltani.

## 3.3 Admin számára elérhető funkciók

## 4. Használhatóság
### 4.1 Különböző tapasztalati szinttel rendelkező felszanálók
#### 4.1.1 Kezdő felhasználó:
Mivel a kezelőfelület igen egyszerű így az olyan ember is, aki először játszanak számítógépes játékkal az is képes lesz viszonylag rövid idő alatt megtanulni a játék kezelő felületétt.
#### 4.1.2 Tapasztalt felhasználó:
Akinek viszont már van, tapasztalta a számítógépes játékokkal azok pár perc használat után ugyan úgy tudja használni, mint bármelyik másik játékot.
### 4.2 Felhasználói felület megtanulása:
Az egy opció a tutorial funkció, ami a játék telepítése utáni első indításkor automatikusan meg jelenik, amit ha estleg átugrunk, akkor a menüből egy gomb segítségével újra elő
tudunk hívni. A másik lehetőség pedig a mások vagy általunk feltöltött videók, vagy ha valaki élőben közvetíti azt, ahogy játszik. Így jól meglehet tanulni hogy hogyan lehet játszani a játékkal.
### 4.3 Felhasználói felület:
A felhasználói felület hasonlítani fog a többi játék felhasználói felületéhez mivel itt is lesz egy „Play”, „Invite”, Beállítások, Kilépés, Áruház illetve meg fog jelleni a menüben a felhasználó neve és a profilképe.
## 5. Megbízhatóság

### Biztonság

A játékunk meg fog felelni a Steam követelményeinek. A felhasználók adatait az előírásoknak megfelelően fogjuk tárolni, az adatok kiszivárgásának/ellopásának elkerülése érdekében egy megbízható szerver szolgáltatót fogunk választani.

### Funkciók elérhetősége

A játék offline állapotban is játszható, botok ellen vagy lokális multiplayer módban. Offline módban a legutóbb bejelentkezett felhasználó marad aktív, a ranglista ilyenkor nem lesz elérhető, illetve a játszott játékok nem növelik a pontszámunkat, így a szintünket sem.

### Hibalehetőségek

#### Indítás előtt:

Ha a játékos számítógépe nem tesz eleget a hardverkövetelményeknek, akkor lehetséges, hogy a játék nem telepíthető vagy nem indítható el.

#### Indítás után:

Attól, hogy a játékos számítógépe nem tesz eleget a hardverkövetelményeknek, még elképzelhető, hogy a játék telepíthető és el is indítható. Ilyen esetben a játék nagy valószínűséggel akadozni fog.

A szoftverben lehet hiba (bug), amely a hibától függően érintheti csak az adott felhasználót, vagy minden felhasználót. Erről a csapatot lehet majd értesíteni emailen keresztül. Hiba legkönnyebben a botok programkódjában lehet, de a játék bármely részét érintheti.

## 6. Teljesítmény

Egy kártyajátékról lévén szó, a programunknak nem lesz magas hardverigénye. Mivel a program nem használ 3D grafikát, az 1080p felbontáson 60 fps-sel való futás a kitűzött cél, amely gyenge hardver mellet sem lesz nehezen elérhető.

### A játék hardverigénye

- Processzor: Intel Core 2 Qaud Q9550 | AMD Phenom II X4 945 vagy jobb
- Memória: 4 GB
- Grafika: NVIDIA GeForce GTS 450 | AMD Radeon HD 5670 vagy jobb
- DirectX: 9.0
- Hálózat: Stabil internetkapcsolat (20 Mbps)
- Tárhely: 3 GB
- Támogatott operációs rendszer: Windows 10

### A szerver erőforrásai

A szerver erőforrásai előre meghatározottak, viszont a játékosszámmal majd arányosan növekednek, az általános túlterhelések és lefagyások elkerülése végett. A szerver saját szerver lesz, viszont szerverparkban lesz elhelyezve az optimális működés, a nagy sávszélesség és a nagy sebességű stabil internetkapcsolat érdekében.

## 7. Támogatottság

Célunk a szoftver folyamatos fejlesztése és karbantartása.  Ennek érdekében a fejlesztő csapatunk rendszeresen figyelni fogja a játék fórumát és bizonyos időközönként különböző analitikai szoftverekkel fogjuk majd ellenőrizni a programot.

Annak érdekében, hogy az esetleges fellépő hibákat adott esetben a felhasználók is azonosítani tudják, a játék elindulásakor automatikusan létrejön majd egy RuntimeInformation.txt fájl, amely a futásteljesítményt és a játék közben végbemenő folyamatokat fogja majd naplózni, többek között azt is, ha valamilyen hiba lép fel a játék közben. Ebben az esetben a hibáról ezt a fájlt megnyitva tudunk majd információkat gyűjteni, amelyek a felhasználók segítségére is lehetnek majd a hiba megoldásában, de velünk is megoszthatják majd a fórumon, ahol más felhasználók is tudnak nekik segíteni, de természetesen mi is figyelembe vesszük ezeket az üzeneteket és könnyebben ki tudjuk javítani a hibákat. Ezeket a javításokat frissítések alkalmával fogjuk majd alkalmazni a játékban.

A jövőben szeretnénk egy visszajelző rendszerrel is a játékot, amely által a játékosok közvetlenül a játékon belül tudnak majd nekünk visszajelzést küldeni esetleges hibákról, csalókról vagy véleményüket is megoszthatják a játékkal kapcsolatban, ezáltal elősegítve a további fejlesztéseket.


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

A program dokumentációja a korábbi vízió dokumentumban és ebben az SRS dokumentumban találhatók meg. Ezeket a dokumentumokat feltöltöttük GitHubra, ahonnan linken keresztül elérhetőek.

Elsődleges Help rendszerként a fórum fog működni. Felhasználók itt megoszthatják a többi felhasználóval, a játékkal kapcsolatos hibákat, észrevételeiket. Azonban, ha valaki nem szeretne a fórumba írni akkor, akár a korábbi bejegyzések közül is kereshetnek megoldást a problémájukra.

A jövőben a fórumon közzétett bejegyzéseket szeretnénk különböző csoportokba (topic-okba) rendezni ezáltal az elősegítve, hogy az ismétlődő problémákra könnyebben megoldást találjanak a felhasználók, valamint hogyha a megfelelő topic-ba írnak bejegyzést, akkor általában sokkal gyorsabb és sokkal jobb választ kaphatnak.

Természetesen a játék első elindításakor működésbe lép majd egy súgó, ami segít minket a játékon belüli navigálásban és bemutatja a program működését. Miután a „súgó” összes lépését végig néztük, bezárja magát és a következő induláskor már nem fog automatikusan megjelenni. Természetesen a súgó manuálisan is elérhető lesz majd a menüben, így ha valaki azt választja, akkor ismét végig nézheti a lépéseket az elejétől a végéig.

A játékmenet megismerése érdekében külön „Tutorial” opciót adtunk hozzá a játékhoz. Ezen belül a játékos ki tudja majd próbálni a játékmenetet egy előre megírt bot ellen, amely arra törekszik majd, hogy a játékmenet összes lehetséges opcióját, akcióját bemutassa majd és ezek mellett természetesen tanácsokkal lássa el a többi játékost. A "Tutorial" a menüből egyértelműen többször is elérhető lesz majd .

## 10. Felhasznált kész komponensek

-	Fejlesztés: Eclipse IDE (Java nyelven)
-	Grafiaki elemek: JavaFX (17) könyvtár, Adobe Photoshop
-	Adatbázis: MySQL
-	Hangeffektek: Ableton Live
-	Dokumentáció : GitHub, Visual Studio Code, Notepad++
-	A játék forgalmazása és fórum: Steam
-	Ezekmellett természetesen rengeteg hasznát vettük az intetnetnek azonban SOSEM másolás céljából. Pusztán csak azért hogy ihletet merítsünk, új dolgokat tanuljunk meg és ezáltál       gördülékenyebbé tegyük a fejlesztést.

## 11. Interfészek
A szoftverünk grafikus felhasználói felülettel fog rendelkezni és csak a szükséges interfacek lesznek definiálva.
### 11.1. Felhasználói interfészek
A felhasználói interface az az interface amin keresztül a játékos kommunikál a szoftverrel, és kezeli azt.
jellemzői:
* Könnyen kezelhető
* Egységes téma és stílus
* Gyorsan tanulható

Illetve itt jelenik meg a „Play”, „Invite”, Beállítások, Kilépés, Áruház illetve meg fog jelleni a menüben a felhasználó neve és a profilképe.    
### 11.2. Hardware interfészek
Az alkalmazásunk fútatásához szükséges egy számítógép, de mivel manapság már majdnem minden háztartásban van legalább egy számítógép.
Ezért nem nehéz egy hardware interfészt szerezni. Mivel a játék nem nagy az erőforrás igénye ezért mindenki számára elérhető.
### 11.3. Software interfészek
Ez az az interface ami ahoz szükséges hogy a szoftver más szoftverekkel együtt tudjon működni.
A fútatáshoz a tervek szerint Java SE 16 fogunk használni. És ezért is lényeges ez az interface a mi esetünkben mivel a szoftver működéséhez kell a JVM.
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
Az alkalmazásunkat 2 betartandó szabványra bontottuk, hogy a programot hosszú távon fejleszthetővé tudjuk tenni. A program Java nyelven íródik emelet pedig az adatokat egy 
adatbázisból nyerjük ki amit a JavaFX könyvtár segítségével fogjuk megmutatni a felhasználónak és ezzel a felülettel lesz képes interaktálni. Ezeket a kulcs tényeket vettük
figyelembe mikor kijelöltük a betartandó szabványokat.
### 12.1. Kötelezően alkalmazandó szabványok
1992. évi LXIII. törvény – a személyes adatok védelméről és a közérdekű adatok nyilvánosságáról
2001. évi CVIII. törvény – az elektronikus kereskedelmi szolgáltatások, valamint az információs társadalommal összefüggő szolgáltatások egyes kérdéseiről
2011. évi CXII. törvény - az információs önrendelkezési jogról és az információszabadságról
### 12.2. Választás alapján alkalmazott szabványok
**OOP**:
Az Objektum-Orientált Programozásra azért van szükségünk mivel a program egyszerre több funkciót fog ellátni és átláthatatlanná válna a kód bázisunk, ha megpróbálnak csak egy fájlba megírni az egészet. Másfelől a későbbi fejlesztést is megnehezítené ha nem szednénk szét a kódot mert:

* A meglévő kódunk túl nagy lenne ami kavarodást okozhatna.
* Funkcionálisan el fogjuk tudni különíteni a program elemeit
* Ha egy új fejlesztő kapcsolódik a projektbe akkor neki így átláthatóbbá tudjuk tenni és hamarabb meg tudjaérteni a különbőző osztályok müködésének az elvét.
* Az MVC szabványt nélküle nem tudnánk alkalmazni

**MVC**:
A programunkat úgy szeretnénk megírni, hogy a felület amit lát a felhasználó és azt ott folyó műveletek csak “részben” férjenek hozzá a felhasznált adatokhoz. Ezért fogjuk alkalmazni a Model-View-Controller Szabványt/Mintát (későbbiekben csak MVC ként fogunk rá hivatkozni) mert szeretnénk biztosítani egy védelmi réteget a programon belül és ezzel a szabvánnyal később egyszerűbben fogjuk tudni szerkeszteni a programunkat.

A View itt a felhasználó által látott felületett értjük, a Controller osztály a felületen végbemenő interakciót hivatott lekzeleni és képes a modell osztállyal kommunikálni de elemeihez csak közvetett módon férhet hozzá. Ez azért hasznos mert a ha valamilyen változás/hiba történik az adatokban azaz a model osztály részben akkor egyszerűen csak a Modell osztályokon kell javítani ezzel pedig azt tudjuk biztosítani, hogy a Controller osztályokban nem kell újra írni a kódot mivel nem ő érte a felelős, hogy adatot biztosítson, ő csak ezt az adatot felhasználja.

Ezen kívül a programon több ember is dolgozik egyszerre és ezzel a szabvánnyal egyszerűbb elkülöníteni a komponenseket, mert amíg a csapat egyik része tud zökkenőmentesen dolgozni a Grafikus felületen (Views), a csapat másik fele képes dolgozni a Hátterét szolgáló kódon (Models) egyazon időben. 

## 13. Mellékletek

* A Fröccs játékszabályai: http://jatekdij.hu/tartalom/tarsasjatek/Froccs.pdf

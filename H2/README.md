# H2 - Vízió dokumentum

## Gyakorlatvezető: Krizsán Zoltán

## FröccsÖntők - Csapattagok
Név|Neptunkód|Email|Feladat
:-----:|:-----:|:-----:|:-----:
Juhász Ákos|F58KQ8|juhaszakos7@gmail.com|játékfejlesztő, grafikus
Szűcs Attila|DJA75O|sz.attila0317@gmail.com|játékfejlesztő, dokumentáció
Molnár Balázs|KFIXBJ|molbazsa@gmail.com|játékfejlesztő, dokumentáció
Takács Bálint|P2GNFT|takacsb39@gmail.com|játékfejlesztő, prezentáló
Slyízs István Gábor|HVM06X|slyizsistvangabor@gmail.com|csapatkapitány, játékfejlesztő

## Tartalomjegyzék
1. [Bevezetés](#sec_1)

2. [Az alkalmazás helye](#sec_2)

    2.2. [A probléma megfogalmazása](#sec_2_2)

    2.3. [Az elkészült termék helye](#sec_2_3)

3. [Érintettek és felhasználók](#sec_3)

    3.3 [Felhasználói környezet](#sec_3_3)

4. [A végtermék áttekintése](#sec_4)

    4.2. [A termék használatának előnyei](#sec_4_2)

    4.3. [Feltételezések és függőségek](#sec_4_3)

5. [A végtermék jellemzői, biztosított szolgáltatások](#sec_5)

<!-- -->
7. [Minőségi elvárások](#sec_7)

<!-- -->
9. [Kockázat lista](#sec_9)

10. [Szótár](#sec_10)

## <a name="sec_1"></a>1. Bevezetés
A projektünk célja a Fröccs nevű kártyajáték megalkotása digitális formában.

A játékmenet a társasjáték szabályait fogja követni, a játékosok különböző karaktereket magukra öltve vesznek majd részt a játékban. A játékosok rendelkezni fognak játékosnévvel, eredményeiket szintjük és egy rangsor fogja nyilvátartani. Játékunk a több játékos (más felhasználók elleni) és az egy játékos (botok elleni) játékmódot is támogatni fogja.

A több játékos módhoz Internet-kapcsolatra lesz szükség, az egy játékos mód offline is használható lesz.

Az alábbiakban részletezzük magát a játékszoftvert, az azzal kapcsolatos minőségi és egyéb elvárásokat és a szoftver képességeit, tulajdonságait. Megvizsgáljuk, hogy a szoftvert ki használná, kik lennének az értintettek és kik tartanák fent a játékot mint szolgáltatást. A projekttel kapcsolatban leírjuk, hogy hol helyezhetnénk el a szoftvert, mire alapozzuk a szoftver életképességét, mik a kockázatok és mik a dokumentációval kapcsolatos elvárások.

## <a name="sec_2"></a>2. Az alkalmazás helye

### 2.1 Üzleti lehetőségek
Nincs információ.

### <a name="sec_2_2"></a>2.2. A probléma megfogalmazása
A FröccsÖntők csapata a Fröccs nevezetű társasjáték, online verziójával szeretné növelni a már ismert és népszerű társasjáték elérhetőségét felhasználói körökben.<br /> <br />
#### A játékról röviden: 
A játékosok - akiknek száma 2-6-ig terjedhet – egymás ellen, különféle fröccsök készítésével és eladásával, karaktereik képességeinek kihasználásával próbálnak a lehető legnagyobb profitra szert tenni. Eközben egymást hátráltatják különféle bűntető lapokkal és az említett lapok kivédésével. A játék végén az nyer, akinek a lehető legtöbb pénzre sikerült szert tennie.<br /><br />
Egy játékmenet kb. 35 percet vesz igénybe, ez egyben, szünet nélkül megy végbe. A játék 14 éves kortól felfelé bárki által játszható. Minde játékmenet végén az első és második helyezet jutalomponntokban részesül és ezekből virtuális kiegészítőket vehetnek az ajándékboltban. Továbbá a folyamotos fejlődés közben új karaktereket nyílnak meg új képességekkel, melyek akár előnyt is jelenthenek bizonyos játékmenetekben. A napiszinten viszatérő játékosokat természetesen különleges napi ajándékokkal jutalmazzuk majd. A játék kizárólag egyéni, de különféle alkukkal nem hivatalos „csapatok” is kialakulhatnak.<br /><br />

#### A játékszabály: 
Minden játékos egy 2 és egy 3 dl-es pohárral és 5 kártyával kezd, melyeket csak saját maguk látnak. Ezt követően körönként minden játékosnak 2 akciója van. 
Az akciók lehetnek: 
- már kész fröccsök eladása – ezt kizárólag első akcióként lehet 
- 2 kártya felhúzása – ez akár mind 2 akcióban is használható, így akár egy körben 4 kártyát is felhúzhat egy játékos
-  2 kártya kijátszása – ez lehet szóda/bor pohárba töltése vagy akár szivatós kártyák lerakása(a bor és szódakártyák 1-1 dl-es egységeket képeznek és deciliterenként 1 kártyának számítanak)
-   pohár vétele az éppen felfordított 3 pohár közül melyeket a vétel után pótolni kell a lefordított pohár pakliból – akciónként 1 pohár vásárolható. 
Fontos megjegyezni a szivatós kártyák terén, hogy egy játékost se lehet lenullázni, így amikor egy játékosnak nincs pénze és csak 1 pohara van, az a pohár nem törhető össze. A szivatós kártyák kivédhetők az „Ezt neked!” kártyákkal, amelyek semmissé teszik azok hatásait. 1 „Ezt neked!” kártya 1 szivatós kártyát semlegesít, így értelemszerűen 2 szivatós kártyát csak 2 „Ezt neked!” kártyával lehet kivédeni. Ha ezek után is szorul a hurok, akkor lép életbe az alkukötés. Ez igazából bármi lehet, a játékosok megegyezhetnek pénzösszegben, borban vagy szódában, vagy akár pohárban is. A játék elején a játékosok megállapodnak, hogy az alkukban ígértek betartása kötelező-e és a későbbiekben ehhez kell tartaniuk magukat. <br />
Ha a húzópakliból minden kártya elfogy, akkor a dobópakli megkeverésével egy új húzópakli jön létre és kezdetét veszi az utolsó kör. Ebben a körben lehetőség van a még el nem készült fröccsök befejezésére vagy eladására, vagy akár szivatós kártyák kijátszására. Az utolsó kört követően, minden játékos pénze megszámlálásra kerül és minden el nem adott, de kész fröccsért további 20 Ft és minden nem üres pohárért 10 Ft adódik hozzá a játékos vagyonához. A játékot az nyeri akinek a legtöbb pénze van.<br /><br />
#### A problémák és azok megoldásai: 
Mivel a játékpiacon rengeteg népszerűbb és könnyebben tanulható, egyszerű társasjáték is jelen van digitális formában, így játékunk népszerűsítéséhez fontos a karbantartás és korszerűsítés, melyeket a visszajelzések alapján és azok elemzését követően folyamatos frissítésekkel fogunk kivitelezni, amelyek minden aktuális hibajavítást tartalmazni fognak. <br /><br />
Fontos szempont a játék válaszidejének folyamatos növelése és megbízhatóságának javítása, amely elősegíti majd a felhasználói kör bővülését és ezzel növeli majd a visszajelzések számát és a profit összegét, elősegítve a további optimalizálásokat, és így öngerjesztő folyamatként segíti majd a játék jobbnál jobb verzióinak létrejöttét és népszerűsítését. <br /><br />
Továbbá fontos még a piacon maradáshoz a felhasználóknak tetsző játékélmény létrejötte melyet látványos, de költséghatékony megoldásokkal fogunk kivitelezni. Mint például a kártyák és karakterek képregény stílusú dizájnjaival és a menü rendszer ehhez hasonló megjelenésével, valamint egyszerű, de mégis látványos animációkkal. <br /><br />
A felhasználói kör bővülésének egyik elengedhetetlen és kulcsfontosságú része a már „meghódított” felhasználók érdeklődésének megtartása, mellyel a népszerűség növekedésének léptéke exponenciálisan megnőhet. Ezt egy a játékban található ajándékbolttal szeretnénk megvalósítani, melyben a játékosok a játékok után kapott pontokkal vásárolhatnak majd különféle csupán vizuális hatású kiegészítőket.<br /><br />
A játék elsősorban Microsoft Windows operációs rendszerre készül, de később szeretnénk bővíteni az elérhetőségét Android, IOS, MacOS és Linux rendszerű számítógépeken és mobil eszközökön is. Így a Steames megjelenést követően meg fog jelenni a Google Playen, az App Storeban és természetesen online felületen is.

### <a name="sec_2_3"></a>2.3 Az elkészült termék helye
Kinek készült (melyik / milyen szervezetnek):
A majd elkészült Fröccs játék implementációját elsősorban a legjelentősebb és legelterjedtebb online játékáruház keretein belül, a Steam online áruházban tervezzük terjeszteni. Az itteni terjesztés széleskörben képes lesz eljuttatni a kész terméket a felhasználókhoz világszerte.

Ki fogja használni:
Az általunk priorizált célközönség a 14 – 40–es korosztály lenne. Ez a célközönség értékelhetné legjobban a játék humorát és annak egyszerű, de mégis fondorlatos játékélményét. Ebben a korcsoportba beletartozik a 18 – 24 éves korosztály is, ami sok kutatás szerint magába foglalja a videó játékokkal foglalkozó emberek legnagyobb részét. A játék alapvető témája és az alkohol gyakori említése miatt a legfiatalabb korosztálynak nem feltétlenül lesz megfelelő a Fröccs játék használata.

Milyen alkalmazás kategóriába tartozik (pl. fejlesztőeszköz, vállalati információs rendszer, stb.):
Az alkalmazás a játékszoftver kategóriában helyezkedik el. A játékszoftverek piaca folyamatosan növekszik, és rengeteg lehetőséget illetve magas bevételt hordoz magával. 2020-ban a komplett videójáték-piac értékét több, mint 1.59 billió amerikai dollárra becsülték. A Fröccsöntők csapata ezt a piacot tervezi megcélozni az új játékszoftver létrehozásával. 

Mi az alapvető haszna:
Az alkalmazást igénybevevő felhasználók számára nyugtató, relaxációs időtöltésként használható. Illetve a játék egy plusz kihívást, tanulási lehetőséget szolgáltat, annak fejlett stratégiai játékélményével. A program a szociális készségek fejlődésében is segítheti a felhasználót, hiszen a játék elengedhetetlen része a többi játékossal való érintkezés és tárgyalás.

Milyen alternatívák lehetnek a fejlesztésen kívül (meglevő más rendszer, másféle megoldás, ezek előnyei, hátrányai):
Alapvető terjesztési célként a Steam online áruházat céloztuk meg. Ezáltal is elkötelezve a projektet az asztali számítógépeken való használat mellett. Csoportunk tisztában van a Google Play (Android) és az App Store (IOS) alapú terjesztés lehetőségével is. Ezeknek a felületeknek is jelentős vásárlói és követői közössége van, de arra jutottunk, hogy az alkalmazás lehető legjobb játékélményhez elengedhetetlen az asztali számítógépek környezete. A Fröccs játék első kiadását követően, a játék deputálásáról bejövő információk alapján még az imént említett platformokra való kiterjesztése sem lehetetlen. 

Miben különbözik alapvetően az elkészült termék az alternatíváktól:
A Fröccshöz hasonlóan rengeteg online kártya és társasjáték létezik a világon. Gondolhatunk itt Hearthstonera, Yu-gi-ohra vagy az egyszerűbb Uno virtuális változatára is. A Hearthstonehoz hasonló alkalmazások a játékélmény mellett a kártyák megszerzésének is nagy szerepet tulajdonítanak. Ezt a játékban eltöltött idővel vagy gyakrabban online tranzakciókkal próbálják implementálni. A fröccs játéknál viszont fontosnak tartjuk, hogy a felhasználó az alap játék minden részéhez alapból hozzáférjenek, ezáltal már a kezdetektől teljes játékélményben legyen része a felhasználóknak. Illetve a hasonló alternatíváknál gyakori az egy az egy elleni játékmenet használata, viszont mi megpróbáljuk az eredeti társasjátékot minél pontosabban előhozni az implementáció során. Ezáltal egy játékmenet akár 3 – 6 játékos számára is elérhető lesz egyszerre.

## <a name="sec_3"></a>3. Érintettek és felhasználók

### 3.1. Az érintettek összefoglalása
Nincs információ.

### 3.2. A felhasználók összefoglalása
Nincs információ.

### <a name="sec_3_3"></a>3.3 Felhasználói környezet
Az alkalmazás fejlesztése kizárólag Windows operációs rendszerre fog megtörténni és emellett a futtatás követelménye pedig, hogy eleget tegyünk a rendszerkövetelményeknek. A jövőben a szoftverre kiadott frissítések miatt ezek a követelmények minimálisan változhatnak.

A szoftverben lehetőségünk lesz majd egymás ellen partikat létrehozni mind lokálisan, mind online. Lokálisan egyszerre egymás ellen két felhasználó játszthat majd, azonban a játékban lehetőségünk lesz majd több (különböző nevű) felhasználót is létrehozni ezekalapján pedig a játék lokális ranglistát vezet majd az eddig megadott felhasználók eredményei alapján. A lokálisan 15 felhasználó adatainak a nyilvántartására lesz majd lehetőségünk. Abban az esetben ha online szeretnénk játszani akkor ezt Steam felhasználókkal tudjuk majd megtenni. Várhatóan kezdetben átlagosan 1000-2000 felhasználó fogja majd használni a szoftvert egy időben, és maximálisan 5000-7000 felhasználóra számítunk. 

A jelenlegi időszakban várhatóan növekedni fog a felhasználók száma, ha a COVID-19 járvány újabb hulláma miatt az emberek újra home office-ba is karantánba kényszerülnek.
Várhatóan egy felhasználó egyszerre nagyjából 1-2 óráig fogja használni a szoftvert azonban, ez az idő változhat különböző körülmények hatására (pl.: Ha több fős tarsaságban használják a szoftvert és így egymás ellen több partit is lejátszanak a felhasználók). Különböző frissítésekkel arra törekszünk majd, hogy a felhasználók hosszútávon is minél tovább használják a szoftvert.

A rendszerkövetelményeknek nem lesz része semmilyen különleges, egyedi eszköz használata. A szoftverben való navigálást és irányítást billenytűzettel és egérrel tudjuk majd végrehajtani. A szoftver aktiválásakor és telepítésekor, valamint online partik esetén is szükségünk lesz aktív internet kapcsolatra. Lokális, offline partik esetén internet kapcsolat nélkül is futtatható lesz majd a szoftver. Mivel a termék a Steam webárúházában lesz majd elérhető ezért szükséges lesz majd a szoftvert a Steam App-al integrálni.

### 3.4. Illetékesek adatai
Nincs információ.

### 3.5. Felhasználók adatai
Nincs információ.

## <a name="sec_4"></a>4. A végtermék áttekintése

### 4.1 A termék kapcsolatai
Nincs információ.

### <a name="sec_4_2"></a>4.2. A termék használatának előnyei
<p>
    Használati előnyök amit a termék biztosít:
    <ul>
        <li> Ez a Játék tökéletesen alkalmas arra, ha az embernek van szabad ideje, akkor le játsszon pár mecset. </li>
        <li> Hogyha barátainkkal vagy egyedül szeretnénk játszani, akkor egy tartalmas és mókás elfoglaltság lehet. </li>
        <li> Amennyiben úgy ülünk le játszani gép elé, hogy nincs sok időnk, ez a játék megfelelő választás hisz a leghosszabb kör is maximum 30 percig tart. </li>
        <li> A játékot az egyik leghíresebb játék terjesztési platformon a Steam-en lehet elérni. </li>
        <li> Ezzel a játékkal mindenki tud játszani mivel, nincs nagy hardveres követelménye. </li>
    </ul>
</p>

### <a name="sec_4_3"></a>4.3. Feltételezések és függőségek

A több játékos módhoz Internet-kapcsolatra lesz szükség, hogy elérhető legyen a többi játékos. Mivel egy kártyajátékról van szó, rövidebb ideig nem okoz problémát a kapcsolat hiánya. Ha egy kimaradás után visszatér a hálózati kapcsolat, a többi játékos lépéseit könnyedén szinkronizálhatjuk az újra csatlakozott klienssel. Ha egy játékosnak egy adott pillanatban nincs kapcsolata, minden játékos felé egy ikonnal lesz jelezve. Ha a kapcsolat 45 másodperc alatt nem jön újra létre, akkor a többi játékosnak egy felugró ablakban felajánljuk, hogy befejezzék a játékot, vagy tovább várakozzanak. A játékosok természetesen a 45 másodperc alatt is kiléphetnek a menü segítségével.

A játékosnév és fiók létrehozása lehetséges lesz email-cím segítségével, illetve Google- vagy Facebook-fiókkal. Ennek működése függ a Google és Facebook szervereinek elérhetőségétől, ezért ezekre csak regisztrációkor lesz szükség, a regisztrációt követően egy játékosnév és jelszó párossal mindig be lehet majd jelentkezni, feltéve, hogy a mi szerverünk elérhető.

A játékosok kapcsolódása egy szerver segítségével lesz megvalósítva, ennek megoldása egy szerver-bérlő szolgáltatás segítségével történne (pl. linode, AWS, Microsoft Azure). A játékunk így függ a szolgáltató elérhetőségétől.

Hogy minden játékos számára elérhetőek legyenek az esetleg utólag hozzáadott funkciók, illetve javítások, a több játékos módban feltételezzük, hogy minden játékos a legfrisseb verzióval rendelkezik. Ezt a játék minden induláskor ellenőrizni fogja, amennyiben a játékos rendelkezik Internet-kapcsolattal.

Feltételezzük, hogy a játékos rendelkezik a minimális hardverkövetelményekkel. Abban az esetben, ha nincs inkompatibilitás, csak lassabb hardverrel rendelkezik a felhasználó, a játék megpróbál majd elindulni, de a megfelelő játékélményt nem tudjuk garantálni.

A játékszabályok ismeretét is feltételezzük, a szabályok elérhetőek lesznek a menüben.

### 4.4 Költségbecslés
Becsléseink alapján a játék elkészítése nagyjából 6.250.000Ft-ba fog kerülni, amely a tervezett 9.99€-s árral az 1737. vásárlótól profitot termel és ha már a digitális kártyajátékok királyának, az UNO letöltéseinek 1%-át elérjük, akkor is a befektetett pénz ezerszeresét kapjuk vissza profitként, ami az említett 1% azaz 1.800.000 letöltés után, nem más, mint 6.480.000.000Ft.

### 4.5. Installáció
Nincs információ.

## <a name="sec_5"></a>5. A végtermék jellemzői, biztosított szolgáltatások

Célunk, hogy a fejlesztés ideje alatt a játékban minden esetleges hibát ki tudjunk küszöbölni és a megjelenéskor hibátlan, teljes és a lehető legjobban optimalizált állapotban bocsátsuk a felhasználók rendelkezésére.

A játék megjelenéskor a Steam áruházában lesz majd elérhető ezért a játék megvásárlásához és eléréséhez Steam felhasználói fiókra lesz majd szükségünk. Ebből eredően a játék fizikai formában nem fog megjelenni, kizárólag digitális termékkulcs formájában. Amint a birtokunkba kerül a játék a Steam fiókunk könyvtárából tudjuk majd elérni. Telepítés után ikonokat hozhatunk majd létre a számítógépen amikre rákattintva egyenesen a Steam könyvtárában találjuk majd magunkat ahonnan automatikusan indul majd a játék.

A játék elindulásakor egyből a menüben táljuk majd magunkat ahol lehetőségünk lesz majd a beállításokat megváltoztatni (Nyelv, Hangerő, Felbontás, Billenytűkiosztások). Itt találjuk majd a rangsort is, ami az eddig megadott felhasználókat (akiket egyedi neveik alapján különböztet meg a program) rangsorolja a program az eddigi eredményeik alapján (maximum 15 felhasználó). A menüből elérhető lesz majd egy áruház is, ahol a partik után szerzett virtuális zsetonokért tudunk majd vizuális kiegészítőket venni a játékhoz.
Úgy gondoljuk, hogy a felhasználók szemszögéből a legfontosabb a játékmenet lesz majd, ezért a fejlesztés során ez élvezi majd a legnagyobb prioritást. Játékra három módon lesz majd lehetőség. Lokálisan (nem szükséges aktív internet kapcsolat), a „Local Matchmaking”-et  választva ilyenkor egy számítógépről tudunk majd ketten játszani egyszerre, a két játékosnak különböző billentyűkiosztások állnak majd a rendelkezésükre annak érdekében, hogy a játékot mindkét fél zavartalanul tudja majd irányítani, azonban a szoftver képes lesz majd egyszerre 15 felhasználó eredményeit eltárolni. Emellett lehetőségünk lesz majd online partik létrehozására (ehhez szükséges lesz aktív internet kapcsolat), mivel a játék Steam-en lesz majd elérhető, ezért partikat tudunk majd létrehozni Steam-es barátainkkal a „Play with a Friend” opciót választva, de lesz lehetőségünk „Random Matchmaking”-re is amikor egyéb Steam felhasználók ellen tudunk majd játszani akik szintén ezt az opciót választották. Végül lehetőségünk lesz majd egyedül is játszani a „Play against Bot” opciót választva, ilyenkor előre beprogramozott Botok ellen tudunk majd játszani (nem szükséges aktív internet kapcsolat), ilyen Botok több különböző nehézségi fokozatban léteznek majd a játékban.

A játék hangeffekteket is tartalmaz majd ezért ajánlott lesz majd hangszóró vagy fej/fülhallgató használata. A játékban billentyűzettel és egérrel tudunk majd navigálni, irányítani és különböző akciókat végrehajtani.

A jövőben érkező frissítéseket, javításokat szintén a Steam-en keresztül tudjuk majd elérni és letölteni. A Steamen belül elérhető lesz majd egy saját fórum is ahol a felhasználók kérdéseket tehetnek fel és észrevételeiket is megoszthatják a játékkal kapcsolatban, amiket mi fejlesztők figyelembe veszünk és adott esettben válaszolunk is majd. Itt arra is lehetőségük lesz majd a felhasználóknak, hogy egy saját közösséget hozzanak létre.

A jövőben tervezzük a játék portolását IOS és Android operációs rendszerekre is. Ezek a verziók valószínűleg AppStore-ból és a Google Play-ből lesznek majd elérhetőek.


## 6. Korlátozások
Nincs információ.

## <a name="sec_7"></a>7. Minőségi elvárások
- A játékot első sorban Microsoft Windows operációs rendszerre tervezzük, de mivel a későbbiekben szeretnénk Android és IOS operációs rendszerekre kiadni, így fontos szempont, hogy a játéknak kicsi legyen az erőforrás igénye.
- A játéknak képesnek kell lennie kezelni az operációs rendszer különbségekből adódó problémákat.
- Fontos szempont még, hogy a játéknak tökéletesen, hibák nélkül kell futnia.
- A játék válaszidejének a lehető legalacsonyabbnak kell lennie.
- Az animációkban nem lehetnek akadások. mindennek tökéletesen kell végigfutnia.
- A játéknak képesnek kell lennie kezelni az internet kapcsolat megszűnését is, és erről értesíteni kell a felhasználót.
- A játék képes kell legyen az esetlegesen felmerülő problémák javítására.
- A BOToknak be kell tartaniuk a játékszabályt, és annak megfelelően kell meghozni döntéseiket.
- A menünek letisztultnak és egyértelműnek kell lennie, hogy bárki számára értelmezhető legyen.
- Legyen képes használni és megjeleníteni a felhasználó által vásárolt vizuális termékeket.
- A játéknak a lehető legkisebb adatforgalommal kell a legjobb teljesítményt nyújtania.


## 8. Dokumentációkkal kapcsolatos követelmények
Nincs információ.

## <a name="sec_9"></a>9. Kockázat lista

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

## <a name="sec_10"></a>10. Szótár

- Eclipse: Egy programozást segítő fejlesztőkörnyezet. Leggyakrabban JAVA-hoz használt fejlesztői környezet. Részei többek között: Java IDE, a Java Development Toolkit (JDT) és fordító (ECJ).

- Notepad++: Egy alapvetően windowsra tervezett. Szöveg- illetve forráskódszerkesztő program. Az alkalmazás többek között támogat: Java, C, C++, C#, Python nyelveket is.

- VisualStudio code: Egy Microsoft által fejlesztett kódszerkesztő. 

- Adobe Photoshop: Az Adobe Systems által kifejlesztett rasztergrafika alapú képszerkesztő program. 

- Ableton Live 10 lite: Zene és hangtechnikai szerkesztő program. Szerkesztés mellett hang- és zenefelvételt is támogat.

- Software/szoftver: A  szoftver alatt a legszűkebb értelemben elektronikus adatfeldolgozó berendezések memóriájában elhelyezkedő, azokat működtető programokat értünk.

- Steam: Egy felhő alapú online számítógépes szoftverek (túlnyomórészt játékok) részére készített könyvtár illetve áruház.

- Implementálás: Kivitelezés vagy megvalósítás.

- Offline: Hálózathoz nem kapcsolódó. Leggyakrabban az internethez való kapcsolódásra értik.

- Online: Hálózathoz kapcsolódó. Leggyakrabban az internethez való kapcsolódásra értik.

- Kliens, szerver: A kliens olyan számítógép vagy azon futó program, amely hozzáfér egy (távoli) szolgáltatáshoz, amelyet egy számítógép hálózathoz tartozó másik számítógép (a szerver) nyújt.

- Bot: Számítógép által vezérelt játékos karakter.

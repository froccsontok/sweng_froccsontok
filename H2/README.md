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

## 1. Bevezetés
A projektünk célja a Fröccs nevű kártyajáték megalkotása digitális formában.

A játékmenet a társasjáték szabályait fogja követni, a játékosok különböző karaktereket magukra öltve vesznek majd részt a játékban. A játékosok rendelkezni fognak játékosnévvel, eredményeiket szintjük és egy rangsor fogja nyilvátartani. Játékunk a több játékos (más felhasználók elleni) és az egy játékos (botok elleni) játékmódot is támogatni fogja.

A több játékos módhoz Internet-kapcsolatra lesz szükség, az egy játékos mód offline is használható lesz.

Az alábbiakban részletezzük magát a játékszoftvert, az azzal kapcsolatos minőségi és egyéb elvárásokat és a szoftver képességeit, tulajdonságait. Megvizsgáljuk, hogy a szoftvert ki használná, kik lennének az értintettek és kik tartanák fent a játékot mint szolgáltatást. A projekttel kapcsolatban leírjuk, hogy hol helyezhetnénk el a szoftvert, mire alapozzuk a szoftver életképességét, mik a kockázatok és mik a dokumentációval kapcsolatos elvárások.

## 2. Az alkalmazás helye
### 2.2. A probléma megfogalmazása
A FröccsÖntők csapata a Fröccs nevezetű társasjáték, online verziójával szeretné növelni a már ismert és népszerű társasjáték elérhetőségét felhasználói körökben.<br /> <br />
#### A játékról röviden: 
A játékosok - akiknek száma 2-6-ig terjedhet – egymás ellen, különféle fröccsök készítésével és eladásával, karaktereik képességeinek kihasználásával próbálnak a lehető legnagyobb profitra szert tenni. Eközben egymást hátráltatják különféle bűntető lapokkal és az említett lapok kivédésével. A játék végén az nyer, akinek a lehető legtöbb pénzre sikerült szert tennie.<br /><br />
Egy játékmenet kb. 35 percet vesz igénybe. A játék 14 éves kortól felfelé játszható.<br /><br />
#### A játékszabály: 
Minden játékos egy 2 és egy 3 dl-es pohárral és 5 kártyával kezd, melyeket csak saját maguk látnak. Ezt követően körönként minden játékosnak 2 akciója van. Az akciók lehetnek: már kész fröccsök eladása – ezt kizárólag első akcióként lehet; 2 kártya felhúzása – ez akár mind 2 akcióban is használható, így akár egy körben 4 kártyát is felhúzhat egy játékos; 2 kártya kijátszása – ez lehet szóda/bor pohárba töltése vagy akár szivatós kártyák lerakása(a bor és szódakártyák 1-1 dl-es egységeket képeznek és deciliterenként 1 kártyának számítanak); pohár vétele az éppen felfordított 3 pohár közül melyeket a vétel után pótolni kell a lefordított pohár pakliból – akciónként 1 pohár vásárolható. Fontos megjegyezni a szivatós kártyák terén, hogy egy játékost se lehet lenullázni, így amikor egy játékosnak nincs pénze és csak 1 pohara van, az a pohár nem törhető össze. A szivatós kártyák kivédhetők az „Ezt neked!” kártyákkal, amelyek semmissé teszik azok hatásait. 1 „Ezt neked!” kártya 1 szivatós kártyát semlegesít, így értelemszerűen 2 szivatós kártyát csak 2 „Ezt neked!” kártyával lehet kivédeni. Ha ezek után is szorul a hurok, akkor lép életbe az alkukötés. Ez igazából bármi lehet, a játékosok megegyezhetnek pénzösszegben, borban vagy szódában, vagy akár pohárban is. A játék elején a játékosok megállapodnak, hogy az alkukban ígértek betartása kötelező-e és a későbbiekben ehhez kell tartaniuk magukat. Ha a húzópakliból minden kártya elfogy, akkor a dobópakli megkeverésével egy új húzópakli jön létre és kezdetét veszi az utolsó kör. Ebben a körben lehetőség van a még el nem készült fröccsök befejezésére vagy eladására, vagy akár szivatós kártyák kijátszására. Az utolsó kört követően, minden játékos pénze megszámlálásra kerül és minden el nem adott, de kész fröccsért további 20 Ft és minden nem üres pohárért 10 Ft adódik hozzá a játékos vagyonához. A játékot az nyeri akinek a legtöbb pénze van.<br /><br />
#### A problémák és azok megoldásai: 
Mivel a játékpiacon rengeteg népszerűbb és könnyebben tanulható, egyszerű társasjáték is jelen van digitális formában, így játékunk népszerűsítéséhez fontos a karbantartás és korszerűsítés, melyeket a visszajelzések alapján és azok elemzését követően folyamatos frissítésekkel fogunk kivitelezni, amelyek minden aktuális hibajavítást tartalmazni fognak. <br /><br />
Fontos szempont a játék válaszidejének folyamatos növelése és megbízhatóságának javítása, amely elősegíti majd a felhasználói kör bővülését és ezzel növeli majd a visszajelzések számát és a profit összegét, elősegítve a további optimalizálásokat, és így öngerjesztő folyamatként segíti majd a játék jobbnál jobb verzióinak létrejöttét és népszerűsítését. <br /><br />
Továbbá fontos még a piacon maradáshoz a felhasználóknak tetsző játékélmény létrejötte melyet látványos, de költséghatékony megoldásokkal fogunk kivitelezni. Mint például a kártyák és karakterek képregény stílusú dizájnjaival és a menü rendszer ehhez hasonló megjelenésével, valamint egyszerű, de mégis látványos animációkkal. <br /><br />
A felhasználói kör bővülésének egyik elengedhetetlen és kulcsfontosságú része a már „meghódított” felhasználók érdeklődésének megtartása, mellyel a népszerűség növekedésének léptéke exponenciálisan megnőhet. Ezt egy a játékban található ajándékbolttal szeretnénk megvalósítani, melyben a játékosok a játékok után kapott pontokkal vásárolhatnak majd különféle csupán vizuális hatású kiegészítőket.<br /><br />
A játék elsősorban Microsoft Windows operációs rendszerre készül, de később szeretnénk bővíteni az elérhetőségét Android, IOS, MacOS és Linux rendszerű számítógépeken és mobil eszközökön is. Így a Steames megjelenést követően meg fog jelenni a Google Playen, az App Storeban és természetesen online felületen is.


Kinek készült (melyik / milyen szervezetnek):
A majd elkészült Fröccs játék implementációját elsősorban a legjelentősebb és legelterjedtebb online játékáruház keretein belül, a Steam online áruházban tervezzük terjeszteni. Az itteni terjesztés széleskörben képes lesz eljuttatni a kész terméket a felhasználókhoz világszerte.

Ki fogja használni:
Az általunk priorizált célközönség a 14 – 40 –es korosztály lenne. Ez a célközönség értékelhetné legjobban a játék humorát és annak egyszerű, de mégis fondorlatos játékélményét. Ebben a korcsoportba beletartozik a 18 – 24 éves korosztály is, ami sok kutatás szerint magába foglalja a videó játékokkal foglalkozó emberek legnagyobb részét. A játék alapvető témája és az alkohol gyakori említése miatt a legfiatalabb korosztálynak nem feltétlenül lesz megfelelő a Fröccs játék használata.

Milyen alkalmazás kategóriába tartozik (pl. fejlesztőeszköz, vállalati információs rendszer, stb.):
Az alkalmazás a játékszoftver kategóriában helyezkedik el. A játékszoftverek piaca folyamatosan növekszik, és rengeteg lehetőséget illetve magas bevételt hordoz magával. 2020-ban a komplett videójáték-piac értékét több, mint 1.59 billió amerikai dollárra becsülték. A Fröccsöntők csapata ezt a piacot tervezi megcélozni az új játékszoftver létrehozásával. 

Mi az alapvető haszna:
Az alkalmazást igénybevevő felhasználók számára nyugtató, relaxációs időtöltésként használható. Illetve a játék egy plusz kihívást, tanulási lehetőséget szolgáltat, annak fejlett stratégiai játékélményével. A program a szociális készségek fejlődésében is segítheti a felhasználót, hiszen a játék elengedhetetlen része a többi játékossal való érintkezés és tárgyalás.

Milyen alternatívák lehetnek a fejlesztésen kívül (meglevő más rendszer, másféle megoldás, ezek előnyei, hátrányai):
Alapvető terjesztési célként a Steam online áruházat céloztuk meg. Ezáltal is elkötelezve a projektet az asztali számítógépeken való használat mellett. Csoportunk tisztában van a Google Play (Android) és az App Store (IOS) alapú terjesztés lehetőségével is. Ezeknek a felületeknek is jelentős vásárlói és követői közössége van, de arra jutottunk, hogy az alkalmazás lehető legjobb játékélményhez elengedhetetlen az asztali számítógépek környezete. A Fröccs játék első kiadását követően, a játék deputálásáról bejövő információk alapján még az imént említett platformokra való kiterjesztése sem lehetetlen. 

Miben különbözik alapvetően az elkészült termék az alternatíváktól:
A Fröccshöz hasonlóan rengeteg online kártya és társasjáték létezik a világon. Gondolhatunk itt Hearthstonera, Yu-gi-ohra vagy az egyszerűbb Uno virtuális változatára is. A Hearthstonehoz hasonló alkalmazások a játékélmény mellett a kártyák megszerzésének is nagy szerepet tulajdonítanak. Ezt a játékban eltöltött idővel vagy gyakrabban online tranzakciókkal próbálják implementálni. A fröccs játéknál viszont fontosnak tartjuk, hogy a felhasználó az alap játék minden részéhez alapból hozzáférjenek, ezáltal már a kezdetektől teljes játékélményben legyen része a felhasználóknak. Illetve a hasonló alternatíváknál gyakori az egy az egy elleni játékmenet használata, viszont mi megpróbáljuk az eredeti társasjátékot minél pontosabban előhozni az implementáció során. Ezáltal egy játékmenet akár 3 – 6 játékos számára is elérhető lesz egyszerre.

## 3. Érintettek és felhasználók

### 3.3 Felhasználói környezet
Az alkalmazás fejlesztése kizárólag Windows operációs rendszerre fog megtörténni és emellett a futtatás követelménye pedig, hogy eleget tegyünk a rendszerkövetelményeknek. A jövőben a szoftverre kiadott frissítések miatt ezek a követelmények minimálisan változhatnak.

A szoftverben lehetőségünk lesz majd egymás ellen partikat létrehozni mind lokálisan, mind online. Lokálisan egyszerre egymás ellen két felhasználó játszthat majd, azonban a játékban lehetőségünk lesz majd több (különböző nevű) felhasználót is létrehozni ezekalapján pedig a játék lokális ranglistát vezet majd az eddig megadott felhasználók eredményei alapján. A lokálisan 15 felhasználó adatainak a nyilvántartására lesz majd lehetőségünk. Abban az esetben ha online szeretnénk játszani akkor ezt Steam felhasználókkal tudjuk majd megtenni. Várhatóan kezdetben átlagosan 1000-2000 felhasználó fogja majd használni a szoftvert egy időben, és maximálisan 5000-7000 felhasználóra számítunk. 

A jelenlegi időszakban várhatóan növekedni fog a felhasználók száma, ha a COVID-19 járvány újabb hulláma miatt az emberek újra home office-ba is karantánba kényszerülnek.
Várhatóan egy felhasználó egyszerre nagyjából 1-2 óráig fogja használni a szoftvert azonban, ez az idő változhat különböző körülmények hatására (pl.: Ha több fős tarsaságban használják a szoftvert és így egymás ellen több partit is lejátszanak a felhasználók). Különböző frissítésekkel arra törekszünk majd, hogy a felhasználók hosszútávon is minél tovább használják a szoftvert.

A rendszerkövetelményeknek nem lesz része semmilyen különleges, egyedi eszköz használata. A szoftverben való navigálást és irányítást billenytűzettel és egérrel tudjuk majd végrehajtani. A szoftver aktiválásakor és telepítésekor, valamint online partik esetén is szükségünk lesz aktív internet kapcsolatra. Lokális, offline partik esetén internet kapcsolat nélkül is futtatható lesz majd a szoftver. Mivel a termék a Steam webárúházában lesz majd elérhető ezért szükséges lesz majd a szoftvert a Steam App-al integrálni.

## 4. A végtermék áttekintése

<p> <h1> 4.2. A termék használatának előnyei </h1> </p>
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

## 5. A végtermék jellemzői, biztosított szolgáltatások

## 6. Korlátozások

## 7. Minőségi elvárások
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

## 9. Kockázat lista

## 10. Szótár

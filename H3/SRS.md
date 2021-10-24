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

### 2.2 Legfontosabb funkciók

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

# H2
FröccsÖntők

## 1. Bevezetés

## 2. Az alkalmazás helye

## 3. Érintettek és felhasználók

## 4. A végtermék áttekintése

### 4.3. Feltételezések és függőségek

A több játékos módhoz Internet-kapcsolatra lesz szükség, hogy elérhető legyen a többi játékos. Mivel egy kártyajátékról van szó, rövidebb ideig nem okoz problémát a kapcsolat hiánya. Ha egy kimaradás után visszatér a hálózati kapcsolat, a többi játékos lépéseit könnyedén szinkronizálhatjuk az újra csatlakozott klienssel. Ha egy játékosnak egy adott pillanatban nincs kapcsolata, minden játékos felé egy ikonnal lesz jelezve. Ha a kapcsolat 45 másodperc alatt nem jön újra létre, akkor a többi játékosnak egy felugró ablakban felajánljuk, hogy befejezzék a játékot, vagy tovább várakozzanak. A játékosok természetesen a 45 másodperc alatt is kiléphetnek a menü segítségével.

A játékosnév és fiók létrehozása lehetséges lesz email-cím segítségével, illetve Google- vagy Facebook-fiókkal. Ennek működése függ a Google és Facebook szervereinek elérhetőségétől, ezért ezekre csak regisztrációkor lesz szükség, a regisztrációt követően egy játékosnév és jelszó párossal mindig be lehet majd jelentkezni, feltéve, hogy a mi szerverünk elérhető.

A játékosok kapcsolódása egy szerver segítségével lesz megvalósítva, ennek megoldása egy szerver-bérlő szolgáltatás segítségével történne (pl. linode, AWS, Microsoft Azure). A játékunk így függ a szolgáltató elérhetőségétől.

Hogy minden játékos számára elérhetőek legyenek az esetleg utólag hozzáadott funkciók, illetve javítások, a több játékos módban feltételezzük, hogy minden játékos a legfrisseb verzióval rendelkezik. Ezt a játék minden induláskor ellenőrizni fogja, amennyiben a játékos rendelkezik Internet-kapcsolattal.

Feltételezzük, hogy a játékos rendelkezik a minimális hardverkövetelményekkel. Abban az esetben, ha nincs inkompatibilitás, csak lassabb hardverrel rendelkezik a felhasználó, a játék megpróbál majd elindulni, de a megfelelő játékélményt nem tudjuk garantálni.

## 5. A végtermék jellemzői, biztosított szolgáltatások

## 6. Korlátozások

## 7. Minőségi elvárások

## 8. Dokumentációkkal kapcsolatos követelmények

## 9. Kockázat lista

## 10. Szótár

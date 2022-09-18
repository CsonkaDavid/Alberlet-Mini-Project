# Rendszerterv

### A rendszer célja

A rendszer célja, hogy a Cult of the Lamb játékban a "Knucklebones" nevezetű mini-játékot egy különálló,
Andoird platformon elérhető játékká tegye. A rendszer lemásolja egészében vagy részleteiben az eredeti mini-játék
mechanikáit és felhasználói funkcióit, a játékszabályok nem változnak. A felhasználói felületet is az eredetihez
hasonlóvá tesszük kisebb különbségekkel. Az eredeti játékkal ellentétben itt két játékos játszhat egymás ellen
egy eszközt együttesen használva, nem pedig egy AI ellenfél ellen.

A játék rendelkezni fog saját főmenüvel és beállítási lehetőségekkel. Az eredeti játék egérrel történő irányításait
érintőképernyős megoldások és UI elemek fogják reprodukálni. A felhasználói felület színeit az eredeti játékbeli mini-játék
alapján választjuk.


### Követelménylista

- Egyszerű kezelőfelület

- Többjátékos mód

- Részletes design


### Üzleti folyamatok modellje

![](../media/img/terv.png)

A játékban 2 fajta felhasználót különböztetünk meg:

Az eszköz tulajdonos => Játékos1

- "Játékos1" biztosítja a használandó eszközt a játékhoz. Az ő feladata a beállítások kezelése és a játék elindítása.

(Ezen feladatokat elvégezhetné "Játékos2" is, azonban jelképes "irányító" szerepet adunk ebben az esetben "Játékos1"
felhasználónak a telefon tulajdonjogára hivatkozva.)

Az "ellenfél" játékos => Játékos2

"Játékos2" a "Játékos1" felhasználó ellenfeleként lesz jelen a játékban, azonban jogosultsági különbséget az alkalmazásban
nem valósítunk meg. Ez azt jelenti, hogy technikailag elvégezhetné ugyanazon feladatokat, melyeket "Játékos1" fog elvégezni,
a megkülönböztetés érdekében azonban "Játékos2" csak a játék felületen lép közbe.

### Funkcionális terv

* Játékos 1 (eszköz tulajdonos):

  * Ő biztosítja az eszközt

  * Kezeli a játék beállításait

  * Elindíthatja a játékot

  * Játékon belül értékeket raknak le

* Játékos 2:

  * Az eszköz tulajdonos ellen versenyzik

  * Játékon belül értékeket raknak le

Menük:

* Főmenü:

  * Játék indítása
  
  * Beállítások

  * Kilépés

* Játék felület:

  * A játék felület közepén van a kocka amit a rendszer automatikusan  dob ha a játékos lerakott egy értéket

  * A kocka két oldalán a számláló mutatja a játékosok pontjait

  * A számláló és a kocka alatt illetve felett helyezkednek el a játékosok táblái amiken elhelyezhetik az értékeket


### Fizikai környezet

* Az alkalmazás android rendszerre fog készülni

* Külső komponensek:

  * hang effektek

* Fejlesztői eszközök:

  * Android Studio
  
  * Maven


### Tesztelési terv

A tesztelésünk célja, hogy meggyőződjünk róla, hogy az alkalmazásunk komponensei, valamint az alkalmazás egésze úgy működik-e, mint kellene.
Ezen felül leellenőrizzük, hogy nincsenek-e a programban hibák, bugok, amik tönkretennék a játékélményt.
Meggyőződünk róla, hogy a felhasználói felület elemei a nekik beállított funkciókat megfelelően látják-e el, illetve a különböző szabványú kijelzőkön hasonló arányban helyezkednek-e el.

Tesztelási folyamatunk lépései:

1. Egységteszt

- Egységtesztünkben ellenőrizzük le, hogy a programunkat alkotó metódusok külön-külön megfelelően funkcionálnak-e, a különbőző bemenetekre az elvárt kimeneteket produkálják.

- Biztosítjuk, hogy tesztjeink a program kódjának minél nagyobb részét lefedjék.

- Akkor nevezhetőek sikeresnek tesztjeink, ha minden lehetséges bemenetre az elvárt kimenetet produkálják.

- Akkor megfelelő az egységtesztünk, ha a kódot a lehető legnagyobb részben lefedi.
    
2. Funkcionális teszt

- A funkcionális tesztek cégünk fejlesztői által lesznek elvégezve.

- Funkcionális tesztünkben minél többféle futtatókörnyezetben (pl.: különböző telefonokon, Android verziókon) teszteljük a játékélményt.

- Megnézzük, hogy a játékmenet zökkenőmentesen zajlik-e, bugoktól, funkcionális hibáktól mentes-e.

- Akkor sikeres tesztünk, ha minden tesztelt környezetben hibamentesen lefutott a program, nem történt rendellenes működés.

### Telepítési terv

A játék Android platformra telepíthető

- Az alkalmazás nem Google Play-en keresztül elérhető.

- Elérés módja: Az alkalmazás Github tárolóján keresztül letölthető

- Beállításokban a telepítéshez engedélyezni kell a 3. féltől származó tartalmakat

- Telepítéshez a letöltött ".apk" állományt kell futtatni


## Karbantartási terv

- Fix időszakonként ellenőrizni fogjuk hogy a játék egyes funkciói megfelelően működnek-e, ellátják-e szükséges feladataikat, nem történik-e váratlan hiba

- Ellenőrizzük, hogy jövőben kiadott Android verziókkal kompatibilis legyen

- Új képernyő méret szabványok megjelenése esetén a felhasználói felület elemeire vonatkozóan biztosítjuk a rezponzivítást

- A keletkező hibákat, bugokat a lehető leghamarabb próbáljuk kijavítani
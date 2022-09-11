# Funkcionális Specifikáció

### Jelenlegi helyzet
Egy telefonos alkalmazásokat készítő kisvállalkozás vagyunk, akik szeretnének belépni egy játékkal a mobil játékiparba.
Ez az első projektünk, és reméljük, hogy megállja majd a helyét a nagyobb cégek termékeivel szemben.

### Vágyálom rendszer
A projektünk egy amőbához hasonló egyszerű kétszemélyes puzzle játék lesz.
A játék két 3x3-as táblán játszódik. A játékosok felváltva dobnak egy dobókockával, és a dobás eredményét
elhelyezik a saját táblájuk megfelelő cellájában. A lerakott számok az adott játékos pontszámaihoz adódnak hozzá.
Egy oszlopban 2 vagy 3 ugyanolyan szám lerakásával a megegyező számok összeszorzódnak, ezáltal a kapott pontszám is többszöröződik.
Ha a lerakott szám a másik játékos táblájában is szerepel ugyanazon oszlopban, akkor az a szám és az általa szerzett pontszám a másik játékostól elveszik.
Akkor ér véget a játék, ha valamelyik játékos táblája megtelik, és a győzelem azé lesz, akinek több pontja van ekkor.

### Jelenlegi üzleti folyamatok
A leírt játék a Cult of the Lamb indie videójáték mini-játéka. A játékon belül a mini-játék a Cult of the Lamb játékban
csak egy mellék-tevékenységként van jelen bármilyen jelentősebb játékbeli jutalom nélkül, annak ellenére, hogy a mini-játék
egy önálló, egyszerű és szórakoztató kétszemélyes játék is lehetne.

### Igényelt üzleti folyamatok modellje
- Elkészíteni a fenti mini-játék önálló verzióját: megvalósítani, hogy Android operiációs rendszeren egy különálló játékként tudjuk játszani
a mini-játékot
- Más emberek ellen történő játék lehetővé tétele: 2 ember ugyanazon eszközön körökre osztva 
- Saját felhasználói felület megléte: az eredeti mini-játékéhoz hasonló kezelőfelület

### Követelménylista
- Egyszerű kezelőfelület
- Többjátékos mód
- Toplista különböző feltételek alapján
- Részletes design

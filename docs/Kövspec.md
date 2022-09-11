# Követelmény Specifikáció

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

### Igényelt üzleti folyamatok
Azt fogjuk megvalósítani, hogy a fentebb említett okok miatt elkészítjük a mini-játék önálló változatát android platformra,
valamint lehetővé tesszük, hogy két ember összemérje tudását egymás ellen. 
A játék rendelkezni fog saját felhasználói felülettel.

### Rendszerre vonatkozó szabályok
A felhasználói felület XML-ben fog elkészülni, a backend pedig Java-ban lesz programozva.

### Követelménylista
- Egyszerű kezelőfelület
- Többjátékos mód
- Részletes design

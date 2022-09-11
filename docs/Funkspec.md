# Funkcionális Specifikáció

### Jelenlegi helyzet leírása
Egy telefonos alkalmazásokat készítő kisvállalkozás vagyunk, akik szeretnének belépni egy játékkal a mobil játékiparba.
Ez az első projektünk, és reméljük, hogy megállja majd a helyét a nagyobb cégek termékeivel szemben.

### Vágyálom rendszer leírása
A projektünk egy amőbához hasonló egyszerű kétszemélyes puzzle játék lesz.
A játék két 3x3-as táblán játszódik. A játékosok felváltva dobnak egy dobókockával, és a dobás eredményét
elhelyezik a saját táblájuk megfelelő cellájában. A lerakott számok az adott játékos pontszámaihoz adódnak hozzá.
Egy oszlopban 2 vagy 3 ugyanolyan szám lerakásával a megegyező számok összeszorzódnak, ezáltal a kapott pontszám is többszöröződik.
Ha a lerakott szám a másik játékos táblájában is szerepel ugyanazon oszlopban, akkor az a szám és az általa szerzett pontszám a másik játékostól elveszik.
Akkor ér véget a játék, ha valamelyik játékos táblája megtelik, és a győzelem azé lesz, akinek több pontja van ekkor.

### Jelenlegi üzleti folyamatok modellje
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
- Részletes design

### Funkció - követelmény megfeleltetés
- Főmenü: egy játék kezdése gomb, egy beállításokhoz vezető gomb és egy kilépés gomb.
- Kockadobás: a kör kezdetekor a játék automatikusan dob egyet a kockával. A dobás után a táblára kell húzni a kidobott kockát.
- Pontszámító: a táblára helyezett kidobott kockák értékeinek hozzáadása a játékos pontszámához. Egy oszlopba helyezett,
azonos értékeket összeszorozzuk összeadás helyett. Ha egy adott oszlopba lerakott érték szerepel a másik játékos tábláján ugyanezen oszlopban,
akkor a másik játékos tábláján ezen oszlopban minden ilyen érték törlődik, és a pontszámuk is átszámolásra kerül.
- Pontok megjelenítése: mindkét játékos pontszámát megjeleníti egy-egy a játékos felé fordított szövegmező.
- Játék vége: a játék véget ér, ha valamelyik játékos táblája megtelik. Ekkor a pontszámaik alapján eldől, hogy ki a nyertes.

### Képernyő terv
A játéktér 3 fő részből áll:

1. A játékosok rendelkeznek egy-egy 3x3-as játéktáblával, amelybe a dobott számokat elhelyezhetik
2. A játéktér közepén lévő kockával dobhatnak körönként a játékosok
3. A kocka jobb és bal oldalán egy-egy a játékosok felé fordított pontszámtáblán jelzi a játék a jelenlegi játék-állást

A játékból való kilépésre az eszközön lévő vissza gombbal érhetünk el egy kilépés gombot.

<img src="![](../media/img/design.jpg)"  width="300" height="480">



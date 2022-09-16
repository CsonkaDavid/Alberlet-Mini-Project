# Követelmény Specifikáció

### Áttekintés
Az általunk fejlesztett program egy amőbához hasonló puzzle game.
A játékot 2 játékos játsza egy-egy 3x3-as játékostáblán, felváltva dobnak, majd a dobás eredményét el tudják helyezni saját táblájukon.
Ezáltal pontokat tudnak szerezni, azonban bukhatunk is pontokat, ha a másik játékos ugyanazon oszlopba rakja le a miénkkel megegyező számát.
A játék akkor ér véget, ha a tábla betelik, ekkor az a játékos nyer, akinek több pontja van.
Alapja a Cult of the Lamb nevű játék minijátéka, azonban a mini-gamenek nem volt kihatása a fő történetszálra.
Ezért elhatározzuk, megcsináljuk az önálló mobilos változatát, mivel egy klassz egyedi mobiljáték is lehetne.
Lesz saját felhasználói felülete, például különböző gombok, melyen keresztül vezérelni lehet a játékot.

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
A leírt játék a Cult of the Lamb indie videójáték mini-játéka, a mini-játék funkciói:

+ Kockadobás: automatikusan történik minden egyes kör elején => beírandó érték meghatározása

+ Érték beírás: kockadobás után történik => a játékos választja ki, hogy melyik oszlopba akarja rakni a számot

+ Pontszámítás: automatikusan történik az érték beírása után, attól függően

+ Pontvesztés: automatikusan történik, ha játékos2 egy olyan oszlopba rak egy értéket, ahol már játékos1nek szerepel a saját táblájában vele megegyező értéke

+ Győztes meghatározása: pontszám alapján automatikusan történik, miután valamelyik játékos betelítette teljesen a tábláját

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

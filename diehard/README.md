# Die-Hard Sale

Ein Online Händler möchte die "Stirb langsam" Blu-Rays Disks (BD) promoten und
bewirbt daher eine Rabatt-Aktion. Der Grundpreis für jede BD beträgt 8 Euro.
Wenn man aber zwei verschiedene Teile der Reihe kauft, bekommt man einen Rabatt
von 5% auf den Preis der beiden BDs. Kauft man drei verschiedene Teile bekommt
man einen Rabatt von 10%, bei vier Teilen 20% und wenn man alle fünf Teile kauft
bekommt man einen Rabatt von 25%. Der Preis wird auf ganze Cents abgerundet.

Für die Rabatte ist es wichtig, dass es immer verschiedene Teile sind!

#### Beispiele:

| Warenkorb             | Preis (EUR) |                                                                                 |
|-----------------------|-------------|---------------------------------------------------------------------------------|
| 1x Teil 1             |  8,00       |                                                                                 |
| 2x Teil 1             | 16,00       | Kein Rabatt, da es der gleiche Teil ist                                         |
| 1x Teil 1 + 1x Teil 2 | 15,20       |                                                                                 |
| 2x Teil 1 + 1x Teil 2 | 23,20       | Es gibt Rabatt auf Teil 1 + Teil 2, aber nicht auf die zweite BD von Teil 1     |
| 2x Teil 1 + 2x Teil 2 | 30,40       | Es gibt 2 Mal Rabatt auf die beiden Teile (aber keinen 20% Rabatt auf vier BDs) |
| Teil 1, 2, 3 und 4    | 25,60       | 20% Rabatt auf die vier BDs                                                     |

Dieses Kata ist bekannter unter dem Namen Potter Kata, da es entstand, als es 5
Harry Potter Bücher gab.

#### Vorgehensweise

Gehen Sie kleinschrittig an die Aufgabe heran und schreiben Sie sinnvolle Tests.
Dieses Kata ist sehr anspruchsvoll, aber in kleinen Schritten kommt man gut
voran.

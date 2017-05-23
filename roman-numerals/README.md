# roman-numerals-kata

## Ping-Pong-Ablauf

1. Sie schreiben einen fehlschlagenden Test.
2. Sie geben die Tastaur an ihre(n) Partner(in) weiter.
3. Ihr(e) Partner(in) schreibt nun Code, der die Tests erfüllt.
4. Sie überlegen gemeinsam, ob ein Refactoring Sinn macht und Ihr(e) Partner(in)
   führt das Refactoring aus.
5. Der Prozess beginnt von vorne mit vertauschten Rollen, d.h., Ihr(e)
   Partner(in) schreibt nun einen Test und dann wird gewechselt.
6. Die Methode convert soll implementiert werden. Sie bekommt eine ganze Zahl
   zwischen 1 und 50 übergeben und gibt die Darstellung der Zahl im römischen
   Zahlensystem aus. Für ungültige Eingaben soll der leere String zurückgegeben
   werden.

Die Zahlzeichen des römischen Ziffersystems sind: I (1), V (5) X (10) und 50
(L). Es werden höchstens drei gleiche Ziffern hintereinander geschreiben, dann
greift die Subtraktionsregel, d.h. Es kann ein einzelnes I vor ein V oder ein X,
bzw. ein einzelnes X vor ein L geschrieben werden. Die Subraktionsregel liefert
also zum Beispiel die Zahlen 4 (IV), 9 (IX), 40 (XL).

Einige weitere Beispiele: 14 = 10 + 4 (XIV), 39 = 30 + 9 (XXXIX), 44 = 40 + 4
(XLIV).

## Auto-Test

Um die Tests automatisch auszuführen könnt ihr built-in Funktionen eures Editors
verwenden oder das Plugin lein-test-refresh auf der Konsole ausführen:

    lein test-refresh
    
Jede Änderung im Code triggert dieses Plugin und eure Tests werden erneut
ausgeführt.

# Game of Life

Game of life ist ein sogenannter zellulärer Automat. Wir haben ein Spielfeld,
das aus Zellen besteht. Eine Zelle kann entweder tot sein oder leben. Jede Zelle
hat acht Nachbarzellen. Die Funktion `element-at` kann hierbei helfen die
entsprechenden Zellen anzusprechen.

Es gibt drei Regeln, die über Leben und Tod entscheiden:

1. Eine lebende Zelle, die weniger als zwei lebende Nachbarzellen hat, stirbt an
   Einsamkeit.
2. Eine lebende Zelle, die mehr als drei lebende Nachbarzellen hat, stirbt an
   Überpopulation.
3. Eine tote Zelle, die genau drei lebende Nachbarzellen hat, wird lebendig.

Eine vierte Regel folgt aus den anderen drei Regeln: Eine lebende Zelle mit 2
oder 3 lebenden Nachbarzellen überlebt, eine tote Zelle mit mehr oder weniger
als drei lebenden Nachbarn bleibt tot.

![Game of Life](http://www3.hhu.de/stups/downloads/dojo/gol.png)

Für dieses Kata ist es sinnvoll eine funktionierende REPL am Laufen zu haben.
In `core.clj` befindet sich außerdem in den Kommentaren eine Funktion zum
Starten des Rendering-Prozesses. Das sollte auch starten, wenn man

    lein run
    
ausführt.
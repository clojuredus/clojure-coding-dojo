(ns diehard.core)

;; Wir übergeben die Blu-Rays der Stirb-Langsam Reihe als Vektor in unsere Funktion hinein. Dann könnte `cart` wie folgt
;; aussehen:
;;
;; (def cart [1 0 2 0 0])
;;
;; Was bedeutet, dass Teil 1 einmal im Warenkorb vorliegt, Teil 3 zweimal, Teil 2, 4 und 5 keinmal.
;;
;; Den nun zu bezahlenden Preis kann man in der `README.md`-Datei nachlesen.
;;
;; Vektoren können in der Funktionsdefinition direkt zerteilt werden:
;;
;; (defn foo [[a b c]]
;;   a)
;; (foo [3 2 1])
;; => 3
;;
;; Damit werden direkt Variablen zugeordnet, welche dann im Funktionskörper verwendet
;; werden können.

(defn compute-shopping-cart
  "Compute the minimal price for the given cart."
  [cart]
  :not-implemented)

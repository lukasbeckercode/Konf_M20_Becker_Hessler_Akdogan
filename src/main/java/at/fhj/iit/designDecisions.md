#Design decisions

Unser neues Drink-Projekt beinhaltet nun eine Registrierkasse, die die entsprechenden Umsätze mit ausgibt.

Für uns war es nach Aufgabenstellung nur wichtig, die Funktionalität der Registrierkasse zu zeigen. Wir haben uns daher entschieden die Verkaufsdaten in der Main selbst zu befüllen. Wir entschieden uns minimalistisch zu bleiben und verkauften nur unsere eigenen Getränke über Silvester und Neujahr. 

- mit einem einfachen Black Tea erfüllen wir die Kriterien eines nicht alkoholischen Getränks.
- mit dem Black Tea with Rum haben wir ein schwach alkoholisches Getränk
- und mit dem Cocktail ein stark alkoholisches Getränk.

Wir selbst (Lukas und Andrea) stellen die verschiedenen Verkäufer dar. Jeder hat auch die Getränke des anderen verkauft. Wir konzentrierten uns beispielhaft auf die Umsatztage Silvester 2020 und Neujahr 2021.

##Selling Data Struktur

Unsere Registrierkasse greift im Wesentlichen auf die "SellingData", den Verkaufsdaten, zu. Diese beinhaltet
- Drink (Getränk)
- Seller (Verkäufer) 
- SellingDay (Verkaufstag) <br />
welchen jeweils eine eigene Klasse zugrunde liegt.

Weiterhin berechnet sie bereits den Preis, den ein Getränk ausmacht, welches sich aus verchiedenen Liquids (Flüssigkeiten) zusammensetzt, die einen eigenen vorgegebenen Preis haben.

Diesen Preis der einzelnen Liquids bestimmen wir bereits in der Main.


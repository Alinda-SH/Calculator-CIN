# Java Calculator
Gemaakt door Renz van Kalmthout en Alinda Klap.
https://github.com/Alinda-SH/Calculator

## Introductie
Dit is een in Java geprogrammeerde calculator met de opties plus en min. Dit betekent
dat de applicatie plus- en minsommen kan uitvoeren. 
De calculator accepteerd drie verschillende manieren van input:
1. twee losse getallen (vb: getal 1 = 5 en getal 2 = 7)
2. een som met getallen (vb: 9-5)
3. een som met woorden (vb: acht plus drie)

## Design Patterns
### Creational Pattern: 
Het creational pattern in deze applicatie is een builder. De builder is gebruikt om de
drie verschillende calculators (de drie verschillende inputs) goed te kunnen ordenen.
De builder bestaat uit de bestanden Builder, Calculator, CalculatorBuilder1,
CalculatorBuilder2 en Director.

### Structural Pattern:
Het structural pattern in deze applicatie is een adapter. De adapter wordt gebruikt om 
van woorden naar cijfers te gaan, dit is nodig bij optie 3 van input. De adapter is 
te vinden in het bestand WordToNumberAdapter.

### Behavioral Pattern: 
Het behavioral pattern in deze applicatie is een strategy. De strategy is de basis
van de calculator. De strategy wisseld tussen optellen en aftrekken en bestaat uit
de bestanden Strategy, Context, Addition en Substraction.

## Samenwerking
Om deze applicatie te maken hebben Renz en Alinda samen gewerkt.
De adapter is gemaakt door Renz, de builder is gemaakt door Alinda en de strategy is 
gemaakt door ze allebei.

JavaParty
=========

Temporär repository för party vinjetten.

#Uppgifter

##(a)
Metoden Party.pay() har ingen kropp än. Implementera kroppen med lämplig
felhantering. Vid fel ska undantag kastas.

##(b)
Överlagra metoden Party.addSponsor() så att den tar emot en String och en
double som parametrar. Kedja den med den bentliga Party.addSponsor().

##(c)
Studenter bör kunna anmäla varsin extern gäst, t.ex. en kompis hemifrån.
Inför en ny klass GuestToStudent. Varje sådant objekt ska hålla reda på
vilket Studentobjekt som är dess värd. Modiera övriga klasser så att varje
student kan ha en extern gäst, och att alla objekt av typen GuestToStudent
hanteras som de andra gästerna.

##(d)
Som du ser har programmet inget stöd för bordsplacering än. Ett första
steg är att lagra uppgift om kön på gästerna, om man nu vill placera dem
varannan tjej, varannan kille. Implementera en uppräkning (enum) Sex och
inför den i systemet så att en placeringsmetod sedermera kan placera alla
gäster efter kön.

##(e)
Metoden Party.print() har ingen kropp än. Implementera kroppen så att
metoden skriver ut festinformation enligt följande exempel: ELiTH-phesten
i samarbete med Karlström Consulting AB och Programmeringsspecialisten
AB Pris 90 kr per gäst, max 1000 gäster Anmälda gäster: Erik Karlström
(är VIP), Joakim von Anka (har betalat), Pierre Anderberg (har betalat),
Simon Arvidsson (har betalat), John Wilander (har betalat), Erik Janols
(har inte betalat än), Eva Ragnemalm (har betalat), Jonas Wallgren (har
betalat).
Om du vet att det nns en klass eller metod i Javas API som löser en viss
sak men du inte kommer ihåg exakt vad den heter eller i vilket paket den nns
så är det OK att införa ett eget metodanrop som löser samma sak så länge
du beskriver det. Det är dock inte OK att anta att API:et innehåller ktiva
metoder som förenklar uppgiften i stil med metodenSomFixarTillLite().

##(f)
Gästerna och uppgifter om huruvida de har betalat eller ej lagras i en viss
typ av mappning (map). Har de klasser som lagras där ett lämpligt stöd för
den mappningen, eller har Tom och Erik missat något? Motivera ditt svar
och hänvisa till koden om du vill peka på något särskilt

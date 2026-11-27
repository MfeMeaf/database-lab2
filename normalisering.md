
## Underlag
Utifrån Databas Lab 2 del 2 har vi fått denna tabel för att normalisera.

| Uthyrningsnummber | datum      | kunduppgifter                            | filmtitel   | speltid |
|-------------------|------------|------------------------------------------|-------------|---------|
| 101               | 2026-11-01 | Anna Berg, anna@example.com, 070-1111111 | Stjärnresan | 119 min |
| 102               | 2026-11-02 | Erik Lind, erik@example.com, 070-2222222 | Månjakten   | 99 min  |
| 103               | 2026-11-05 | Anna Berg, anna@example.com, 070-1111111 | Månjakten   | 99 min  |

Tabellen innehåller - Uthyrnings number - Datum - Kunduppgifter - Filmtitel samt speltid.
Allt är relevant information men kanske ligger inom en tabel som gör svårare att ändra eller uppdatera information samt om
man vill bygga på tabellen för att lägga till mer information om filmen t.ex beskrivning eller huvudstjärna osv..


## Normaliserat

### Uthyrning
| Uthyrningsnummber | datum      | kunduppgifter fk | film fk | 
|-------------------|------------|------------------|---------|
| 101               | 2026-11-01 | fk_K-1           | fk_F-1  | 
| 102               | 2026-11-02 | fk_K-2           | fk_F-2  | 
| 103               | 2026-11-05 | fk_K-3           | fk_F-2  | 


### Kunduppgifter
| ID PK | namn      | email            | Telefonnummer | 
|-------|-----------|------------------|---------------|
| K-1   | Anna Berg | anna@example.com | 070-1111111   |
| K-2   | Erik Lind | erik@example.com | 070-2222222   |
| K-3   | Anna Berg | anna@example.com | 070-1111111   | 

### Film
| ID PK | namn        | speltid | m.m info | 
|-------|-------------|---------|----------|
| F-1   | Stjärnresan | 119 min | ...      |
| F-2   | Månjakten   | 99 min  | ...      |


### Resonemang

Med den uppdaterade tabellen och de två nya undviker vi att samla upp flera stycken av information inom ett attribut
i underlags tabellen samt har vi samlat film information i en egen tabel som gör det enklare att lägga till annan information
om film. Då speltiden av filmen är mer relevant för information om filmen än om uthyrningen av sig själv passar det även 
mer i film tabellen.

Med detta kan vi senare även utöka för att anpassa om man behöver lägga till eller ändra information om uthyrning - kunduppgifter
eller film.

Det som blir kvar i den orginella tabellen är uthyrningsnumret - datum - kunduppgifter som fk och film som fk.

Flera -> En | Flera uthyrningar kan göras av en kund

Uthyrning -> Kunduppgifter | (Uthyrning Kunduppgifter fk) fk_K-n -> (Kunduppgifter ID PK) K-n 

<br>
En -> En | En uthyrning är en film

Obs. att det blir enklare här att lägga till om man vill att en uthyrning ska kunna ingå flera filmer då man antigen 
kan lägga flera filmer i film attributet inom uthyrning tabellen.

Uthyrning -> Film | (Uthyrning film fk) fk_F-n -> (Film ID PK) F-n

Vad vi har gjort är att vi ger film respective kunduppgifter en identifikator för id't F "Film" / K "Kund" -n "Numner"
Detta gör det mer lite mer läsbart än bara att ha id som N t.ex 1,2,3,4 alternativt skulle man kunna använda ett mer complext
numrerat id som beskriver nyckeln t.ex 2n "kund" - 3n "film" där första numret är en koppling till typen data och n är id numret.

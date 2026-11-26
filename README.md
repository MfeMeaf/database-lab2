## Databas lab 2 - Felix Lamu

### Verksamhetsbeskrivning: 

- Personal 

Information om de anställda inom företaget.

- Avdelgning

Information om de olika lokaler samt lokalsort som företaget använder

- Passerkort

Information om passerkort samt vilken anställd det tillhör.


### Attribut 

#### Avdelning

    section

        name, sträng som inte är null, begränsad till 80 chars
        city, sträng som inte är null, begränsad till 80 chars
        Primär nyckel är name


#### Personal

    employees

        first name, sträng som inte är null, begränsad till 20 chars
        last name, sträng som inte är null, begränsad till 20 chars
        email address, sträng som inte är null, begränsad till 60 chars, är unik
        date of hire, datum
        section name, sträng som inte är null, begränsad till 45 chars,
        främmande nyckel, section name refererar till namnet av en avdelning.
        Primär nyckel är email address
    

#### Passerkort

    passcard
        card number, int, automatisk ökning, unik
        date of issue, datum
        date of expire, datum
        employee, sträng, primär nyckel
        främmande nyckel, employee, refererar till anställd personals email address.

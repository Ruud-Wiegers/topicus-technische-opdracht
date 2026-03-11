# Technische handreiking
Een stap-voor-stap handleiding om het voorbeeld-project te kunnen draaien.
 - te kopiëren in GitHub
 - Uit te voeren in IntelliJ
 - Te testen via Postman
 - Te publiceren in Github

---

## Stap 1 - Fork het project op GitHub
1. Maak een github-account als je er nog geen hebt.
2. Fork dit project: https://github.com/Ruud-Wiegers/topicus-technische-opdracht/fork

## Stap 2 – Laad het project in IntelliJ
1. Ga naar https://www.jetbrains.com/idea/download/ en installeer de community editie van IntelliJ.
2. Open IntelliJ
3. Op het welkomstscherm of via menu: **File > New > Project from Version Control**).
4. Vul de URL van je geforkte project in https://github.com/[jouw-account-naam]/topicus-technische-opdracht

## Stap 3 - Backend starten
1. Zoek in IntelliJ het applicatie-bestand: `src/main/kotlin/nl/topicuszorg/viplivelab/casus/VipliveLabCasusApplication.kt`
2. Klik op het groene driehoekje bij `fun main(args: Array<String>)`
3. De applicatie is nu gestart. Als het goed is verschijnen nu allemaal logregels onderin, waaronder iets als `Started VipliveLabCasusApplicationKt in 1.23 seconds`
4. Check of het werkt door in je browser naar http://localhost:8080/hello/jantje?hoofdletters=true te navigeren

## Stap 4 – API-aanroepen testen met Postman
Je browser werkt alleen voor eenvoudige API-aanroepen. Om ingewikkeldere API-calls te testen is het praktischer een tool te gebruiken als Postman.
1. Ga naar https://www.postman.com/downloads/ en instaleer Postman.
2. Open Postman.
3. Controleer dat je backend nog draait in IntelliJ.

### 5.1 GET

We beginnen met een eenvoudig GET-verzoek om data op te halen.

1. Klik op de knop **New** en kies **HTTP Request**.
2. Zorg dat links het type **GET** geselecteerd is.
3. Typ in het URL-veld:
   ```
   http://localhost:8080/hello/jantje
   ```
4. Klik op **Send**.

### 5.2 POST

Met een POST-verzoek stuur je data naar de API, vaak om iets nieuws aan te maken, soms om de server iets te laten uitvoeren.

1. Klik opnieuw op **New > HTTP Request**.
2. Verander het type naar **POST**.
3. Vul de URL in:
   ```
   http://localhost:8080/hello
   ```
4. Klik op het tabblad **Body**.
5. Kies **raw** en selecteer **JSON** in het dropdown-menu rechts.
6. Typ het volgende in het tekstveld:
   ```json
   {
    "voornaam": "Jan",
    "achternaam": "Janssen"
   }
   ```
7. Klik op **Send**.

8. Zie in de logregels van IntelliJ: `Hello, Jan Janssen`


### 5.3 Complexere data
In de vorige stap zagen we al JSON voor het insturen van data. JSON is het gestructureerde data-format waarmee veel communicatie plaatsvindt. We kunnen ook JSON terugkrijgen uit de backend:
1. Maak een GET call naar `http://localhost:8080/hello/moeilijkeData` om een voorbeeld van gestructureerde data in JSON te ontvangen.

---

## Stap 6 – Aanpassingen maken aan de code
In IntelliJ in `VoorbeeldController.kt` zie de code die achter `http://localhost:8080/hello` schuilt en de verschillende verzoeken afhandelt.

Voor de technische opdracht zul je zelf wijzigingen moeten maken.
1. Pas eens wat van de naampjes aan, of maak gelijk een eigen controller.
2. Herstart de backend om je wijzigingen te kunnen testen.
3. Commit je wijzigingen in git
4. Push je wijzigingen naar je GitHub.

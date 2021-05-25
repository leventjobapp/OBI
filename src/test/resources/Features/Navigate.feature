@smoke @navigation
Feature: Navigate to Alle Kategorien



  @wip
  Scenario Outline: Verify page titles
    Given the user on the OBI webpage
    Given user logs in with credentials
    When user click on "Technik" "<tab>" "<module>"
    Then user should be able to see "<page title>" as a title
    Examples:
      |tab|module|page title|
      |Elektrowerkzeuge|Bohrer & Schrauber               |Bohrer & Schrauber online kaufen bei OBI                |
      |Elektrowerkzeuge|Sägen                            |Sägen online kaufen bei OBI                             |
      |Elektrowerkzeuge|Schleifmaschinen & Zubehör       |Schleifmaschinen & Zubehör online kaufen bei OBI        |
      |Elektrowerkzeuge|Multifunktionswerkzeuge & Zubehör|Multifunktionswerkzeuge & Zubehör online kaufen bei OBI |
      |Elektrowerkzeuge|Miniaturwerkzeuge & Zubehör      |Miniaturwerkzeuge & Zubehör online kaufen bei OBI       |
      |Elektrowerkzeuge|Hobel                            |Hobel online kaufen bei OBI                             |
      |Elektrowerkzeuge|Zubehör für Heißluftgeräte       |Zubehör für Heißluftgeräte online kaufen bei OBI        |
      |Elektrowerkzeuge|Heißklebegeräte                  |Heißklebegerät online kaufen bei OBI                    |
      |Elektrowerkzeuge|Zubehör für Heißklebegeräte      |Zubehör für Heißklebegeräte online kaufen bei OBI       |
      |Autozubehör     |Autoanhänger                     |Autoanhänger online kaufen bei OBI                      |
      |Werkstatt       |Werkstatteinrichtung             |Werkstatteinrichtung online kaufen bei OBI              |
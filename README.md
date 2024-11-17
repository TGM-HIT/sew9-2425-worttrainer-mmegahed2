# Worttrainer

Dies ist ein Tool, mit dem man lernen kann, wie man Wörter richtig schreibt. Hier wird einem ein Bild angezeigt, wozu man das passende Wort dazu schreiben soll. Danach wird geprüft, ob dieses Wort richtig geschrieben wurde, und dies wird mittels einer Statistik ausgegeben.

---

## Aufbau

Der Worttrainer besteht aus drei Teilen:

1. **Wortpaar**  
2. **Worttrainer**  
3. **GUI**

---

### Wortpaar

Das **Wortpaar** speichert:  
- Eine gültige Image-URL  
- Ein beschreibendes Wort des Bildes  

**Wichtige Anforderungen:**  
- Die URL muss direkt zu einem Bild führen.  
- Die URL muss eine vollständige Domain enthalten und mit `https://...` beginnen.

---

### Worttrainer

Der **Worttrainer** ist für die Verarbeitung der Daten zuständig. Er speichert eine Liste von Wortpaaren, die dem Benutzer zum Lernen gegeben werden.  

**Funktionen:**  
- Überprüfung der Nutzereingaben auf Richtigkeit  
- Ausgabe von Statistiken:  
  - Anzahl der Versuche  
  - Anzahl der richtigen und falschen Antworten  

**Methoden:**  
- **Speichern und Laden:**  
  - Ermöglicht die Persistenz von Daten.  
  - Im Konstruktor können sowohl ein Pfad als auch ein `SaveManager` übergeben werden, um einen alten Worttrainer zu laden und Daten zu speichern.

---

### GUI

Die **GUI** ist für alle Anzeigen auf dem Bildschirm verantwortlich:  
- Verarbeitung und Anzeige der Bilder  
- Ausgabe der Statistik  
- Weiterleitung der Nutzereingaben  

---

### Statistik

Für die Statistik gibt es eine eigene Klasse, die:  
- Alle Versuche speichert  
- Daten zu den Versuchen verarbeitet  

---

### Persistence

Die **Persistence** wurde mittels **Strategy Pattern** umgesetzt, um sie austauschbar zu machen.  
- **Interface:**  
  - Definiert die Methoden für Laden und Speichern.  

--- 

Dieses Design ermöglicht eine flexible und modulare Umsetzung des Worttrainers.

package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Das Interface ist dafür da um das Strategy Pattern umzusetzen und den Klassen zum speichern und laden des Worttrainers gewisse Vorgaben zugeben
 * @author Megahed Mohamed
 * @version 17.11.2024
 */
public interface WordTrainerManager {

    /**
     * Speichert den Worttrainer in ein File an dem angegeben Pfad
     * @param filepath der Pfad andem das File gespeichert werden soll
     * @param wordTrainer der Worttrainer der gespeichert werden soll
     */
    void save(String filepath, WordspellTrainer wordTrainer) throws IOException;


    /**
     * Ladet ein File von dem angegeben Pfad
     * @param filepath der Pfad von dem der Worttrainer geladen werden soll
     * @return gibt den Worttrainer der geladen werden soll zurück
     */
    WordspellTrainer load(String filepath) throws FileNotFoundException,IOException;
}
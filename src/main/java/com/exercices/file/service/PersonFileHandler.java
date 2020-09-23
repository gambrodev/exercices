package com.exercices.file.service;
import com.exercices.file.pojo.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Classe che si occupa di fare input/output sul file delle persone
 */
public class PersonFileHandler {

    //variabile file sta qua!!!

    /**
     * legge il file e restituisce una lista contenente le righe
     *
     */
    public List<String> readFromFile() {
        //googlelare Read text line by line java MKyong (Buffered Reader)
        //leggi dal file e metti ogni riga dentro una lista
        StringBuilder DataArray = new StringBuilder();

        try (BufferedReader br = person.newBufferedReader(Paths.get("Person.txt"))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                DataArray.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return null;
    }

    //dopo read volendo write


}

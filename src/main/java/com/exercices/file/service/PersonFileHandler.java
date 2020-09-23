package com.exercices.file.service;
import com.exercices.file.pojo.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        List<String> datalist = new ArrayList<>();
        Files personFile = new Files ("C:\\Users\\PCasa\\IdeaProjects\\exercises\\Resources\\Person.txt");
        BufferedReader reader = new BufferedReader(new FileReader(personFile));
        String readLine = String ("");
        while ((readLine = reader.readLine()) != null) {
            datalist add readLine;
        return datalist;
        }

    }



}

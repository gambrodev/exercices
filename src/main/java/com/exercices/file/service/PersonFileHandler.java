package com.exercices.file.service;
import com.exercices.file.pojo.Person;

import java.io.*;
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
    public List<String> readFromFile() throws IOException {
        //googlelare Read text line by line java MKyong (Buffered Reader)
        //leggi dal file e metti ogni riga dentro una lista
        List<String> datalist = new ArrayList<>();
        File personFile = new File("C:\\Users\\PCasa\\IdeaProjects\\exercises\\Resources\\Person.txt");
        BufferedReader reader = new BufferedReader(new FileReader(personFile));
        String readLine = "";
        while ((readLine = reader.readLine()) != null) {
            datalist.add (readLine);

        }
        return datalist;
    }



}

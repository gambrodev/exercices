package com.exercices.file.service;


import com.exercices.file.pojo.Person;

import java.util.List;

/**
 * Classe contenente i metodi per gestire gli oggetti Person
 *
 */
public class PersonService {

    PersonFileHandler personFileHandler;

    public PersonService() {
        personFileHandler = new PersonFileHandler();
    }

    /**
     *
     * data una lista di stringhe restituisce una lista di oggetti person
     *
     * @return
     */
    public static List<Person> getPer5sonList() {
        // leggi dal persoFileHandler e crea una lista di oggetti Person
        return null;
    }

    /**
     * data una stringa separata da virgole, crea un oggetto Person
     * @param personString
     * @return
     */
    private static Person createPerson(String personString) {
        // crea un oggetto person usando i setter dell'oggetto
        return null;
    }

}

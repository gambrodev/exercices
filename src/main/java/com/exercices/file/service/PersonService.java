package com.exercices.file.service;


import com.exercices.file.pojo.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe contenente i metodi per gestire gli oggetti Person
 *
 */
public class PersonService {


    public PersonService() {
             }

    /**
     *
     * data una lista di stringhe restituisce una lista di oggetti person
     *
     * @return
     */
    public  List<Person> getPersonsList() {
        PersonFileHandler fileHandler = new PersonFileHandler();
        List<String> rawDataList = fileHandler.readFromFile();
        List<Person> personList = new ArrayList();

        for(String rawData : rawDataList){
            Person person = createPerson(rawData);
            personList.add(person);
        }

        // leggi dal persoFileHandler e crea una lista di oggetti Person
        return personList;
    }

    /**
     * data una stringa separata da virgole, crea un oggetto Person
     * @param personString
     * @return
     */
    private static Person createPerson(String personString) {
        String[] DataArray = personString.split(",");
        // creare oggetto person
        Person person = new Person;
        // usare setter per valorizzare ogggetto perrsona
        person.setNome( DataArray [0]);
        person.setCognome( DataArray [1]);
        //person.setBirthday( DataArray [2]);
        person.setAltezza( DataArray [3]);
        person.setPeso( DataArray [4]);

        // restituire oggetto persona
        // crea un oggetto person usando i setter dell'oggetto
        return person;
    }

}

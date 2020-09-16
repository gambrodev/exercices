package com.exercices.file;

import com.exercices.file.pojo.Person;
import com.exercices.file.service.PersonService;

import java.util.List;

/**
 * Classe dove lanciare il programma
 */
public class MyMain {

    public static void main(String[] args) {
//         stampa questo metodo !!! PersonService.getPer5sonList();
    PersonService personService = new PersonService();
        List<Person> personsList = personService.getPersonsList();
        for (Person person : personsList ) {
            System.out.println("####### STAMPA DA FOREACH #######");
            System.out.println(person.toString());
        }
        for (int i = 0 ; i < personsList.size(); i++){
            System.out.println("####### STAMPA DA FOR #######");
            System.out.println(personsList.get(i).toString());
        }
        System.out.println("####### STAMPA DA STREAM #######");
        personsList.stream().forEach(obj -> obj.toString());
    }

}

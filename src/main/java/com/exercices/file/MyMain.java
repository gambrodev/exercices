package com.exercices.file;

import com.exercices.file.pojo.Book;
import com.exercices.file.pojo.Person;
import com.exercices.file.service.BookService;
import com.exercices.file.service.PersonService;

import java.io.IOException;
import java.util.List;

/**
 * Classe dove lanciare il programma
 */
public class MyMain {

    private static Object IOException;

    public static void main(String[] args) throws IOException {
//         stampa questo metodo !!! PersonService.getPersonList();
        PersonService personService = new PersonService();
        List<Person> personsList = personService.getPersonsList();
        for (Person person : personsList) {
            System.out.println("####### STAMPA DA FOREACH #######");
            System.out.println(person.toString());
        }
        for (int i = 0; i < personsList.size(); i++) {
            System.out.println("####### STAMPA DA FOR #######");
            System.out.println(personsList.get(i).toString());
        }
        System.out.println("####### STAMPA DA STREAM #######");
        personsList.stream().forEach(obj -> obj.toString());

            BookService bookService = new BookService();
            List<Book> bookList = bookService.getBookList();
            for (Book book : bookList) {
                System.out.println("####### STAMPA DA FOR #######");
                System.out.println(book.toString());
            }
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("####### STAMPA DA FOR #######");
                System.out.println(bookList.get(i).toString());
            }
        }

    }


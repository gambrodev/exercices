package com.exercices.file;
import java.time.*;
import com.exercices.LibraryException;
import com.exercices.file.pojo.Book;
import com.exercices.file.pojo.Person;
import com.exercices.file.service.BookService;
import com.exercices.file.service.Library;
import com.exercices.file.service.PersonService;

import java.io.IOException;
import java.util.List;

/**
 * Classe dove lanciare il programma
 */
public class MyMain {

    private static Object IOException;

    public static void main(String[] args) throws IOException {
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
        List<Person> gambro = Library.getInstance().getByCognome("gambro");
        gambro.stream().forEach(obj -> System.out.println(obj.toString()));
        List<Person> pippo = Library.getInstance().getByCognome("pippo");
        pippo.stream().forEach(obj -> System.out.println(obj.toString()));
        List<Person> pluto = Library.getInstance().getByCognome("pluto");
        pluto.stream().forEach(obj -> System.out.println(obj.toString()));
        Person borlengo = new Person();
        borlengo.setCognome("Borlengo");
        borlengo.setNome("Daniele");
        Library.getInstance().addPerson(borlengo);
        List<Person> borlengo1 = Library.getInstance().getByCognome("borlengo");
        borlengo1.stream().forEach(obj -> System.out.println(obj.toString()));
        //{"nome" : "pietro"}

        try {
            Book borrowedBook = Library.getInstance().borrowBook("asd", "The Sword of Shannara" );
            System.out.println(borrowedBook.isDisponibile());
            borrowedBook.getUsers().stream().forEach(obj -> System.out.println(obj));
            System.out.println(borrowedBook.toString());
        } catch (LibraryException e) {
            System.out.println(e);
        }

    }

}


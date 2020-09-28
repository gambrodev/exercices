package com.exercices.file.service;

import com.exercices.LibraryException;
import com.exercices.file.pojo.Book;
import com.exercices.file.pojo.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    List <Person> personsList = new ArrayList();
    List <Book> bookList = new ArrayList();

    private Library(){
        try {
            personsList = PersonService.getPersonsList();
            bookList = BookService.getBookList();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    private static class Holder {
        private static final Library INSTANCE = new Library();
    }

    public static Library getInstance() {
        return Holder.INSTANCE;
    }

    public List<Person> getByCognome(String cognome) {
        return personsList.stream().filter(person -> cognome.equalsIgnoreCase(person.getCognome())).collect(Collectors.toList());
    }

    public Person getByCodicveFiscale(String codice) {
        return personsList.stream().filter(person -> codice.equalsIgnoreCase(person.getCodiceFiscale())).findFirst().orElse(null);
    }

    public void addPerson(Person person) {
        personsList.add(person);
    }

    public Book getByTitle(String title) {
        return bookList.stream().filter(book -> title.equalsIgnoreCase(book.getTitolo())).findFirst().orElse(null);
    }

    public void addbook(Book book) {
        bookList.add(book);
    }

    public Book borrowBook(String codiceFiscale, String titolo) throws LibraryException {
        Book book = getByTitle(titolo);
        Person person = getByCodicveFiscale(codiceFiscale);
        if(book == null) {
            throw new LibraryException("book " + titolo + " not found!");
        }
        if(person == null) {
            throw new LibraryException("person " + person + " not found!");
        }
        book.getUsers().add(person);
        book.setDisponibile(false);

        return book;
    }

    //get libri by autore

    // se vuoi sbizzarrirti aggiungere data ritiro e data consegna così quando stampi un libro sai quando torna

    //metodo returnBook

    //deleteBook -> controllo se libro è disponibile

    //delete user


}

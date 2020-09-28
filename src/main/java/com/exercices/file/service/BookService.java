package com.exercices.file.service;

import com.exercices.file.pojo.Book;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    public BookService() {
    }

    public List<Book> getBookList() throws IOException {
        /**
         *
         * data una lista di stringhe restituisce una lista di oggetti book
         *
         * @return
         */
        BookFileHandler fileHandler = new BookFileHandler();
        List<String> rawDataList = fileHandler.readFromFile();
        List<Book> bookList = new ArrayList();
        for (String data : rawDataList) {
            Book book = createBook(data);
            bookList.add(book);
        }
        return bookList;
    }
        /**
         * data una stringa separata da virgole, crea un oggetto Person
         * @param bookString
         * @return
         */
        private static Book createBook(String bookString) {
            String[] dataarray = bookString.split(",");
            // creare oggetto book
            Book book = new Book();
            // usare setter per valorizzare ogggetto book
            book.setTitolo(dataarray[0]);
            book.setAutore(dataarray[1]);
            book.setAnno(Integer.valueOf(dataarray[2]));
            book.setPagine(Integer.valueOf(dataarray[3]));

            // restituire oggetto book

            return book;
        }
}

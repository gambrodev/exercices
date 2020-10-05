package com.exercices.file.pojo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {
    private String titolo;
    private String autore;
    private Integer anno;
    private Integer pagine;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private boolean disponibile;
    private List<Person> users = new ArrayList();



    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Integer getPagine() {
        return pagine;
    }

    public void setPagine(Integer pagine) {
        this.pagine = pagine;
    }

    public List<Person> getUsers() {
        return users;
    }

    public void setUsers(List<Person> users) {
        this.users = users;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", anno=" + anno +
                ", pagine=" + pagine +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", disponibile=" + disponibile +
                ", users=" + users +
                '}';
    }
}

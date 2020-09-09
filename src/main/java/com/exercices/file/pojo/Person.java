package com.exercices.file.pojo;

import java.util.Date;

/**
 * Classe POJO per rappresentare i dati della persona per ogni riga del file
 *
 */
public class Person {

    //pietro,gambro,22/09/1985,85,195

    private String nome;
    private String cognome;
    private Date birthday;
    private Integer peso;
    private Integer altezza;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltezza() {
        return altezza;
    }

    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Human{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", birthday=" + birthday +
                ", peso=" + peso +
                ", altezza=" + altezza +
                '}';
    }
}

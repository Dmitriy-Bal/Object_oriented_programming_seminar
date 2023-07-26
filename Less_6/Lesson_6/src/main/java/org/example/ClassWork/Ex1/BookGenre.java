package org.example.ClassWork.Ex1;

public class BookGenre implements Genre {
    String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getJanrName() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}
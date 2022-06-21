package ru.netology.domain;

public class FilmRepository {
    int filmLimit;

    public FilmRepository() {
        filmLimit = 10;
    }

    public FilmRepository(int limitSet) {
        filmLimit = limitSet;
    }

    private FilmItem[] films = new FilmItem[0];

    public FilmItem[] getFilmItem() {
        return films;
    }

    public void addNewFilm(FilmItem item) {
        int length = films.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        films = tmp;
    }

    public FilmItem[] findAll() {
        if (films.length > filmLimit) {
            FilmItem[] tmp = new FilmItem[filmLimit];
            int k = 0;
            for (int i = films.length - filmLimit; i < films.length; i++) {
                tmp[k] = films[i];
                k = k + 1;
            }
            return tmp;
        } else {
            FilmItem[] tmp = new FilmItem[films.length];
            int k = 0;
            for (int i = 0; i < films.length; i++) {
                tmp[k] = films[i];
                k = k + 1;
            }
            return tmp;
        }
    }

    public FilmItem[] findLast() {
        if (films.length > filmLimit) {
            FilmItem[] tmp = new FilmItem[filmLimit];
            int k = 0;
            for (int i = films.length - 1; i > films.length - filmLimit -1; i= i - 1) {
                tmp[k] = films[i];
                k = k + 1;
            }
            return tmp;
        } else {
            FilmItem[] tmp = new FilmItem[films.length];
            int k = 0;
            for (int i = films.length - 1; i > -1; i= i - 1) {
                tmp[k] = films[i];
                k = k + 1;
            }
            return tmp;
        }
    }
}
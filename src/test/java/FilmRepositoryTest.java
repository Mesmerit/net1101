import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmRepository;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmRepositoryTest {

    private int id;
    private String title;
    private int year;
    private String genre;
    FilmItem first = new FilmItem(1, "Doom", 2005, "action");
    FilmItem second = new FilmItem(2, "Prestige", 2006, "thriller");
    FilmItem third = new FilmItem(3, "Avatar", 2009, "fantastic");
    FilmItem fourth = new FilmItem(4, "Scream", 1996, "horror");
    FilmItem fifth = new FilmItem(5, "Gilmore", 1998, "action");
    FilmItem sixth = new FilmItem(6, "Sleeper", 2004, "fantastic");
    FilmItem seventh = new FilmItem(7, "Frightener", 2000, "thriller");
    FilmItem eighth = new FilmItem(8, "Twister", 2003, "action");
    FilmItem ninth = new FilmItem(9, "Space", 1999, "fantastic");
    FilmItem tenth = new FilmItem(10, "Quest", 2005, "action");
    FilmItem eleventh = new FilmItem(11, "Fear", 2005, "fantastic");

    @Test
    void addNewFilmTestNoConstr() {

        FilmRepository repo = new FilmRepository();
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);

        FilmItem[] actual = repo.getFilmItem();
        FilmItem[] expected = {first, second, third, fourth};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    void addNewFilmTestAndConstr() {

        FilmRepository repo = new FilmRepository(4);
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);

        FilmItem[] actual = repo.getFilmItem();
        FilmItem[] expected = {first, second, third, fourth};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void findAllIfFewNoConstr(){
        FilmRepository repo = new FilmRepository();
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {first, second, third, fourth};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void findAllIfFewAndConstr(){
        FilmRepository repo = new FilmRepository(3);
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {second, third, fourth};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void findAllIfFewAndOverConstr(){
        FilmRepository repo = new FilmRepository(5);
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {first, second, third, fourth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastIfFewNoConstr(){
        FilmRepository repo = new FilmRepository();
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);

        FilmItem[] actual = repo.findLast();
        FilmItem[] expected = {fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void findLastIfFewAndConstr(){
        FilmRepository repo = new FilmRepository(3);
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);

        FilmItem[] actual = repo.findLast();
        FilmItem[] expected = {fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findAllIfALotNoConstr(){
        FilmRepository repo = new FilmRepository();
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);
        repo.addNewFilm(fifth);
        repo.addNewFilm(sixth);
        repo.addNewFilm(seventh);
        repo.addNewFilm(eighth);
        repo.addNewFilm(ninth);
        repo.addNewFilm(tenth);
        repo.addNewFilm(eleventh);

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {second, third, fourth,fifth, sixth, seventh, eighth, ninth, tenth, eleventh};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void findAllIfALotAndConstr(){
        FilmRepository repo = new FilmRepository(4);
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);
        repo.addNewFilm(fifth);
        repo.addNewFilm(sixth);
        repo.addNewFilm(seventh);
        repo.addNewFilm(eighth);
        repo.addNewFilm(ninth);
        repo.addNewFilm(tenth);
        repo.addNewFilm(eleventh);

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {eighth, ninth, tenth, eleventh};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void findLastIfALotNoConstr(){
        FilmRepository repo = new FilmRepository();
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);
        repo.addNewFilm(fifth);
        repo.addNewFilm(sixth);
        repo.addNewFilm(seventh);
        repo.addNewFilm(eighth);
        repo.addNewFilm(ninth);
        repo.addNewFilm(tenth);
        repo.addNewFilm(eleventh);

        FilmItem[] actual = repo.findLast();
        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void findLastIfALotAndConstr(){
        FilmRepository repo = new FilmRepository(6);
        repo.addNewFilm(first);
        repo.addNewFilm(second);
        repo.addNewFilm(third);
        repo.addNewFilm(fourth);
        repo.addNewFilm(fifth);
        repo.addNewFilm(sixth);
        repo.addNewFilm(seventh);
        repo.addNewFilm(eighth);
        repo.addNewFilm(ninth);
        repo.addNewFilm(tenth);
        repo.addNewFilm(eleventh);

        FilmItem[] actual = repo.findLast();
        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth};

        Assertions.assertArrayEquals(expected, actual);
    }
}

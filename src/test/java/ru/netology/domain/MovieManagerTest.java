package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();
    SelectMovie first = new SelectMovie(1, "firstMovie", "Detective");
    SelectMovie second = new SelectMovie(2, "secondMovie", "Cartoon");
    SelectMovie third = new SelectMovie(3, "thirdMovie", "Action");
    SelectMovie fourth = new SelectMovie(4, "fourthMovie", "Comedy");
    SelectMovie fifth = new SelectMovie(5, "fifthMovie", "Thriller");
    SelectMovie sixth = new SelectMovie(6, "sixthMovie", "Sport");
    SelectMovie seventh = new SelectMovie(7, "seventhMovie", "Adventure");
    SelectMovie eighth = new SelectMovie(8, "eighthMovie", "Documentary");
    SelectMovie ninth = new SelectMovie(9, "ninthMovie", "Romance");
    SelectMovie tenth = new SelectMovie(10, "tenthMovie", "Horror");
    SelectMovie eleventh = new SelectMovie(11, "eleventhMovie", "Musical");

    @Test
    public void shouldSaveMovie() {
        manager.save(first);
        SelectMovie[] expected = {first};
        SelectMovie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllMovies() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);

        SelectMovie[] expected = {first, second, third, fourth};
        SelectMovie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllMoviesBoundary() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        SelectMovie[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        SelectMovie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllMoviesBoundary2() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);

        SelectMovie[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth};
        SelectMovie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowReverseMovies() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);

        SelectMovie[] expected = {fourth, third, second, first};
        SelectMovie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowReverseBoundary() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        SelectMovie[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        SelectMovie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowReverseBoundary2() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);

        SelectMovie[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        SelectMovie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowReverseBoundary3() {
        manager.save(first);

        SelectMovie[] expected = {first};
        SelectMovie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
}
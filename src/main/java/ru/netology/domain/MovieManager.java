package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieManager {
    private SelectMovie[] movies = new SelectMovie[0];
    private int limit = 10;

    public MovieManager() {
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void save(SelectMovie movie) {
        int length = movies.length + 1;
        SelectMovie[] tmp = new SelectMovie[length];
//        for (int i = 0; i < movies.length; i = i + 1) {
//            tmp[i] = movies[i];
//        }
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public SelectMovie[] findAll() {
        return movies;
    }

    public SelectMovie[] findLast() {
        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        SelectMovie[] result = new SelectMovie[resultLength];
        for (int i = 0; i < resultLength; i = i + 1) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}

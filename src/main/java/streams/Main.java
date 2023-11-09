package streams;

import streams.exercises.BookDB;
import streams.exercises.JavaExercises;
import streams.exercises.JavaExercisesImpl;

public class Main {

    public static void main(String[] args) {
        JavaExercises javaExercises = new JavaExercisesImpl(BookDB.generateBooks(BookDB.generateAuthors()));
        System.out.println(javaExercises.filterByGenre(Genre.COOKING));


    }
}

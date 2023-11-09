package streams.exercises;

import streams.Book;
import streams.Genre;

import java.util.List;
import java.util.stream.IntStream;

public class JavaExercisesImpl implements JavaExercises {

    private final List<Book> books;

    public JavaExercisesImpl(List<Book> books) {
        this.books = books;
    }

    public List<Book> filterByGenre(Genre genre) {
        return books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .toList();
    }

    @Override
    public long getTotalNumberOfPagesForFictionBooks() {
        return books.stream()
                .filter(book -> book.getGenre().equals(Genre.FICTION))
                .mapToLong(Book::getNumberOfPages)
                .sum();
    }

    @Override
    public double getAverageRatingBooks() {

        return books.stream()
                .mapToDouble(Book::getRate)
                .average()
                .orElse(0.0);
    }

}

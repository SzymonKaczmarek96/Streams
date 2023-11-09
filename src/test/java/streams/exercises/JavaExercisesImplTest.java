package streams.exercises;

import org.junit.jupiter.api.Test;
import streams.Author;
import streams.Book;
import streams.Genre;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaExercisesImplTest {

    @Test
    void filterByGenre() {
        //given
        Author author = BookDBTest.createAuthor("John", "Doe", "01/15/1980", "N/A");
        Author author1 = BookDBTest.createAuthor("Jane", "Smith", "05/20/1975", "N/A");
        Author author2 = BookDBTest.createAuthor("David", "Johnson", "03/10/1990", "N/A");

        Book book1 = BookDBTest.createBook ("The Great Novel", 2005, "978-1234567890", 4.8,
                List.of(author), Genre.FICTION, 350, "Best Publishers");
        Book book2 = BookDBTest.createBook("Another Book", 2010, "978-0987654321", 4.5,
                List.of(author1), Genre.FICTION, 400, "Amazing Books");
        Book book3 = BookDBTest.createBook("Science and Technology", 2018, "978-5555555555", 4.2,
                List.of(author2), Genre.SCIENCE_FICTION, 250, "Tech Publications");

        List<Book> allBooks = List.of(book1,book2,book3);
        List<Book> expectedBooks = List.of(book1,book2);

        //when
        JavaExercises javaExercises = new JavaExercisesImpl(allBooks);
        List<Book> books = javaExercises.filterByGenre(Genre.FICTION);

        //then
        assertEquals(expectedBooks, books);
    }

    // Get Total Number of Pages for Fiction Books
    @Test
    void shouldCountNumberOfPagesForFictionBooks() {
        //given
        Author author = BookDBTest.createAuthor("John", "Doe", "01/15/1980", "N/A");
        Book fictionBooks1 = BookDBTest.createBook ("The Great Novel", 2005, "978-1234567890", 4.8,
                List.of(author), Genre.FICTION, 350, "Best Publishers");
        Book fictionBooks2 = BookDBTest.createBook ("The Great Novel", 2005, "978-1234567890", 4.8,
                List.of(author), Genre.FICTION, 350, "Best Publishers");
        Book book3 = BookDBTest.createBook("Cooking Delights", 2015, "978-7777777777", 4.9,
                List.of(author), Genre.COOKING, 180, "Chef's Haven");

        List<Book> books = List.of(fictionBooks1,fictionBooks2,book3);

        //when
        JavaExercises javaExercises = new JavaExercisesImpl(books);
        long numberOfPages = javaExercises.getTotalNumberOfPagesForFictionBooks();

        //then
        assertEquals(700,numberOfPages);
    }


    @Test

    void shouldGetAverageRatingBooks() {

        //given
        Author author = BookDBTest.createAuthor("John", "Doe", "01/15/1980", "N/A");
        Author author1 = BookDBTest.createAuthor("Jane", "Smith", "05/20/1975", "N/A");
        Author author2 = BookDBTest.createAuthor("David", "Johnson", "03/10/1990", "N/A");

        Book book1 = BookDBTest.createBook ("The Great Novel", 2005, "978-1234567890", 4.8,
                List.of(author), Genre.FICTION, 350, "Best Publishers");
        Book book2 = BookDBTest.createBook("Another Book", 2010, "978-0987654321", 4.5,
                List.of(author1), Genre.FICTION, 400, "Amazing Books");
        Book book3 = BookDBTest.createBook("Science and Technology", 2018, "978-5555555555", 4.2,
                List.of(author2), Genre.SCIENCE_FICTION, 250, "Tech Publications");


        List<Book> books = List.of(book1,book2,book3);
        //when
        JavaExercises javaExercises = new JavaExercisesImpl(books);
        double averageRating = javaExercises.getAverageRatingBooks();

        //then
        assertEquals(4.5,averageRating);
    }


    //TODO: Make this methods parametrized
    static class BookDBTest {

        public static Author createAuthor(String name,String surname,String dateOfBirth,String dateOfDeath){
            return Author.builder()
                    .name(name)
                    .surname(surname)
                    .dateOfBirth(dateOfBirth)
                    .dateOfDeath(dateOfDeath)
                    .build();
        }

        public static Book createBook
                (String title,
                 int yearOfPublication,
                 String isbn,
                 double rate,
                 List<Author> authors,
                 Genre genre,
                 int numberOfPages,
                 String publisher){

            return Book.builder()
                    .title(title)
                    .yearOfPublication(yearOfPublication)
                    .isbn(isbn)
                    .rate(rate)
                    .authors(authors)
                    .genre(genre)
                    .numberOfPages(numberOfPages)
                    .publisher(publisher)
                    .build();
        }

//        public static List<Author> generateAuthors() {
//            return List.of(
//                    new Author("John", "Doe", "01/15/1980", "N/A"),
//                    new Author("Jane", "Smith", "05/20/1975", "N/A"),
//                    new Author("David", "Johnson", "03/10/1990", "N/A"),
//                    new Author("Mary", "Brown", "07/25/1985", "N/A"),
//                    new Author("Michael", "Johnson", "02/18/1972", "N/A")
//            );
//        }
//
//        public static List<Book> getBookForTest(){
//            List<Author> authorsForBook1 = new ArrayList<>();
//            authorsForBook1.add(generateAuthors().get(0));
//            Book book1 = new Book("The Great Novel", 2005, "978-1234567890", 4.8,
//                    authorsForBook1, Genre.FICTION, 350, "Best Publishers");
//
//            List<Author> authorsForBook2 = new ArrayList<>();
//            authorsForBook2.add(generateAuthors().get(1));
//            Book book2 = new Book("Another Book", 2010, "978-0987654321", 4.5,
//                    authorsForBook2, Genre.FICTION, 400, "Amazing Books");
//
//            List<Author> authorsForBook3 = new ArrayList<>();
//            authorsForBook3.add(generateAuthors().get(2));
//            Book book3 = new Book("Science and Technology", 2018, "978-5555555555", 4.2,
//                    authorsForBook3, Genre.SCIENCE_FICTION, 250, "Tech Publications");
//
//            List<Author> authorsForBook4 = new ArrayList<>();
//            authorsForBook4.add(generateAuthors().get(3));
//            Book book4 = new Book("Cooking Delights", 2015, "978-7777777777", 4.9,
//                    authorsForBook4, Genre.COOKING, 180, "Chef's Haven");
//
//            List<Author> authorsForBook5 = new ArrayList<>();
//            authorsForBook5.add(generateAuthors().get(4));
//            Book book5 = new Book("Thrilling Adventure", 2012, "978-3333333333", 4.7,
//                    authorsForBook5, Genre.ADVENTURE, 300, "Adventure Publications");
//
//            return List.of(book1, book2, book3, book4, book5);
//        }
    }
}
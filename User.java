import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    // constructor built in
    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public String getBorrowedBooks() {
        return this.books.toString();
    }

    public int age() {
        Period period = Period.between(this.birthDay, LocalDate.now());
        int age = period.getYears();
        return age;
    }

    // void means it doesn't return anythign at all
    public void borrow(Book book) {
        this.books.add(book);
    }
}

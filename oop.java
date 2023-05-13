import java.time.LocalDate;

class oop {
    public static void main(String[] args) {
        User youngerUser = new User("Kurtis", "1995-01-31");

        // no longer need with constructor
        /*
         * youngerUser.name = "Kurtis";
         * youngerUser.birthDay = LocalDate.parse("1995-01-31");
         */

        /*
         * User olderUser = new User();
         * olderUser.name = "Ivey";
         * olderUser.birthDay = LocalDate.parse("1992-02-14");
         */

        Book book = new Book("Awesome book", "Kurtis Ivey", 300);
        // youngerUser.borrow(book);

        AudioBook dracula = new AudioBook("Dracula", "bram stoker", 0, 200);

        Ebook jeeves = new Ebook("Carry on jeeves", "p.g", 2343, "pdf");
        /*
         * book.title = "Awesome book";
         * book.author = "Kurtis Ivey";
         * youngerUser.borrow(book);
         */

        /*
         * System.out.printf("%s was born back in %s, and he is %d years old",
         * youngerUser.name,
         * youngerUser.birthDay.toString(), youngerUser.age());
         */

        /*
         * System.out.printf("%s has borrowed these books : %s", youngerUser.name,
         * youngerUser.books.toString());
         */
        /*
         * System.out.printf("User has the name %s and was born on %s \n",
         * youngerUser.getName(),
         * youngerUser.getBirthDay());
         */
        System.out.println(dracula.toString());
        System.out.println(jeeves.toString());

    }
}

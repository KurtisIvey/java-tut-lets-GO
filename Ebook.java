public class Ebook extends Book {
    private String format;

    Ebook(String title, String author, int pageCount, String format) {
        // super refers to parent class of this class
        super(title, author, pageCount);
        this.format = format;
    }
}

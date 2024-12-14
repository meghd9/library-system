public class Member extends User {

    private Book book;


    public Member(String name, String id, int phone) {
        super(name, id, phone);
    }

    @Override
    public String toString() {
        return super.toString() + "Book: " + (book != null ? book.toString() : "No books borrowed");
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

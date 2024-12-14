import java.sql.SQLOutput;
import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private Author author;
    private Member member;
    private List<String> damages;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<String> getDamages() {
        return damages;
    }

    public void addDamage(String damage) {
        damages.add(damage);
    }

    public Boolean isAvailable() {
        return member == null;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Isbn: " + isbn);
        System.out.println("Author: " + (author != null ? author : "No author"));
        System.out.println("Borrowed by: " + (member != null ? member : "Available to borrow"));
        System.out.println("Damages: " + (damages != null ? damages : "No damages"));

    }


}

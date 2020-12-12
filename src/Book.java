import java.lang.*;

public class Book {
    private String name;
    private String genre;
    private int pages;

    public Book(String n, int p, String g) {
        name = n;
        pages = p;
        genre = g;
    }

    public Book(String n, String g) {
        name = n;
        pages = 0;
        genre = g;
    }

    public Book() {
        name = "Null";
        pages = 0;
        genre = "Null";
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre(String species) {
        return species;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return this.name + ", pages " + this.pages + ", genre " + this.genre;
    }

    public void Weight() {
        System.out.println(name + "'Book weight " + pages * 3 + " KB");
    }
}


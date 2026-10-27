package data;

public class Book {
    private String name ;
    private String author ;
    private int price ;
    private String language ;

    public Book( String name,String author, String language,int price) {
        this.price = price;
        this.name = name;
        this.language = language;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                " name='" + name + '\'' +
                ", language='" + language+'}';
    }
}

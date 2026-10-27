package data;

import java.util.ArrayList;

public class BookDa {
    private ArrayList<Book> books = new ArrayList<>() ;

    public BookDa() {
        books.add(new Book("java 1","Samer","java",60)) ;
        books.add(new Book("java 2","Samer","java",60)) ;
        books.add(new Book("c 1","Samer","c",60)) ;
        books.add(new Book("c 2","Samer","c",60)) ;

    }

    public ArrayList<Book> getBooks(String lang){
        ArrayList<Book> items = new ArrayList<>() ;
        for(Book b:books){
            if(b.getLanguage().equalsIgnoreCase(lang)){
                items.add(b) ;
            }
        }
        return items ;
    }
}

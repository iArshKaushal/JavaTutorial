package org.akk.oop_basic.g_relationships.aggregation;

import java.util.List;



class Book{
    String title;
}

class Library{
    List<Book> books; // Aggregation

    Library(List<Book> books){
        this.books = books;
    }
}


public class AggregationExample {
    public static void main(String[] args) {

    }
}

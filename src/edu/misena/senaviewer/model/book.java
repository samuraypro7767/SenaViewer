package edu.misena.senaviewer.model;

public class book {

    int id;
    String title;

    String edititionDate;
    String editorial;
    String[] authors = new String[5];
    int isbn;
    boolean readed;
    int timeReaded;

    public book(String title,
                String edititionDate,
                String editorial,
                int isbn ) {

        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;

    }

    public static  void see(){

    }

    public  static void getters(){

    }

    public static void setters(){

    }

}

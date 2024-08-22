package edu.misena.senaviewer.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class book {

    static int id;
    static String title;

    static String edititionDate;
    static String editorial;
    static String[] authors ;
    static int isbn;
    static boolean readed;
    static int timeReaded;

    public book(String title,
                String edititionDate,
                String editorial,
                int isbn ) {

        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;

    }

//  getter  método de acceso
    public static int getId() {
        return  id;
    }

//   setter método de modificación
    public void setId(int id) {
        this.id = id;
    }


    public static String getTitle() {
        return  title;
    }
    public  void setTitle(String title) {
        this.title = title;
    }


    public static String getEdititionDate() {
        return  edititionDate;
    }
    public  void setEdititionDate(String edititionDate) {
        this.edititionDate = edititionDate;
    }


    public static String getEditorial() {
        return  editorial;
    }
    public  void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public static String[] getAuthors() {
        return  authors;
    }

    public void setAuthors(String[] authors) {
        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = authors;
        }
    }


    public static int getIsbn() {
        return  isbn;
    }
    public  void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    public static boolean getReaded() {
        return readed;
    }
    public void setReaded(boolean readed) {
        this.readed = readed;
    }


    public static int getTimeReaded() {
        return timeReaded;
    }
    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

}

package edu.misena.senaviewer.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class book {

    int id;
    String title;

    String edititionDate;
    String editorial;
    String[] authors ;
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

//  getter  método de acceso
    public  int getId() {
        return  id;
    }

//   setter método de modificación
    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return  title;
    }
    public  void setTitle(String title) {
        this.title = title;
    }


    public String getEdititionDate() {
        return  edititionDate;
    }
    public  void setEdititionDate(String edititionDate) {
        this.edititionDate = edititionDate;
    }


    public String getEditorial() {
        return  editorial;
    }
    public  void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public String[] getAuthors() {
        return  authors;
    }

    public void setAuthors(String[] authors) {
        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = authors;
        }
    }


    public int getIsbn() {
        return  isbn;
    }
    public  void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    public boolean isReaded() {
        return readed;
    }
    public void setReaded(boolean readed) {
        this.readed = readed;
    }


    public int getTimeReaded() {
        return timeReaded;
    }
    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

}

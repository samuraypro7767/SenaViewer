package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine {

    static int id;
    static String title;
    static Date editionDate;
    static String editorial;
    static String[] authors;

    public Magazine(String title,Date edititionDate,String editorial){
        this.title = title;
        this.editionDate = edititionDate;
        this.editorial = editorial;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public static String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public static String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
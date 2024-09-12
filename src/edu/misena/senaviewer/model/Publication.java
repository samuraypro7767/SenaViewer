package edu.misena.senaviewer.model;

public class Publication {
     static  String title;
     static  String edititionDate;
     static  String editorial;
     static String[] authors;

     public Publication( String title, String edititionDate,String editorial ) {

          this.title = title;
          this.edititionDate = edititionDate;
          this.editorial = editorial;
     }

     public static String getTitle() {
          return title;
     }

     public static String getEdititionDate() {
          return edititionDate;
     }

     public static String getEditorial() {
          return editorial;
     }

     public static String[] getAuthors() {
          return authors;
     }

     public static void setTitle(String title) {
          Publication.title = title;
     }

     public static void setEdititionDate(String edititionDate) {
          Publication.edititionDate = edititionDate;
     }

     public static void setEditorial(String editorial) {
          Publication.editorial = editorial;
     }

     public static void setAuthors(String[] authors) {
          Publication.authors = authors;
     }
}

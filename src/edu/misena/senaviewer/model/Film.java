package edu.misena.senaviewer.model;

public class Film {

    static int id;
    static String title;
    static String genre;
    static String creator;
    static int duration;
    static Short year;
    static boolean viewed;


    public Film(String title, String genre, int duration, String creator) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }

    public Film(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public Film(String title, String genre, String creator, int duration) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;

    }

    public Film(String title, String genre, String creator, int duration, short year) {
     this.title = title;
     this.genre = genre;
     this.duration = duration;
     this.year = year;
    }


    public static int getId() {
        return id;
    }

    public static String getTitle() {
        return title;
    }

    public static String getGenre() {
        return genre;
    }

    public static String getCreator() {
        return creator;
    }

    public static int getDuration() {
        return duration;
    }

    public static short getYear() {
        return year;
    }

    public static boolean isViewed() {
        return viewed;
    }

    public static void setId(int id) {
        Film.id = id;
    }

    public static void setTitle(String title) {
        Film.title = title;
    }

    public static void setGenre(String genre) {
        Film.genre = genre;
    }

    public static void setCreator(String creator) {
        Film.creator = creator;
    }

    public static void setDuration(int duration) {
        Film.duration = duration;
    }

    public static void setYear(short year) {
        Film.year = year;
    }

    public static void setViewed(boolean viewed) {
        Film.viewed = viewed;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                '}';
    }
}

package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Chapter {
    int id;
    String title;

    int duration;
    short year;
    boolean viewed;

    int timeViewed;
    int sessionNumber;

    public Chapter (String title,int duration,short year){
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public short getYear(){
        return year;
    }

    public void setYear(short year){
        this.year = year;
    }

    public boolean getViewed (){
        return viewed;
    }

    public void setViewed(boolean viewed){
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public static void menuChapter(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

    }
}


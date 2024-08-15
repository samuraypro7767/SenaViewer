package edu.misena.senaviewer.model;

public class Chapter {

    int id;
    String title;
    int duration;
    int year;
    boolean viewed;
    int timeViewed;
    int sessionQuantity;

    public Chapter( String title, int duration, int year){
        this.title = title;
        this.duration = duration;
        this.year = year;

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







}

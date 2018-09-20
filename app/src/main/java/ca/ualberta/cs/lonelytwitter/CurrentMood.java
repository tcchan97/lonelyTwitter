package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood {
    private  String mood;
    private Date date;

    public CurrentMood(String mood){
        this.mood = mood;
        date = new Date(System.currentTimeMillis());
    }

    public CurrentMood(String mood, Date date){
        this.mood = mood;
        this.date = date;
    }

    public abstract void getMood();

    public void setDate(Date date){
        this.date = date;
    }
    public Date getDate(){
        return date;
    }

}

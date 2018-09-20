package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class SadMood extends CurrentMood {

    public SadMood(){
        super("sad");
    }


    @Override
    public void getMood(){
        Log.d("Mood", "I am sad");
    }

}

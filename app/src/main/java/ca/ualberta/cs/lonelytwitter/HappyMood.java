package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class HappyMood extends CurrentMood {

    public HappyMood(){
        super("Happy");
    }


    @Override
    public void getMood(){
        Log.d("Mood", "I am sad");
    }
}

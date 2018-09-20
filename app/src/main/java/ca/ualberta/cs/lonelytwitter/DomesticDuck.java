package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class DomesticDuck extends Animal implements FlyingBehavior {
    @Override
    public void swim(){
        Log.d("thomas", "swim: ");
    }

    public void fly(){
        Log.d("thomas","I only can fly");
    }
}

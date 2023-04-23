package com.effm00.state.states;

import com.effm00.state.State;
import com.effm00.state.Tamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Sleeping implements State {

    private Tamagotchi tamagotchi;

    @Override
    public void play() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void sayHowAreIt() {
        System.out.println("Zzz... Zzz...");
    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Sleeping.this.tamagotchi.setState(new Hungry());
            }
        }, 7000);
    }

}

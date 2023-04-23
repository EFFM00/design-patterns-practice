package com.effm00.state.states;

import com.effm00.state.State;
import com.effm00.state.Tamagotchi;

public class Tired implements State {

    private Tamagotchi tamagotchi;

    @Override
    public void play() {
        System.out.println("I can't to play. I need a break!");
    }

    @Override
    public void eat() {
        System.out.println("I don't want to eat!! I'm too tired");
    }

    @Override
    public void sleep() {
        System.out.println("Good night!! Zzz...");
        tamagotchi.setState(new Sleeping());
    }

    @Override
    public void sayHowAreIt() {
        System.out.println("I don't want to play!! I'm very tired");
    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

}

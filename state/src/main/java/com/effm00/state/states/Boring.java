package com.effm00.state.states;

import com.effm00.state.State;
import com.effm00.state.Tamagotchi;

public class Boring implements State {

    private Tamagotchi tamagotchi;

    @Override
    public void play() {
        System.out.println("Let's play!!");
        tamagotchi.setState(new Tired());
    }

    @Override
    public void eat() {
        System.out.println("I don't want to eat!!");
    }

    @Override
    public void sleep() {
        System.out.println("I don't want to sleep!!");
    }

    @Override
    public void sayHowAreIt() {
        System.out.println("I'm boring. I want to play!!");
    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
}

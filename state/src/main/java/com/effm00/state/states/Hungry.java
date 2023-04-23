package com.effm00.state.states;

import com.effm00.state.State;
import com.effm00.state.Tamagotchi;

public class Hungry implements State {

    private Tamagotchi tamagotchi;

    @Override
    public void play() {
        System.out.println("I don't want to play. I want some food!");
    }

    @Override
    public void eat() {
        System.out.println("So delicious!!");
        tamagotchi.setState(new Tired());
    }

    @Override
    public void sleep() {
        System.out.println("I don't need to sleep, I need food!!!");
    }

    @Override
    public void sayHowAreIt() {
        System.out.println("I'm very hungry and I want food!!!");
    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }


}

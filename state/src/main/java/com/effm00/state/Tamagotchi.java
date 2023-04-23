package com.effm00.state;

import com.effm00.state.states.Boring;

public class Tamagotchi {

    private State state;

    public Tamagotchi() {
        setState(new Boring());
    }

    public void setState(State state) {
        this.state = state;
        this.state.setTamagochi(this);
    }

    public void feed() {
        this.state.eat();
    }

    public void sleep(){
        this.state.sleep();
    }

    public void play() {
        this.state.play();
    }

    public void say() {
        this.state.sayHowAreIt();
    }
}

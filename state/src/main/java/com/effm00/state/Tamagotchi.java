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
}

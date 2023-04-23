package com.effm00.state;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateApplication {

	public static void main(String[] args) {

		Tamagotchi pixie = new Tamagotchi();

		new Menu(pixie).display();

	}
}

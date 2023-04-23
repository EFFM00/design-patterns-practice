package com.effm00.state;

import java.util.Scanner;

public class Menu {

    Tamagotchi tamagotchi;

    public Menu(Tamagotchi tamagochi) {
        this.tamagotchi = tamagochi;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        String mensajeOpciones = "Realizar acción: " +
                "a) alimentar, d) dormir, j) jugar, p) preguntar, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a': tamagotchi.feed(); break;
                case 'd': tamagotchi.sleep(); break;
                case 'j': tamagotchi.play(); break;
                case 'p': tamagotchi.say(); break;
                case 's': System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }


}

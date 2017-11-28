package juegoahorcado;

import java.util.Scanner;


class Jugador {
    private int ganadas;
   
    public Jugador(){
        ganadas = 0;
    }

    public int getGanadas() {
        return ganadas;
    }
    
    public boolean ganador(){
        return ganadas == 3;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }
    
    public Palabra introducirPalabra(){
        Scanner sc = new Scanner(System.in);
        String miPalabra;
        System.out.println("Escribe la palabra a adivinar: ");
        miPalabra = sc.nextLine();
        Palabra p = new Palabra(miPalabra);
        return p;
    }
    
}

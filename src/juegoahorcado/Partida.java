package juegoahorcado;

import java.util.Scanner;

public class Partida {

    private static Palabra palabraParaAdivinar;
    private static Palabra palabraAdivinada;
    private static String usadas;
    private static int vidas;
    private static int numPartidas;

    public Partida() {
        vidas = 6;
        usadas = "";
    }

    public static boolean preguntarLetra(char letra) {
        String aux = "";
        String aux2 = "";
        boolean encontrada = false;

        if (palabraParaAdivinar.getNumeroLetras() != 0) {
            for (int i = 0; i < palabraParaAdivinar.getNumeroLetras(); i++) {

                if (letra == (palabraParaAdivinar.getPalabra().charAt(i))) {
                    aux2 = aux2 + letra;
                    encontrada = true;
                } else {
                    aux2 = aux2 + palabraAdivinada.getPalabra().charAt(i);
                    aux = aux.concat(aux2);
                }
            }
            palabraAdivinada.setPalabraAhorcado(aux2);
        }
        return encontrada;
    }

    public static int getVidas() {
        return vidas;
    }

    public static void guardarUsadas(char a) {
        usadas = usadas + " " + a;
    }

    public static void inicializarAdivinada() {
        String cadena2 = new String(""), var2 = new String("_");
        for (int i = 0; i < palabraParaAdivinar.getNumeroLetras(); i++) {
            cadena2 = cadena2.concat(var2);
        }
        palabraAdivinada = new Palabra(cadena2);
    }

    public static boolean acierta() {
        return (palabraAdivinada.getPalabra().equals(palabraParaAdivinar.getPalabra()));
    }

    public static void dibujarAhorcado() {
        if (vidas == 6) {

            System.out.println(" ---------------------");
            for (int j = 0; j < 15; j++) {
                System.out.println(" |");
            }
            System.out.println("__________");
        } else if (vidas == 5) {
            System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            for (int j = 0; j < 10; j++) {
                System.out.println(" |");
            }
            System.out.println("__________");
        } else if (vidas == 4) {
            System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
            for (int j = 0; j < 5; j++) {
                System.out.println(" |");
            }
            System.out.println("__________");
        } else if (vidas == 3) {
            System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / |   ");
            System.out.println(" |                 /   |   ");
            System.out.println(" |                /    |   ");
            System.out.println(" |                     |   ");
            for (int j = 0; j < 5; j++) {
                System.out.println(" |");
            }
            System.out.println("__________");
        } else if (vidas == 2) {
            System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / | \\ ");
            System.out.println(" |                  /  |   \\ ");
            System.out.println(" |                 /   |     \\ ");
            System.out.println(" |                     |   ");
            for (int j = 0; j < 5; j++) {
                System.out.println(" |");
            }
            System.out.println("__________");
        } else if (vidas == 1) {
            System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / | \\ ");
            System.out.println(" |                  /  |   \\ ");
            System.out.println(" |                 /   |     \\ ");
            System.out.println(" |                     |   ");
            System.out.println(" |                    /  ");
            System.out.println(" |                   /      ");
            System.out.println(" |                  /       ");
            for (int j = 0; j < 2; j++) {
                System.out.println(" |");
            }
            System.out.println("__________");
        } else if (vidas == 0) {
            System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | X  X  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / | \\ ");
            System.out.println(" |                  /  |   \\ ");
            System.out.println(" |                 /   |     \\ ");
            System.out.println(" |                     |   ");
            System.out.println(" |                    / \\");
            System.out.println(" |                   /   \\  ");
            System.out.println(" |                  /     \\ ");
            for (int j = 0; j < 2; j++) {
                System.out.println(" |");
            }
            System.out.println("__________");
        }
    }

    public static void pierdeVida() {
        vidas--;
    }

    public static void main(String[] args) {

        System.out.println("Bienvenidos al Juego del Ahorcado");
        Jugador Jugador1 = new Jugador();
        Jugador Jugador2 = new Jugador();
        Scanner entero = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        char letra;
        int opcion;
        boolean mibool = false;

        while (numPartidas != 5 && !Jugador1.ganador() && !Jugador2.ganador()) {

            System.out.println("Victorias del Jugador 1: " + Jugador1.getGanadas());
            System.out.println("Victorias del Jugador 2: " + Jugador2.getGanadas());
            Partida p = new Partida();
            numPartidas++;
            System.out.println("----------------------------------");
            System.out.println("Partida " + numPartidas);
            palabraParaAdivinar = Jugador1.introducirPalabra();
            inicializarAdivinada();

            while ((acierta() == false) && (getVidas() > 0)) {
                dibujarAhorcado();
                System.out.println("");
                palabraAdivinada.mostrarEspecial();
                System.out.println("");
                System.out.println("Letras usadas: " + usadas);
                System.out.println("");
                System.out.println("1. Existe letra? .");
                System.out.println("2. Acertar palabra.");
                System.out.println("Elige una opcion: ");
                opcion = entero.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.printf("Escribir letra a buscar : ");
                        letra = entero.next().charAt(0);
                        mibool = preguntarLetra(letra);
                        if (mibool == false) {
                            pierdeVida();
                            guardarUsadas(letra);
                            dibujarAhorcado();
                        }
                        break;
                    case 2:
                        String s;
                        System.out.printf("Adivina palabra : ");
                        s = sx.nextLine();
                        if (palabraParaAdivinar.getPalabra().equals(s)) {
                            palabraAdivinada.setPalabraAhorcado(s);
                        } else {
                            System.out.println("Palabra incorrecta, pierdes una vida");
                            pierdeVida();
                            dibujarAhorcado();
                        }

                        break;
                    default:
                        System.out.println("ERROR: Opcion invalida");
                }

            }
            if (acierta()) {
                System.out.println("------------------------------------");
                System.out.println("Felicidades, has acertado la palabra :)");
                Jugador1.setGanadas(Jugador1.getGanadas() + 1);
                vidas = 6;
            } else {
                System.out.println("Lastima, has perdido :(");
                Jugador2.setGanadas(Jugador2.getGanadas() + 1);
            }
            System.out.println("------------------------------------");
            if (Jugador1.ganador()) {
                System.out.println("El Jugador 1 ha ganado el juego.");
            } else if (Jugador2.ganador()) {
                System.out.println("El Jugador 2 ha ganado el juego.");
            }
        }
    }
}

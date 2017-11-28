package juegoahorcado;

class Palabra {

    private String palabraAhorcado;

    public void setPalabraAhorcado(String palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    public Palabra(String s) {
        palabraAhorcado = s;
    }

    public String getPalabra() {
        return palabraAhorcado;
    }

    public int getNumeroLetras() {
        return palabraAhorcado.length();
    }

    public void mostrarPalabra() {
        palabraAhorcado.toString();
    }

    public void mostrarEspecial() {
        System.out.printf("Palabra: ");
        for (int i = 0; i < palabraAhorcado.length(); i++) {
            System.out.printf(" " + palabraAhorcado.charAt(i));
        }
    }

}

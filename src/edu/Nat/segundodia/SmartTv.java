package edu.Nat.segundodia;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        if (ligada == true) System.out.println("A TV encontra-se ligada");
    }

    public void desligar() {
        ligada = false;
        if (ligada == false) System.out.println("A TV encontra-se desligada");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("O volume aumentou para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
         System.out.println("O volume diminuiu para: " + volume);
    }

     public void aumentarCanal() {
        canal++;
         System.out.println("O canal aumentou para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
         System.out.println("O canal diminuiu para: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
         System.out.println("O canal mudou para: " + canal);
    }

}

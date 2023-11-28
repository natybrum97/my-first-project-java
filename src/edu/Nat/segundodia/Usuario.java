package edu.Nat.segundodia;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        // System.out.println("TV ligada? " + smartTv.ligada);
        // System.out.println("Qual o canal? " + smartTv.canal);
        // System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(35);
        
    }
}

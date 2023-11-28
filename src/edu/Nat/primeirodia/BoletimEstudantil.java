package edu.Nat.primeirodia;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 4;
        if (mediaFinal < 5) {
            System.out.println("REPROVADO");
        } else if (mediaFinal == 5) {
            System.out.println("NA MÉDIA");
        } else {
            System.out.println("APROVADO");
        }
    }
}

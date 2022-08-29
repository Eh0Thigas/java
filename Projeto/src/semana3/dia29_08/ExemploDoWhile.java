package semana3.dia29_08;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("DISCANDO....");

        do{
            //executando repetidas vezes até algume atender
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alô !!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) ==1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return atendeu;
    }
}
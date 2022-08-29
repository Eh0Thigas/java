package semana3.dia29_08;

import java.util.concurrent.ThreadLocalRandom;

public class Exemplowhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;

            while(mesada > 0){
                double valorDoce =  valorAleatorio();;
                if(valorDoce > mesada){
                    valorDoce = mesada;
                }

                System.out.println("Doce no valor de: " + valorDoce + " adicionado no carrinho");
                mesada = mesada -  valorDoce;
            }

            System.out.println("Mesada: "+ mesada);
            System.out.println("kleiton gastou a mesada inteira em doce");

            

    }

    //metodo valor aleatorio
            private static double valorAleatorio(){
                return ThreadLocalRandom.current().nextDouble(2,0);
            }
            
}

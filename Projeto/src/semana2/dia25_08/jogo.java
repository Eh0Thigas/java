package semana2.dia25_08;

import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random numero = new Random();
        int jogo = 0;
        int dado;
        int pontos = 0;

        do{
            System.out.println("seleione a opção");
            System.out.println("(1) - JOGAR DADO");
            System.out.println("(2) - VER PONTOS");
            System.out.println("(3) - PARAR DE JOGAR");

            jogo = s.nextInt();


            switch(jogo){
                case 1:
                    System.out.println("Jogandoo dado ...");
                    System.out.println(" .....");
                    dado = numero.nextInt(6);
                    System.out.println("O numero sorteado no dado foi: " + dado);

                    switch(dado){
                        case 1:
                            System.out.println("Voce perdeu 1 ponto");
                            pontos = pontos - dado;
                        break;

                        case 2: 
                            System.out.println("Voce ganhou 2 pontos");
                            pontos = pontos + dado;
                        break;

                        case 3: 
                            System.out.println("Voce perdeu 3 pontos");
                            pontos = pontos - dado;
                        break;

                        case 4: 
                            System.out.println("Voce ganhou 4 pontos");
                            pontos = pontos + dado;
                        break;

                        case 5: 
                            System.out.println("Voce perdeu 5 pontos");
                            pontos = pontos - dado;
                        break;

                        case 6: 
                            System.out.println("Voce ganhou 6 pontos");
                            pontos = pontos + dado;
                        break;

                        default : 
                            System.out.println("Voce não ganhou nenhum ponto");

                    }
                
                case 2: 
                    System.out.println("Seus pontos: " + pontos);
                case 3:
                    System.out.println("Saindo do jogo");
            }

        }while(jogo !=3);
        s.close();
    }
}

package semana3.dia29_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTry {
    public static void main(String[] args) {
        
        try{

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o seu nome: ");
            String nome = scan.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

        }catch(InputMismatchException e){
            // input equivicado de dados
            System.out.println("Os campos idade e altura precisam estar corretos");
        }
        //importante saber que erro esta sendo disparado para o devido try
    }
}

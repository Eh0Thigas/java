package semana2.dia22_08.contacorrente;
import java.util.Random;
import java.util.Scanner;

public class Correntista {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        Random numero = new Random();
        Scanner s = new Scanner(System.in);

        System.out.println(" --- Sistema De Conta Corrente --- ");

        System.out.println("\n");
        System.out.println("Seu nome por favor : ");
        String nome = s.nextLine();

        System.out.println("\n");
        System.out.println("Muito bem " + nome);

        conta.numeroConta =  numero.nextInt(1000);
        System.out.println("O numero da sua conta é: " + conta.numeroConta + " e agência: " + conta.agencia);
        System.out.println("Saldo Disponivel: " + conta.saldo);

        
      


    }
}

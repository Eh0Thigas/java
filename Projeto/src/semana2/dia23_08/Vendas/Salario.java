package semana2.dia23_08.Vendas;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        Vendas vendas = new Vendas();  
        
        System.out.println(" -- Registrados de Vendas ---");
        
        System.out.println("Digite o nome do funcionario: ");
        String nome = s.nextLine();
        
        System.out.println("Digite o salario fixo do " + nome + ": ");
        vendas.salario = s.nextDouble();

        
    }
}

package semana2.dia23_08.Vendas;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        Scanner c = new Scanner(System.in);
        Vendas vendas = new Vendas();  
        
        System.out.println(" --- Registrados de Vendas ---");
        
        //RECEBENDO O NOME DO FUNCIONARIO
        System.out.println("Digite o nome do/da funcionaria/o: ");
        vendas.vendedor = s.nextLine();
        
        //RECEBENDO O SALARIO DO FUNCIONARIO
        System.out.println("Digite o salario fixo do/da " + vendas.vendedor + ": ");
        vendas.salariofixo = s.nextDouble();

        //RECEBENDO O NOME DO PRODUTO
        System.out.println("O que a/o " + vendas.vendedor + " ficou encarregado de vender esse mês? ");
        vendas.produto = c.nextLine();

        //RECEBENDO O VALOR DO PRODUTO
        System.out.println("Qual o valor desse produto ( " + vendas.produto + " ) ?");
        vendas.vlrProduto = c.nextDouble();

        //RECEBENDO A QUANTIDADE DE VENDAS DO PRODUTO
        System.out.println("Quanto a/o " + vendas.vendedor + " vendeu de " + vendas.produto + "?");
        vendas.qntVendas = s.nextInt();

        vendas.TotalVendas();
        vendas.Comissao();
        vendas.CalSalario();

        // Imprimindo as informações 

        System.out.println("\n----- Informações ---");
        System.out.println("Nome funcionario: " + vendas.vendedor);
        System.out.println("Salario fixo: " + vendas.salariofixo);
        System.out.println("Quantidade de vendas de " + vendas.produto + ": " + vendas.qntVendas);
        System.out.println("Valor de " + vendas.produto + ": " + vendas.vlrProduto);
        System.out.println("Valor total de vendas de " + vendas.produto + ": " + vendas.totalVendas);
        System.out.println("Comissão do/da " + vendas.vendedor + ": " + vendas.comissao);
        System.out.println("Salario final nesse mes do " + vendas.vendedor + ": " + vendas.salario + "\n ");

        
       




        
    }
}

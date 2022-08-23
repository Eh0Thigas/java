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
        System.out.println(vendas.totalVendas);
        vendas.Comissao();
        System.out.println(vendas.comissao);
        vendas.CalSalario();
        System.out.println(vendas.salario);

        
       




        
    }
}

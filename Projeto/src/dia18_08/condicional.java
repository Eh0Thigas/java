package dia18_08;
import java.util.Scanner;
public class condicional {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int numero1 = 1, numero2 = 2;

        //Ve se o numero 1 é igual ao numero 2
        Boolean simnao = numero1 == numero2;
        System.out.println(simnao);

        //Ve se o numero 1 é maior que o numero 2
        simnao = numero1 >= numero2;
        System.out.println(simnao);

        //Ve se o numero 1 é menor que o numero 2
        simnao = numero1 <= numero2;
        System.out.println(simnao);

        //Ve se o numero 1 é diferente do numero 2
        simnao = numero1 != numero2;
        System.out.println(simnao);

        if(numero1 == numero2){
            System.out.println("condição verdadeira");
        }else{
            System.out.println("condição falsa");
        }

        //-------------------------------------------------------------------------------

        //String empresa1 = "Funtec";
        //String empresa2 = new String("Piso");

        //equals = empresa1.equals(empresa2);
        //System.out.println(equals);

        //-------------------------------------------------------------------------------

        /*
         CONDICIONAL E (and)
            tem que ser as duas condições estejam verdadeiras 
            |Condiçâo 1 |  Condição 2 | Resultado |
            |    não    |     não     |   não     |
            |    não    |     sim     |   não     |
            |    sim    |     não     |   não     |
            |    sim    |     sim     |   sim     |


            CONDICIONAL OR (or)
            tem que um das duas condições sejam verdadeiras 
            |Condiçâo 1 |  Condição 2 | Resultado |
            |    não    |     não     |   não     |
            |    sim    |     não     |   sim     |
            |    não    |     sim     |   sim     |
            |    sim    |     sim     |   sim     |
         */
        //-------------------------------------------------------------------------------
        //Exercicio 
        String Banco = "Itau";
        String Titular  = "jailson";
        double SaldoInicial = 234.56;
        double Retirada;
        double SaldoFinal;

        System.out.println("\nQual o nome do titular? ");
        String TitularVef = s.nextLine();
        System.out.println("\nQual o nome do Banco? ");
        String BancoVef = s.nextLine();
        

        
        if(TitularVef.equals(Titular) && BancoVef.equals(Banco)){
            System.out.println("Banco " + Banco + "\n" + "Bem vindo " + Titular);
        }else{
            System.out.println("Acesso Negado");
        }

        System.out.println("\nQuanto você quer retirar? ");
        Retirada = s.nextDouble();
        
        if(Retirada < SaldoInicial){
            System.out.println("Retirada com Sucesso");
            SaldoFinal = SaldoInicial - Retirada;
            System.out.println("Saldo final de " + SaldoFinal );
        }else{
            System.out.println("Retirada Negada por falta de saldo");
            System.out.println("Seu saldo é de " + SaldoInicial);
        }






    }
}

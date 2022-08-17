import javax.swing.JOptionPane;

public class TipoDados {
    public static void main(String[]args){

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        // TERÇA FEIRA; DIA 16/08/2022
        byte idade = 20;
        short ano = 2022;
        int cep = 14095070;
        String cpf = "48551201472";
        float pi = 3.14F;
        double salario = 1275.33;
        String nome = "Devervenson";
        

        //CAIXA DE MENSAGEM JOptionPane
        JOptionPane.showMessageDialog(null,"\nNome: " + nome +
        "\nIdade: " + idade + 
        "\nAno: " + ano +
        "\nCEP: " + cep +
        "\nCPF: " + cpf +
        "\nSalario: " + salario +
        "\nPi: " + pi + "\n");
        
        //TERMINAL
        System.out.println("\nNome:" + nome );
        System.out.println("Idade:" + idade );
        System.out.println("Ano:" + ano );
        System.out.println("CEP:" + cep );
        System.out.println("CPF:" + cpf );
        System.out.println("Salario:" + salario );
        System.out.println("Pi:" + pi+ "\n");

        int numero = 5;
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);

        //final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 3.15;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

    // QUARTA FEIRA DIA 17/08/2022
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; //superou o valor de 32767

        //int i1 = 100000000000; // muito grande 
        int i2 = 40000;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000050550000L;

        //float f1 = 4.5; // Precisa colocar o F se nao é double;
        float f2 = 10.6F;

        //Float e long precisam colocar F e L no final 

        double d1 = 85.69;
        double d2 = 99.040;

        char c1 = 'w';
        //char c2 = 'Tw'; // não pode 2 caracteres ou mais 
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Ciclano";
        String st3 = "hyiafefygyfgwygfu";

        //String dt1 = "10/12/2022"; não é o tipo de dado adequado 

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(st1);


    }
}

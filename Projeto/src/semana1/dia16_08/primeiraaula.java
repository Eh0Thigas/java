package semana1.dia16_08;
import javax.swing.JOptionPane;

public class primeiraaula {
    public static void main(String[] args) {
        //  TERÇA FEIRA; DIA 16/08/2022
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
        "\nPi: " + pi + "\n" );
        
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

      
    }
}

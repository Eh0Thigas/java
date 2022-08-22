package semana2.dia22_08.contacorrente;

public class Conta {
    
    String titular , agencia = "0049", dataAbertura;
    int numeroConta;
    double saldo = 1500, rendimento;


    public double Sacar(double valor){
        saldo = saldo - valor;
        return saldo;
    }

    public double Despositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public double calcularRendimento(double saldo){
        rendimento = (saldo*100) / saldo;
        return rendimento;
    }


}

package dia18_08;

public class BalancoTrimestral {
    
    public static void main (String[] args){
        int despesas_janeiro = 11000, despesas_Fevereiro = 22000, despesas_Marco = 15000;

        int despesasTrimestre = despesas_janeiro + despesas_Fevereiro + despesas_Marco;
        int mediapormes = despesasTrimestre / 3;

        System.out.println("\n" );
        System.out.println("-----Balanço Trimestral-----");
        System.out.println("Despesas de Janeiro: " + despesas_janeiro);
        System.out.println("Despesas de Fevereiro: " + despesas_Fevereiro);
        System.out.println("Despesas de Março: " + despesas_Marco);
        System.out.println("Despesas totais do semestre: " + despesasTrimestre);
        System.out.println("Média das Despesas desse semestre: "+mediapormes);
        System.out.println("\n" );
        


    }

}

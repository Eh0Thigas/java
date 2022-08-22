package semana1.dia18_08;

public class BalancoTrimestral {
    
    public static void main (String[] args){
        int despesas_janeiro = 11000, despesas_Fevereiro = 22000, despesas_Marco = 15000;

        int despesasTrimestre = despesas_janeiro + despesas_Fevereiro + despesas_Marco;
        int mediapormes = despesasTrimestre / 3;

        System.out.println("\n" );
        System.out.println("-----Balanço Trimestral-----");
        System.out.println("Despesas de Janeiro: R$ " + despesas_janeiro);
        System.out.println("Despesas de Fevereiro: R$ " + despesas_Fevereiro);
        System.out.println("Despesas de Março: R$ " + despesas_Marco);
        System.out.println("Despesas totais do semestre: R$ "  + despesasTrimestre);
        System.out.println("Média das Despesas desse semestre: R$ "+mediapormes);
        System.out.println("\n" );
        


    }

}

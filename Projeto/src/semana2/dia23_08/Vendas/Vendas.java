package semana2.dia23_08.Vendas;

public class Vendas {
    String vendedor, produto;
    double vlrProduto, salario, salariofixo, comissao;
    int qntVendas;

    public double CalComissao(int qntVendas, double vlrProduto){
        comissao = (qntVendas * vlrProduto) * (15 / 100);
        return comissao;
    }

    public double CalSalario(double comissao , double salariofixo){
        salario = salariofixo + comissao;
        return salario;
    }

}

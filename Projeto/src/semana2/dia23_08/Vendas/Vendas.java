package semana2.dia23_08.Vendas;

public class Vendas {
    String vendedor;
    String produto;
    double vlrProduto, salario, salariofixo, comissao , totalVendas;
    int qntVendas;
    double percentual = (15.0 / 100.0);

    public void TotalVendas(){
        totalVendas = vlrProduto * (double) qntVendas;
    }

    public void Comissao(){
        comissao = totalVendas * percentual;
    }

    public void CalSalario(){
        salario = salariofixo + comissao;
       
    }

}

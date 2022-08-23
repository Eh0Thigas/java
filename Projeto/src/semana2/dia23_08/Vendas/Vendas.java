package semana2.dia23_08.Vendas;

public class Vendas {
    //DECLARAÇÃO DAS VARIAVIES 
    String vendedor;
    String produto;
    double vlrProduto, salario, salariofixo, comissao , totalVendas;
    int qntVendas;
    double percentual = (15.0 / 100.0);

    //METODO PARA CALCULAR O TOTAL DAS VENDAS
    public void TotalVendas(){
        totalVendas = vlrProduto * (double) qntVendas;
    }

    //METODO PARA CALCULAR A COMISSAO
    public void Comissao(){
        comissao = totalVendas * percentual;
    }

    //METODO PARA CALCULAR O SALARIO
    public void CalSalario(){
        salario = salariofixo + comissao;
       
    }

}

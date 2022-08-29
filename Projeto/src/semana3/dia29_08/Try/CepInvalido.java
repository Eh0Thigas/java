package semana3.dia29_08.Try;

public class CepInvalido {
    
    public static void main(String[] args) {
        //CRIANDO a classe de exceção
        try{
            String cepFormatado = formatarCep("1405110");
            System.out.println(cepFormatado);
        }catch (CepInvalidado e){
            System.out.println("O cep não corresponde as regras");
            e.printStackTrace();
        }
    }
    //o fato de usar o formatarCepja exige que eu use o try catch 
    //pq ela é uma exception, não é um erro, mas uma exceção

    static String formatarCep(String cep) throws CepInvalidado{
        if(cep.length() != 8){
            //se for diferente de 8 lança a exceção
            throw new CepInvalidado(); //condição que ele irá lançar
        }
        return "14.015-110"; //simulando um cep formatado
    }
}

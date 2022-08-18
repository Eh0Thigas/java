package dia18_08;

public class condicional {
    public static void main(String[] args){
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

    }
}

package dia18_08;

public class repeticao {
    public static void main (String[] args){
        int idade = 15;
        

        /*
         * O WHILE normalmente usado para criar laços de repetições onde nao sabemos
         * quantas repetições iremos fazer furante a execução do codigo.
         * então: 
         * while(condição de parada)  ou seja  enquando nao atender a condição de parada
         * continuara a repetir o codigo dentro do while
         */
        while(idade<=18){
            System.out.println(idade);
            //idade ++;
            idade = idade + 1;
        }


    }
}

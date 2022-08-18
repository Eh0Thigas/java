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

        while(idade<=18){ // enquanto a idade for menor ou igual a 18 continuara repitindo
            System.out.println(idade);
            //idade ++;
            idade = idade + 1;
        }

        /*
         *o FOR já é diferente na  sintaxe mas quase igual na pratica (execução), usamos
         ele para executar x vezes que escolhemos e com as condições de parada tbm
         for(inicializção da variavel de contagem; condição de parada; decremento ou incremento da variavel de contagem){
            e o codigo que esta aqui dentro repetira até a condição de parada ser atendida
         } 
         */

         for(int i = 0; i < 100; i++){
            
         }
    }
}

package dia17_08;

public class variaveis {
    public static void main(String[]args){
    byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; //superou o valor de 32767

        //int i1 = 100000000000; // muito grande 
        int i2 = 40000;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000050550000L;

        //float f1 = 4.5; // Precisa colocar o F se nao é double;
        float f2 = 10.6F;

        //Float e long precisam colocar F e L no final 

        double d1 = 85.69;
        double d2 = 99.040;

        char c1 = 'w';
        //char c2 = 'Tw'; // não pode 2 caracteres ou mais 
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Ciclano";
        String st3 = "hyiafefygyfgwygfu";

        //String dt1 = "10/12/2022"; não é o tipo de dado adequado 

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(st1);
        System.out.println(c3);
        System.out.println((int)c1);

        for(int i = 0; i <= 10; i++){
            System.out.println("\n"+ st1 + " tem " + b1 + " reais na conta");
            b1--;
            System.out.println(st2 + " tem " + b2 + " reais na conta a mais que " + st1);
            b2++;
        }
    }
}

import java.lang.reflect.Array;



public class dia17_08 {
    public static void main(String[]args){

    // QUARTA FEIRA DIA 17/08/2022
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

        /* Conversões (casting) 
        Upcast(implicito) - promoção de um tipo 
        DownCast - transforma uma variavel pra um tipo menor
        */ 

        byte by1;
        short sh1 = 1000;
        by1 = (byte) sh1; //downcast ..resultado -24; perda de informação
        System.out.println("\n");
        System.out.println(sh1);
        System.out.println(by1);
        
        
        long lo1;
        int in1 = 10;
        lo1 = in1; //  = 10
        System.out.println("\n");
        System.out.println(in1);
        System.out.println(lo1);

        int in2;
        long lo2 = 1000000000000000000L;
        in2 = (int) lo2; // = -148664554
        System.out.println("\n");
        System.out.println(lo2);
        System.out.println(in2);

        int in3;
        long lo3 = 100001;
        in3 = (int) lo3; // downcast sem perda pois entra no inteiro
        System.out.println("\n");
        System.out.println(lo3);
        System.out.println(in3);

        double do1;
        float fl1 = 10.5f;
        do1 = fl1; //upcast
        System.out.println("\n");
        System.out.println(fl1);
        System.out.println(do1);

        float fl2;
        float fl3;
        double do2 = 10000.58d; //downcast cabe dentro do float 
        fl2 = (float) do2;
        System.out.println("\n");
        System.out.println(do2);
        System.out.println(fl2);

        double do3 = 10000.588888888888888888888888888888888888888888888888888d;
        fl3 = (float) do3; // perda de informação
        System.out.println("\n");
        System.out.println(do3);
        System.out.println(fl3);

        int i4;
        float f4 = 11.5687f;
        i4 = (int) f4;
        System.out.println("\n");
        System.out.println(f4);
        System.out.println(i4);
        System.out.println("\n");

        // Dividindo com inteiros 1/2 vai dar 0
        int h1 = 5 , h2 = 4;
        System.out.println(h1/h2);

        // Dividindo com double 1/2 vai dar 0.5
        double h3 = 1, h4 = 2;
        System.out.println(h3/h4);

    }
}

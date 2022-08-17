package dia17_08;

public class conversoes {
    public static void main(String[] args) {
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

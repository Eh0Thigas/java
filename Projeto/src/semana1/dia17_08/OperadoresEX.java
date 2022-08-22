package semana1.dia17_08;

public class OperadoresEX {
    public static void main(String[] args) {
        System.out.println("PREPOS");
        prePos();
        System.out.println("\nARITIMETICO");
        aritimetico();
        System.out.println("\nATRIBUIÇÃO");
        atribuicao();
        System.out.println("\nPRECEDENCIA");
        precedencia();
        System.out.println("\nNEGATIVO");
        negativo();
    }

    private static void prePos(){
        int k = 10;
        System.out.println("k: " + k);

        int i = ++k; //soma 1 = 11
        int j = k--; //j recebe 11 e o k se transforma em 10 (subtrai 1 de 11)
        int x = k; // x recebe k

        // Saida de dados 
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
        System.out.println("k: " + k);
        

    }

    private static void aritimetico(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
       

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("\n");
        System.out.println("A + B = " + r1);
        System.out.println("C - A = " + r2);
        System.out.println("D * B = " + r3);
        System.out.println("E / A = " + r4);
        System.out.println("C % B = " + r5);
    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("-------------------------------------------");
        System.out.println(i);
        System.out.println(j);
        System.out.println(l);
        System.out.println(k);
        System.out.println(f);
        System.out.println("d: " + d);

        i += 5; //i = i + 5
        j -= 3; //j = j - 3
        d /= 2.7d; // d = d / 2.7
        l *= 3; //l = l * 3
        k %= 2; // k = k % 2
        
        System.out.println("-------------------------------------------");
        System.out.println(i);
        System.out.println(j);
        System.out.println(d);
        System.out.println(l);
        System.out.println(k);

        i = k = j; // j = 12, k recebe 12, i recebe 12
        
        System.out.println("-------------------------------------------");
        System.out.println(k);
        System.out.println(i);

    }

    private static void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580
        System.out.println("a = (i++ + --j * k): " + a);
        System.out.println("i: " + i);

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1
        System.out.println("k / --i % + 1: " + b);
        System.out.println("i: " + i); // 10

        int c = 2;
        c *= i += 5; // c = 2 * i; i = 1 + 5 -> c = 2 * i; i = 10 + 5; c = 2 * 15; c = 30
        System.out.println(c);
    }

    private static void negativo(){
        int numero = 5;
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero  = numero * -1;
        System.out.println(numero);
     }
}

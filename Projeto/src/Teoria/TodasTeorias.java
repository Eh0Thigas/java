package Teoria;

public class TodasTeorias {
    public static void main(String[] args) {
    /* 

------------- VARIAVIES ------------------------------------

        -Temos como principal uso na programação o uso de variaveis 
        que são objetos que tem objetivo armazenar valores de acordo com o seu "tipo"
        Temos elas:
            
                * short = variavel que contém inteiros de 16 bits (2 bytes) com sinal, que variam de no valor de -32.768 a +32.767. 
            EX:
                short s1 = 20000;
                short s2 = 40000; // vai dar problema pois superou o valor de 32767

            
                * int = variavel que contém numeros inteiros de 32 bits (4 bytes) com sinal, que variam de -2.147.483.648 a +2.147.483.647
            EX:    
                int i1 = 100.000.000.000; // muito grande 
                int i2 = 40000;
            
                * long = variavel que contém inteiros de 64 bits (8 bytes) com sinal, que variam de -9.223.372.036.854.775.808 a +9.223.372.036.854.775.808
            EX:
                long l1 = 1000000000000000000L;
                long l2 = 2004005000050550000L;
            
                * float  = variavel  utilizada para armazenar números reais 32 bits (4bytes) com sinal
            EX:
                float f1 = 4.5; // Precisa colocar o F se nao é double;
                float f2 = 10.6F;

            OBS: Float e long precisam colocar F e L no final 

       // double d1 = 85.69;
        //double d2 = 99.040;

        //char c1 = 'w';
        //char c2 = 'Tw'; // não pode 2 caracteres ou mais 
        //char c3 = '\u0057';

        //String st1 = "Fulano";
        //String st2 = "Ciclano";
        //String st3 = "hyiafefygyfgwygfu";

        //String dt1 = "10/12/2022"; não é o tipo de dado adequado 

        //boolean bo1 = true;
        //boolean bo2 = false;


        /* Conversões (casting) 
        Upcast(implicito) - promoção de um tipo 
        DownCast - transforma uma variavel pra um tipo menor
        */ 

        /* OPERADORES 
        ==
        != 
        <
        >
        <=
        >=
        aritimeticos 
        unarios
        relacionais 
        logicos
        ternarios
        

        OPERADOR DE ATRIBUIÇÃO
        simbolo de igualdade ( = )
        String nome = "Thiago"
        int idade = 20;
        double peso = 40.3;
        char sexo = 'm';
        boolean doadorOrgao = false;
        Date datadenascimento = newDate();
         
        String nome = "Thiago";
        int idade = 20;
        double peso = 40.3;
        char sexo = 'm';
        boolean doadorOrgao = false;
         
         OPERADORES ARITIMETICOS
          são eles : + (adição); - (subtração); * (multiplicação); / (divisão); % (modulo)

          adição para variaveis do tipo texto concatenação
          String nomeCompleto = "Shirlei" + "Maria";
          concatenacao1 = 1+1+1+"1";
          concatenacao2 = "1"+1+1+1;  1111
          concatenacao3 = 1+"1"+1+"1";  1111
          concatenacao4 = 1+1+1+"1";  1111
          concatenacao5 = 1+(1+1+1);  13

          += ( quando usa += significa q o ultimo valor da variavel mais outro numero)
          EX:  c = 2;
               c +=3; 
               entao fica 
               c = c + 3;
               c = 2 + 3
               c = 5;
          
          -= ( quando usa -= significa q o ultimo valor da variavel menos outro numero)
          EX:  c = 3;
               c -=2; 
               entao fica 
               c = c - 2;
               c = 3 - 2
               c = 1;
          
          *= ( quando usa *= significa q o ultimo valor da variavel vezes outro numero)
          EX:  c = 2;
               c *=3; 
               entao fica 
               c = c * 3;
               c = 2 * 3
               c = 6;

          /= ( quando usa /= significa q o ultimo valor da variavel dividido por outro numero)
          EX:  c = 6;
               c /=2; 
               entao fica 
               c = c / 2;
               c = 6 / 2;
               c = 3;




        OPERADORES UNARIOS

        (+) numeros positivos 
        (-) numeros negativos
        (++) incremento
        (--) decremento
        OBS: a ordem do incremento ou decremento importam na ordem 
          Ex:
          i++;  o valor de i vai ser incrementado depois 
          ++i; agr ele ira incrementar antes 
          A mesma coisa com o decremento 
          i--;  o valor de i vai ser decrementado depois 
          --i; agr ele ira decrementar  antes 

        (!) logico de negacao EX: boolean mentiroso = true;  !mentiroso; vai dar false
         


        OPERADORES TERNARIOS 
        Expressões sempre boolean e ver se torna um true ou false 
        EX:
        String resultado = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado);


        OPERADORES RELACIONAIS
        Esses operadores avaliam a relação e a condição entre duas variaveis 
        vendo se o da esquerda é maior, menor, igual, diferente e resultam em true ou false;

        
        */

        //String empresa1 = "Funtec";
        //String empresa2 = new String("Piso");

        //equals = empresa1.equals(empresa2);
        //System.out.println(equals);

        //-------------------------------------------------------------------------------

        /*
         CONDICIONAL E (and)
            tem que ser as duas condições estejam verdadeiras 
            |Condiçâo 1 |  Condição 2 | Resultado |
            |    não    |     não     |   não     |
            |    não    |     sim     |   não     |
            |    sim    |     não     |   não     |
            |    sim    |     sim     |   sim     |


            CONDICIONAL OR (or)
            tem que um das duas condições sejam verdadeiras 
            |Condiçâo 1 |  Condição 2 | Resultado |
            |    não    |     não     |   não     |
            |    sim    |     não     |   sim     |
            |    não    |     sim     |   sim     |
            |    sim    |     sim     |   sim     |
         */
        //-------------------------------------------------------------------------------
        //Exercicio 
        /* 
        // Criação das variavies
        String Banco = "Itau";
        String Titular  = "jailson";
        double SaldoInicial = 234.56;
        double Retirada;
        double SaldoFinal;

        // ENtrada de dados pelo terminal
        System.out.println("\nQual o nome do titular? ");
        String TitularVef = s.nextLine();
        System.out.println("\nQual o nome do Banco? ");
        String BancoVef = s.nextLine();
        
        //Verificação dos dados obtido
        
        if(TitularVef.equals(Titular) && BancoVef.equals(Banco)){  // Se nome do titular e nome do banco corretos
            
            System.out.println("\nBanco " + Banco + " ----- " + "Bem vindo " + Titular);
            //Entrada de dados para a retirada do dinheirp
            System.out.println("\nQuanto você quer retirar? "); 
            Retirada = s.nextDouble();
            //verificação se o valor da retirada é menor que o saldo 
            if(Retirada < SaldoInicial){
                System.out.println("Retirada com Sucesso");
                SaldoFinal = SaldoInicial - Retirada;
                System.out.println("Saldo final de " + SaldoFinal );
            }else{ // se não 
                System.out.println("Retirada Negada por falta de saldo");
                System.out.println("Seu saldo é de " + SaldoInicial);
            }


        }else{ // se não 
            System.out.println("Acesso Negado");
        }

        // o que a professora fez  
        if(Titular.equals("jailson") && Banco == "Itau"){
            System.out.println("Condição ok");
        }


        
        //-------------------------------------------------------------------------------
        // Exercicio
        Scanner s = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = s.nextInt();
        
        boolean paipresente = false;

        if(idade < 18 && !paipresente){
            System.out.println("Precisa da presença dos pais");
        }else{
            System.out.println("Autorizado a assinar");
        }
        */



        /*
         * O WHILE normalmente usado para criar laços de repetições onde nao sabemos
         * quantas repetições iremos fazer furante a execução do codigo.
         * então: 
         * while(condição de parada)  ou seja  enquando nao atender a condição de parada
         * continuara a repetir o codigo dentro do while
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
         
         // Exemplo onde o for vai d i = 0 até 99 pois i < 100
         // e dentro do for colocamos uma condição que
         //quando chegar entre 50 e 60 o laço de repetição nao 
         // imprimira os numeros dentro do intervalo
         for(int i = 0; i < 100; i++){
            if(i > 50 && i < 60){
                continue; // se o numero dar entre 50 e 60 ele não imprime ele continua a contagem
            }
            System.out.println(i);
         }
         
         
    
        Sempre que criamos um arquivo java, ira vir ja pé definido com 
         * o nome da classe
         *  e devera ser sempre em Maisculo a primeira letra
         * ex : Classes.java    ira vir pre definido 
         *          public class Classes(){
         * 
         *          }
         * 
         * e ser a classe for executavel 
         * ira ter q ter o metodo unico 
         *  public static void main(String[] args){
         *  
         *  }
         * 
         * é indicado que nos projetos tenha somente uma classe que tenha esse 
         * metodo main
         * 
         * 
         * ----------------------------------------------------------------------------------------
         * 
         *  PACKAGES  
         * 
         * os packages são os pacotes onde nossas classes irao ficar salvas e 
         * organizadas 
         * 
         * EX : 
         *      > exemplo
         *        tanannam.java 
         *        tururu.java
         *        terere.java
         * 
         * e no codigo fonte colocamos ou ja vem definido 
         *          
         *          package 22_08;
         * 
         *          public class aprendendoClasse {
         *              public static void main(String[] args){
         * 
         * 
         *              }
         *          }
         * 
         * ----------------------------------------------------------------------------------------
         * 
         * METODOS 
         *  os metodos são as ações do nosso codigo 
         * perguntas sobre metodos 
         * 1 - QUal a proposta principal do metodo?
         * 2 - Qual o tipo de retorno esperado apos executar o metodo?
         * 3 - QUal os parametros serão necessarios para a execução do metodo?
         * 4 - O metodo possui o risco de apresentar alguma exeção?
         * 5 - Qual a visibilidade do metodo?
         * 
         * 
         * Ex:
         * 
         * public class MyClass{
         * 
         *  public double soma(int num1 , int num2){
         *     //LOGICA - 
         *     return num1 + num2;
         *  }
         * 
         *  public void imprimir(){
         *     System.out.println();
         *  }
         * }
         */
        

          /*
         *  PALAVRAS RESERVADAS 
         *  as palavras reservadas são paçavras onde em java por exemplo
         * não poderão ser usadaspor exemplo em nomes de variaveis, metodos
         * 
         * Abstract
            Assert
            Boolean
            Break
            Byte
            Case
            Catch
            Char
            Class
            Const
            Continue
            Default
            Do
            Double
            Else
            Enum
            Extends
            Final
            Finally
            Float
            For
            Goto
            If
            Implements
            Import
            Instanceof
            Int
            Interfaces
            Long
            Native
            New
            Package
            Private
            Protected
            Public
            Return
            Short
            Static
            Strictfp
            Super
            Switch
            Synchronized
            This
            Throw
            Throws
            Transient
            Try
            Void
            Volatile
            While

            Modificadores de acesso
                private: acesso apenas dentro da classe

                protected: acesso por classes no mesmo pacote e subclasses

                public: acesso de qualquer classe

            Modificadores de classes, variáveis ou métodos
                abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata

                class: especifica uma classe

                extends: indica a superclasse que a subclasse está estendendo

                final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada

                implements: indica as interfaces que uma classe irá implementar

                interface: especifica uma interface

                native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C

                new: instancia um novo objeto, chamando seu construtor

                static: faz um método ou variável pertencer à classe ao invés de às instâncias

                strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões

                synchronized:indica que um método só pode ser acessado por uma thread de cada vez

                transient: impede a serialização de campos

                volatile:indica que uma variável pode ser alterada durante o uso de threads

            Controle de fluxo dentro de um bloco de código
                break: sai do bloco de codigo em que ele está

                case: executa um bloco de código dependendo do teste do switch

                continue:pula a execução do código que viria após essa linha e vai para a próxima passagem do loop

                default:executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro

                do:executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente

                else: executa um bloco de código alternativo caso o teste if seja falso

                for:usado para realizar um loop condicional de um bloco de código

                if: usado para realizar um teste lógico de verdadeiro o falso

                instanceof: determina se um objeto é uma instância de determinada classe, superclasse ou interface

                return: retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)

                switch:indica a variável a ser comparada nas expressões case

                while: executa um bloco de código repetidamente enquanto a condição for verdadeira

            Tratamento de erros
                assert: testa uma expressão condicional para verificar uma suposição do programador

                catch: declara o bloco de código usado para tratar uma exceção

                finally:bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção

                throw:usado para passar uma exceção para o método que o chamou

                throws: indica que um método pode passar uma exceção para o método que o chamou

                try: bloco de código que tentará ser executado, mas que pode causar uma exceção

            Controle de pacotes
                import:importa pacotes ou classes para dentro do código

                package: especifica a que pacote todas as classes de um arquivo pertencem

            Primitivos
                boolean:um valor indicando verdadeiro ou falso

                byte: um inteiro de 8 bits (signed)

                char: um caracter unicode (16-bit unsigned)

                double: um número de ponto flutuante de 64 bits (signed)

                float: um número de ponto flutuante de 32 bits (signed)

                int: um inteiro de 32 bits (signed)

                long: um inteiro de 64 bits (signed)

                short: um inteiro de 32 bits (signed)

            Variáveis de referência
                super: refere-se a superclasse imediata

                this: refere-se a instância atual do objeto

            Retorno de um método
                void: indica que o método não tem retorno

            Palavras reservadas não utilizadas
                const: Não utilize para declarar constantes; use public static final

                goto: não implementada na linguagem Java por ser considerada prejudicial



                https://docs.oracle.com/javase/7/docs/api/index.html


                    TAGS 

                    @autor  - autor do progeto 
                    @version - versão 
                    @since  - data do arquivo
                    @param   - parametros
         * 
         */


         /*
         * 
         * --------- VETORES E MATRIZES --------------
         * 
         * VETORES 
         *  São sequencias de dados 
         *  Estruturas de dados que contém itens 
         *  do mesmo tipo
         *  Uma vez criadas mantém o mesmo tamanho
         *
         *  vetor (array unidimensional)
         *  matriz (array bidimensional)
         * 
         *  Ex: 
         *  
         *  String nome[0] = args [0]; os array na linha
         *  String sobrenome = args [1]; 
         *  int idade = Integer.valueOf(args[2]);
         *  double altura = Double.valueOf(args[3]);
         * 
         * 
         * 
         * 
         * os arquivos .class ficam na pasta bin 
         * os executaveis
         * 
         * 
         * 
         *  ----- JOptionPane ------
         * 
         * o JOptionPane é um metodo usado para saida ou entrada de dados 
         * JOptionPane é uma classe que possibilita a criação de uma caixa de dialogo padrão que ou solicita um valor para o usuário ou retorna uma informação. Abaixo encontra-se alguns metodos e parametros mais utilizados quando se opta pelo JOptionPane.

            Métodos

            Método	Descrição
            showConfirmDialog	Solicita uma confirmação como(YES, NO, CANCEL)	 
            showInputDialog	Solicita algum valor	 
            showMessageDialog	Informa ao usuário sobre algo	 
            showOptionDialog	Unificação dos tres acima	 
            Parametros

            Parametro	Descrição
            parentComponent	Define a caixa de diálogo onde irá aparece todo o conteúdo. Há duas maneiras de definir a caixa de diálogo a primeira você mesmo cria utilizando os conceitos da classe JFrame. A segunda, você define esse parametro como null e o java irá gerar uma caixa de diálogo padrão.	 
            message	É a messagem que o usuário deve ler. Esta mensagem pode ser uma simples String ou um conjunto deobjetos.	 
            messageType	Define o estilo da mensagem. O gerente de aparencia pode expor a caixa de dialogo de formas diferentes,dependendo deste valor, pode fornecer um icone padrão.Exemplos:
            ERROR_MESSAGE
            INFORMATION_MESSAGE
            WARNING_MESSAGE
            QUESTION_MESSAGE
            PLAIN_MESSAGE
            
            optionType	Define o conjunto de botões que irá aparecer na parte inferior da caixa de diálogo. Exemplos:
            DEFAULT_OPTION
            YES_NO_OPTION
            YES_NO_CANCEL_OPTION
            OK_CANCEL_OPTION
 
        Exemplo

        1. Mostra um diálogo de erro que exibe a mensagem “alerta”:

            JOptionPane.showMessageDialog(null, “alerta”,
                “alerta”, JOptionPane.ERROR_MESSAGE);


        2. Mosta um painel de informação com as opções Sim/Não e exibe a mensagem: ‘Escolha um:’

            JOptionPane.showConfirmDialog(null,”Escolha um:”,
                “Escolha um”,JOptionPane.YES_NO_OPTION);


        3. Mostrar uma janela de aviso com as opções OK, CANCELAR, o texto ‘Aviso’ no título e a mensagem ‘Clique em OK para continuar:

            Object[] options = { “OK”, “CANCELAR” };
            JOptionPane.showOptionDialog(null, “Clique OK para continuar”, “Aviso”,
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);


        Note que se eu adicionar mais um item no vetor options, automaticamente adicionar mais um botão de opção com o nome que eu colocar.

            Object[] options = { “OK”, “CANCELAR”,”VOLTAR” };
            JOptionPane.showOptionDialog(null, “Clique OK para continuar”, “Aviso”,
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);

        4. Mostra uma caixa de diálogo solicitando que o usuário digite uma string:
        String inputValue = JOptionPane.showInputDialog(“Please input a value”);


        5. Mostra uma caixa de diálogo solicitando que o usuário selecione uma item:


        Object[] itens = { “MAÇA”, “PERA”, “BANANA” };
            Object selectedValue = JOptionPane.showInputDialog(null,
                “Escolha um item”, “Opçao”,
                    JOptionPane.INFORMATION_MESSAGE, null,
                        itens, itens [0]); //

         * 
         * Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         * Scanner scanner = new Scanner(System.in).useLocale(Locale.PTBR);
         * 
         * Locale.setDefault(new Locale("pt", "BR"));
         * 
         * 
         * 
         * em adicionar configurações e/ou abrir configurações
         * voce procura as configurações do seu codigo e ja adiciona por exemplo
         * os valores nas variavies para poupar tempo
            "args": ["nome" , "1500" , "sabão", "5" , "10"]
         * 
         */



    }
}

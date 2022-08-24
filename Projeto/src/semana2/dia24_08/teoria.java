package semana2.dia24_08;

public class teoria {
    public static void main(String[] args) {
        
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
         * 
         */



    }
}

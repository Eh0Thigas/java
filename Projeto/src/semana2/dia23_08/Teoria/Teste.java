package semana2.dia23_08.Teoria;



import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        
         
        String str_n1 = JOptionPane.showInputDialog("Primeiro número: ");
        System.out.println(str_n1);

       
        JOptionPane.showConfirmDialog(null,
        "please choose one", "information",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);


    }
}

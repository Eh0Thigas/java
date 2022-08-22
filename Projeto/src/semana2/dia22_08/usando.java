package semana2.dia22_08;

import java.util.Scanner;

public class usando {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Radio caixinha = new Radio();

        String status , volume;
        if(caixinha.ligada == true){
            status = "Ligada";
        }else{
            status = "Desligada";
        }
        System.out.println("A caixinha de som está: "+ status);


        System.out.println("Quer ligar?");
        String ligar = s.nextLine();

        if(ligar == "Sim"){
            caixinha.Ligar();
            System.out.println("A caixinha de som está: "+ status);
        }else if(ligar == "Não"){
            caixinha.Desligar();
            System.out.println("A caixinha de som está: "+ status);
        }


        System.out.println("Aumentar ou Diminuir volume?");
        volume = s.nextLine();

        if(volume == "Aumentar"){
            caixinha.AumentarVolume();
        }else if (volume == "Diminuir"){
            caixinha.DiminuirVolume();
        }

    }
}

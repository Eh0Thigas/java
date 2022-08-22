package semana2.dia22_08;

import java.util.Scanner;

public class usando {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Radio caixinha = new Radio();

        System.out.println("A caixinha de som está: "+ caixinha.ligada);
        System.out.println("Volume está em: " + caixinha.volume);
        System.out.println("O Bluetooth "+ caixinha.bluetooth);
// ----------------------------------------------------------------------------------------
//---------------------------LIGAR---------------------------------------------------------
        
        System.out.println("Quer ligar?");
        String ligar = s.nextLine();

        if(ligar.equals("sim")){
            caixinha.Ligar();
            System.out.println("A caixinha de som está: "+ caixinha.ligada);
        }else if(ligar.equals("nao")){
            caixinha.Desligar();
            System.out.println("A caixinha de som está: "+ caixinha.ligada);
        }
// ----------------------------------------------------------------------------------------
//---------------------------VOLUME--------------------------------------------------------

        System.out.println("\n");
        System.out.println("Aumentar ou Diminuir volume?");
        String volume = s.nextLine();

        if(volume.equals("Aumentar")){
            caixinha.AumentarVolume();
            System.out.println("Volume para " +caixinha.volume);
        }else if (volume.equals("Diminuir")){
            caixinha.DiminuirVolume();
            System.out.println("Volume para "+caixinha.volume);
        }

// ----------------------------------------------------------------------------------------
//---------------------------BLUETOOTH-----------------------------------------------------

        System.out.println("\n");
        System.out.println("Ligar Bluetooth?");
        String blue = s.nextLine();


        if(blue.equals("sim")){
            caixinha.Proucurar();
            System.out.println("Ligando bluetooth " + caixinha.bluetooth);
        }else{
            System.out.println("Desligando bluetooth " + caixinha.bluetooth);
        }

// ----------------------------------------------------------------------------------------
//---------------------------PAUSE---------------------------------------------------------

        System.out.println("\n");
        System.out.println("Pause?");
        String pause = s.nextLine();


        if(pause.equals("sim")){
            caixinha.Proucurar();
            System.out.println("Pausando " + caixinha.pause);
        }else{
            caixinha.Normal();
            System.out.println("Tocando " + caixinha.pause);
        }


    }
}

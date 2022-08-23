package semana2.dia22_08.Radio;

import java.util.Scanner;

public class usando {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Radio caixinha = new Radio();
        String status;

        System.out.println("A caixinha de som está: "+ caixinha.ligada);
        System.out.println("Volume está em: " + caixinha.volume);
        System.out.println("O Bluetooth "+ caixinha.bluetooth);
// ----------------------------------------------------------------------------------------
//---------------------------LIGAR---------------------------------------------------------
        
        System.out.println("Quer ligar?");
        String ligar = s.nextLine();

        if(ligar.equals("sim")){
            caixinha.Ligar();
            if(caixinha.ligada){
                status = "Ligando";
                System.out.println(status);
            }
        }else if(ligar.equals("nao")){
            caixinha.Desligar();
            if(!caixinha.ligada){
                status = "Desligando";
                System.out.println(status);
            }
            
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
            if(caixinha.bluetooth){
                status = "Ligando Bluetooth";
                System.out.println(status);
            }
        }else{
            caixinha.Normal();
            if(!caixinha.bluetooth){
                status = "Desligando Bluetooth";
                System.out.println(status);
            }
            
        }

// ----------------------------------------------------------------------------------------
//---------------------------PAUSE---------------------------------------------------------

        System.out.println("\n");
        System.out.println("Pause?");
        String pauses = s.nextLine();


        if(pauses.equals("sim")){
            caixinha.Pausar();
            if(caixinha.pause){
                status = "Pausando";
                System.out.println(status);
            }
                
        }else{
            caixinha.Continuar();
            if(!caixinha.pause){
                status = "Tocando";
                System.out.println(status);
            }
        }


    }
}

/*
 * @autor Thiago Laurenti Coelho 
 *  @version Java 11
 *  @since 22/08/2022
 */
package semana2.dia22_08.Radio;

public class Radio {
    
    int volume = 10;
    boolean bluetooth = false;
    boolean pause = false;
    boolean ligada = false;

    public void Ligar(){
        ligada = true;
    }

    public void Desligar(){
        ligada = false;
    }

    public void Pausar(){
        pause = true;
    }

    public void Continuar(){
        pause = false;
    }

    public void AumentarVolume(){
        volume++;
    }

    public void DiminuirVolume(){
        volume--;
    }

    public void Proucurar(){
        bluetooth = true;
    }

    public void Normal(){
        bluetooth = false;
    }

}

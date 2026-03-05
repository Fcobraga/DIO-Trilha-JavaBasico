/* vamos cria um exemplo de uma classe para representa uma SmartTV onde:
1. Ela tenha as caracteristicas: ligada(boolean), canal(int), volume(int)
2. Nossa TV podera liga e desliga e assim muda o estado ligada
3. Nossa TV aumentara e diminuira o volume sempre em +1 ou -1
4. Nossa TV podera mudara de canal de 1 em 1 ou definindo o numero correspodente
*/
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void mudarCanalCima(){
        canal++;
    }
    public void mudarCanalBaixo(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;// As duas formas de emcremento são validas
    }
    public void baixaVolume(){
        volume = volume - 1;// As duas formas de emcremento são validas
    }

    public void ligar(){
        ligada = true;// passo o valor verdadeiro
    }

    public void desligar(){
        ligada = false;// passo o valor falso
    }
}

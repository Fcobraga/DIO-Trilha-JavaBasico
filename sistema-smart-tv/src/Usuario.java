public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();// criação de classe
        // status inicial
        System.out.println("SmartTV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
//Mudança de canal
        smartTv.mudarCanal(55);
           System.out.println("O canal que vc escolheu e : " + smartTv.canal);
        smartTv.mudarCanalCima();
        smartTv.mudarCanalCima();
           System.out.println("A tv esta no canal: " + smartTv.canal);
// Status da tv
        smartTv.ligar();
           System.out.println("Novo status --> Tv ligada? "+ smartTv.ligada);
        smartTv.desligar();
           System.out.println("Novo status --> Tv ligada? "+ smartTv.ligada);
// Teste de volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
           System.out.println("Volume atual : " + smartTv.volume);
    }
}

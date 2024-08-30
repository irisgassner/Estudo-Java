public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar();

        System.out.println("Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        
        System.out.println("Tv Ligada ? " + smartTv.ligada);


        System.out.println("Volume Atual :" + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();


        System.out.println("Canal Atual :" + smartTv.canal);
        smartTv.mudarCanalDireita();
        smartTv.mudarCanalDireita();
        smartTv.mudarCanalDireita();
        System.out.println("Canal Atual :" + smartTv.canal);
        smartTv.mudarCanalEsquerda();
        System.out.println("Canal Atual :" + smartTv.canal);
        smartTv.mudarCanal(24);

        System.out.println("Canal Atual : "+ smartTv.canal);

    }


}

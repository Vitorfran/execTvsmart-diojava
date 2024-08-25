
public class usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.aumentarvolume();

        System.out.println("Canal: " + smartTv.canal);
        
        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);


        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo status - TV ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println(" Novo status - TV ligada? : " + smartTv.ligada);




    }
}

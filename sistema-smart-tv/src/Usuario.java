public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        // Ligar a TV
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        
        // Aumentar o volume da TV
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        
        // Diminuir o volume da TV
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        
        // Mudar o canal para 13
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        
        // Desligar a TV
        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

    }
}

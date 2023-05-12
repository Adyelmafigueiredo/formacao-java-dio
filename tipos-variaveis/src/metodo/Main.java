package metodo;

public class Main {
    public static void main(String[] args) {
        Metodo smartTv = new Metodo();

        System.out.println("a TV está ligada? " + smartTv.ligada);
        System.out.println("O canal atual é "+ smartTv.canal);
        System.out.println("O volume é " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("a Tv etá ligada? " + smartTv.ligada);
    }

}

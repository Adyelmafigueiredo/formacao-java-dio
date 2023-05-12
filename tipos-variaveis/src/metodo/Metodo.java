package metodo;

public class Metodo {
    /*int a;
    int b;
    public double somar(int a, int b){
        return this.a + this.b;
         O método é público e retorna um valor 
    }

    public void imprimir(String texto){
        Logica - finalidade do método
        aqui não precisa de return, pois não retornará nem um resultado.
    }

     throws exception: indica que o método poderá gerar uma exceção*/

     boolean ligada = false;
     int canal = 1;
     int volume = 25;

     public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando o volume para " + this.volume);
     }

     public void diminuirVolume(){
        this.volume--;
        System.out.println("Diminuindo o volume para " + this.volume);
     }
     public void mudarCanal(int novoCanal){
        canal = novoCanal;
     }
     public void ligar(){
        ligada = true;
     }
     public void desligar(){
        ligada = false;
     }
    
}


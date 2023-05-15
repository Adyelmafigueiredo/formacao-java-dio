public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
     // Estrutura condicional simples
     double saldo= 25;
     double valorSolicitado= 17;

     if( valorSolicitado < saldo){
        saldo= saldo - valorSolicitado;
        System.out.println(saldo);
     }
     // Estrutura condicional composta
     double nota = 6.0;
     
     if( nota >= 5) {
        System.out.println("aprovado");
     }else{
        System.out.println("reprovado");
     }

     
    }
}

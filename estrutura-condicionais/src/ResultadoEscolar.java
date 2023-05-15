public class ResultadoEscolar {
    public static void main(String[] args) {
    // estruturas condicionais encadeadas
        int nota = 6 ;

        if(nota >= 7){
            System.out.println("Aprova");
        }else if (nota >= 5 && nota < 7){
            System.out.println("Prova de Recuperação");
        } else{
            System.out.println("Reprovado");
        }

        // condição ternária
        
        int nota2 = 7;
        String portugues = nota2 >=7 ? "Aprovado" : "Reprovado";
        System.out.println("Português " + portugues);

        int nota3= 5;
        String matematica = nota3 >= 7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
        System.out.println("Matemática " + matematica);
    }
}

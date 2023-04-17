import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Operador {
    public static void main(String[] args) {
        // operador de atribuição é =
        //exemplo:
        String nome = "Adyelma";
        int idade = 33;
        double peso = 62.500;
        char sexo = 'M';

        // operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão)
        
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 34;
        int multiplicacao = 20 * 8;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // devolve o resto da divisão
        double resultado = (10 *    7) + (20 / 4);
        String curso = "formação " + "Java"; // concatenação
        System.out.println(curso);

        // operador Unário: incrementar (++), decrementar (--), inverter valores numéricos (+ ou -) e booleanos (!)
        int numero = 5;
         System.out.println(- numero);
         System.out.println(numero);

         numero = - numero; // deixar o numero negativo
         System.out.println(numero);
         numero = numero * -1;

        // incremento
        int variavel = 5;
        
        System.out.println(variavel ++); 
        System.out.println(variavel);

        // decremento
        System.out.println(-- variavel);

        //negação
        boolean mentira = true;
        System.out.println(!mentira);
        System.out.println(mentira);
        mentira = !mentira;
        System.out.println(mentira);

        //Operador Ternário
        
    }
}

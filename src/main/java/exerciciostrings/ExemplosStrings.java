package exerciciostrings;

import java.util.Locale;

public class ExemplosStrings {

    public static void main(String[] args) {
        //exercicioString();
        //exercicioSubstring();
        //exercicioLowerUpper();

        //Poderia chamar direto o método após a ""
        //System.out.println("Onde há fumaça há fogo".toUpperCase());

        //compareTo/compareToIgnoreCase
        // == VS compareTo VS compareToIgnoreCase
        //System.out.println("Dog" == "Dog");
        //System.out.println("Dog" == new String("Dog"));
        //System.out.println("Dog".compareTo("DOG"));
        //System.out.println("Dog".compareToIgnoreCase("DOG"));

        //trim
        // "      se     nh     a    "

        //isEmpty
        // "" vs "   "

        //indexOf
        // e-mail válido? seuemail@email.com

        //replaceAll
        // Cão que ladra *não* morde

        //startsWith/endsWith
        // seusite.com ?.com

        //format
        // Total: 125 tomates

        //valueOf/charAt/getBytes
        // 890, 157L, primeiro char, documento em bytes
    }

    private static void exercicioLowerUpper() {
        //toLowerCase/toUpperCase
        String ditado = "Onde há fumaça há fogo";

        System.out.println(ditado);
        System.out.println(ditado.toLowerCase());
        System.out.println(ditado.toUpperCase());
    }

    private static void exercicioSubstring() {
        //Substring - Primeiro caracter de um texto
        String texto = "Filho de peixe, peixinho é";
        System.out.println(texto);

        //Primeira letra = .substring(0, 1)
        //A partir da segunda letra = .substring(1)
        //Da letra 10 até a 20: .substring(10, 20)
        String primeiraLetra = texto.substring(0, 1);
        System.out.println("Inicial: "+primeiraLetra);
    }

    public static void exercicioString(){
        //Split - quebra CSV (nome,idade)
        // Gilberto,33
        String csv = "Gilberto,33;Rua Borges De Medeiros-75;(51) 9929394";
        String[] partesCsv = csv.split("[,;]"); //Regex: [,;] quer dizer "," OU ";"
        for (String parte : partesCsv){
            System.out.println("Parte: "+parte);
        }
    }
}

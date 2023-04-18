/**
 * Fluxo Condicionais 
 * Utilização de - IF, ELSE, ELSE IF
 * @author Gisele M.N.H.
 */
public class condicionais{
   
    public static void main(String[] args){
        // exemplo if:
        int idade = 8;
        int numero = 8;
        int idade2 = 26;
        if(idade <= 8){
            System.out.println("É uma criança");
            System.out.println("-------------");
        }

        // exemplo if / else:
        if((numero%2)== 0){
            System.out.println("O número é par");
            System.out.println("-------------");
        }

        // exemplo if /else if / else:
        if(idade2 <= 8){
            System.out.println("É uma criança");
            System.out.println("-------------");
        }else if(idade2 >= 8 && idade2 <= 18){
            System.out.println("É um adolescente");
            System.out.println("-------------");
        }else if(idade2 > 18 && idade2 <= 60) {
            System.out.println("É um adulto");
            System.out.println("-------------");
        }else{
            System.out.println("Terceira Idade");
            System.out.println("-------------");
        }

    }
}
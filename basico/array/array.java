/**
 * Estrutura de Arrays
 * Array simple e utilizando util.Arrays
 * @author Gisele M.N.H.
 */

import java.util.Arrays;

public class array{
    public static void main(String[] args){
        // array simples ....... saída = Brasil
        String[] paises = {"Brasil","India","China","Rússia"};
        System.out.println(paises[0]);

        // com java util ...... Saída = [Brasil, India, China, Rússia]
        System.out.println(Arrays.toString(paises));

        //buscando pais por elemento ......saída = 0
        int posicao = Arrays.binarySearch(paises, "Brasil");
        System.out.println(posicao);

        //usando sort.......... saída = [Brasil, China, India, Rússia]
        Arrays.sort(paises,0,paises.length); // ordena o array a partir do 0
        System.out.println(Arrays.toString(paises));

         // arrrays de duas dimensões
        String [] [] duasDim = {{"Maria","Feminino", "SP"}, {"Joana","F", "SC"}};
        System.out.println(duasDim[0][0]); // Saída = maria
        System.out.println(duasDim[0][1]); // Saída = feminino
        System.out.println(duasDim[0][2]); // Saída = sp
        System.out.println(duasDim[1][0]); // Saída = joana
        System.out.println(duasDim[1][1]); // Saída = f
        System.out.println(duasDim[1][2]); // Saída = sc

    }
}
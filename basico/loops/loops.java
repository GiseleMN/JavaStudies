/**
 * Estruturas de repetição. (laços / loops)
 * Utilização de - while, do_while, for
 * @author Gisele M.N.H.
 */
public class loops{
   
    public static void main(String[] args){
        
        int num1 = 0;
        int num2 = 2;

        // exemplo while: ...... saída = 0,1,2
        while(num1<3){
            System.out.println(num1);
            num1++;
            System.out.println("----------");  
        }              

        // exemplo do_while:.... saída = 2,3
        do{
            System.out.println(num2);
            num2++;
            System.out.println("+++");  
        }while(num2<4);
        

        // exemplo for:......saída = 0,1,2,3,4
        for(int num3 = 0; num3 < 5; num3++){
            System.out.println(num3);
            System.out.println("===");  
        }
        

    }
}
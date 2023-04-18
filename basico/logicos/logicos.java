/**
 * Operadores\Operadores Matemáticos
 * Operadores Lógicos
 * classes - demonstrar operador lógico &&
 *           demonstrar operador lógico ||
 *           demonstrar operador lógico !
 * @author Gisele M.N.H.
 */
public class logicos{
   
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        System.out.println(a && b);
        System.out.println(a && c);
        System.out.println(b && c);
        System.out.println(b && d);
        System.out.println("-------------");

        System.out.println(a||b);
        System.out.println(b||d);
        System.out.println("-------------");

        System.out.println(!a);
        System.out.println(!(b||d));

    }
}
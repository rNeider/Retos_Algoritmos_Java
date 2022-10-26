
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");  


        //definir un objeto
        Scanner leer=new Scanner(System.in); 

        //defina radio de circulo y calcula el area

        //dato de entrada
        final double PI= 3.1416;
        double radio,area;
        System.out.println("ingrese el radio del circulo");
        radio=leer.nextFloat();
        //
        area= PI*radio*radio;

        //salida
        System.out.println("El area del circulo con radio "+radio+"es"+area);
        leer.close();
        ///////////////////////////////////////
        
        
    




    }





}

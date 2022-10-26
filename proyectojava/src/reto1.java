import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) {
        
        //definir un objeto
        Scanner leer=new Scanner(System.in); 

        //defina radio de circulo y calcula el area

        //dato de entrada
        float Centigrados;
        int Fahrenheit;
            System.out.println("ingrese los grados Fahrenheit");
        Fahrenheit=leer.nextInt();
        //proceso de informacion
        Centigrados=(float) ((Fahrenheit-32) /1.8);

        //salida
        System.out.println("La cantidad de grados Fahrenheit a Centigrados  "+Fahrenheit+ " es "+Centigrados);
        leer.close();
        
        








    }



}





    


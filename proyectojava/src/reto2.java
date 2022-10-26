import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        
               //definir un objeto
               Scanner leer=new Scanner(System.in); 

               //defina radio de circulo y calcula el area
       
               //dato de entrada
               double dosisvacuna,pesobebe,mesesbebe;
               
               System.out.println("ingrese el peso del bebe");
               pesobebe=leer.nextDouble();
               System.out.println("ingrese los meses del bebe");
               mesesbebe=leer.nextDouble();
               System.out.println("el peso del bebe es "+pesobebe+" la edad del bebe es "+mesesbebe);

               //proceso de informacion
               dosisvacuna=(pesobebe+10)/(mesesbebe*10)*8;
       
               //salida
               System.out.println("La dosis de vacuna que se le aplica al bebe es "+dosisvacuna+ " miligramos");
               leer.close();
       
           }
      }



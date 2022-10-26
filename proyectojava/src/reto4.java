import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        
        System.out.println("Juego piedra-papel-tijera");
        Scanner leer = new Scanner(System.in);
 
        int computadora = (int)(Math.random() *3) + 1;//de 1 a 3
        System.out.println("La computadora ya escogio...");
 
        System.out.println("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
        int participante = leer.nextInt();
 
        System.out.println("La computadora habia escogido: ");
        switch ( computadora )
        {
            case 1:
                System.out.println("Piedra");
                switch ( participante )
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Usted gana!"); break;
                   case 3: System.out.println("La computadora gana!"); break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( participante )
                {
                   case 1: System.out.println("La computadora gana!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Usted gana!"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( participante )
                {
                   case 1: System.out.println("Usted gana!"); break;
                   case 2: System.out.println("La computadora gana!"); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
                
        }
        leer.close();
    }      
}


 


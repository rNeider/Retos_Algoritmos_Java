import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
        

        Scanner leer = new Scanner(System.in);

        int moneda,eleccion;

        moneda=(int)(Math.random()*2)+1;
        
        System.out.println("digite 1 para escoger sello o 2 para cara");
        eleccion=leer.nextInt();
        
        if (moneda==1 && eleccion==1){
            System.out.println("salio cara usted escogio cara");
        }
        
        else if(moneda==2 && eleccion==2){
        System.out.println("Salio cara usted escogio sello , Perdio");
        }

        else if(moneda==2 && eleccion==1){
            System.out.println("Salio sello usted escogio cara , Perdiste");
        }
        
        else if(moneda==1 && eleccion==2)
        System.out.println("digitaste una opcion incorrecta");

        else{
            System.out.println("Digitaste una opcionn incorrecta");
        }

        leer.close();
    }  
}

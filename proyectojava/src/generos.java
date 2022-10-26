import java.util.Scanner;
public class generos {
    public static void main(String[] args) {
              
        int h=0,m=0;
        String generoOpcion;
        String hombre="h",mujer="m";
        Scanner leer=new Scanner(System.in); 

        for( int x=1; x<=10; x++){
            System.out.println("Eres hombre o mujer , digite h si es hombre o m si es mujer");
            generoOpcion=leer.next();

            if (generoOpcion.equalsIgnoreCase(hombre)){
             h=h+1;
             System.out.println("van "+h +" hombres");
             }

            else if (generoOpcion.equalsIgnoreCase(mujer)){
                m=m+1;
                System.out.println("van "+m+" mujeres" );
                
            }
             else{

                System.out.println("siga las instrucciones");
                                
            }
                             
        }
        System.out.println("El total de hombres es de "+h+" el total de mujeres es de "+m);

        leer.close();




    }
    
}

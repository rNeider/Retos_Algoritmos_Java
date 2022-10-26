import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        
        Double valornotas,subtotalnotas=0.0,totalnotas=0.0;
        Scanner leer=new Scanner(System.in);

        for (int x=1; x<=4; x++){
            
            System.out.println("digite el valor de la nota de 1 a 5");
            valornotas=leer.nextDouble();
            subtotalnotas=subtotalnotas+valornotas;
        }
        totalnotas=subtotalnotas/4;
        if (totalnotas<=0.0 || totalnotas<=2.9 ){
            System.out.println("Reprobaste la asignatura con una nota de "+totalnotas);
            
        }
        else if (totalnotas<=3.0 || totalnotas<=4.0){
            System.out.println("Aprobaste raspando la asignatura con una nota de "+totalnotas);
        }
        else if ( totalnotas<=4.0 || totalnotas<=5.0){
            System.out.println("Aprobaste con honores y tu nota es de "+totalnotas);
        }
        else {
            System.out.println("Digite denuevo las notas");
        }

        leer.close();    
    } 
}

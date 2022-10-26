import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        int op,num1,num2;
       

        System.out.println("digite su usuario");

       
        
        
        System.out.println("menu opciones \n 1.suma \n2. resta \n3. multiplicacion \n4. division \n5.potencia \n6.raiz \n ingreses el numero de la opcione que decea realizar ");
        op=leer.nextInt();
        System.out.println("ingrese el numero 1");
        num1=leer.nextInt();
        System.out.println("ingrese el numero 2");
        num2=leer.nextInt();


        switch (op){
            case 1:
                int suma=num1+num2;
                System.out.println("El numero"+num1 +" se sumo con el"+num2 +" y el resultado es "+suma);
                break;
                
            case 2:
                int resta=num1+num2;
                System.out.println("El numero "+num1 +" se resto con el numero"+num2+ " y el resultado es "+resta);

                break;
            case 3:
                int multiplicacion=num1+num2;
                System.out.println("El numero "+num1 +" se multiplico con el numero"+num2 +" y el resultado es "+multiplicacion);
                break;
            case 4:
                int division=num1+num2;
                System.out.println("El numero "+num1 +" se dividio con el numero"+num2 +" y el resultado es "+division);
                break;

            case 5:
                int potencia=num1+num2;
                System.out.println("El numero "+num1 +" se elevo a la potenciacion "+num2 +" y el resultado de la potenciacion es "+potencia );
                break;

            case 6:
                double raiz1=Math.sqrt(num1);
                double raiz2=Math.sqrt(num2);
            
                System.out.println("La raiz cuadrada de "+num1 +" es "+raiz1 +" y la de "+num2 +" es "+raiz2 );
            break;    
            default:
                break;
        }
        leer.close();



    }
}

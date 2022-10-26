import java.util.Scanner;
public class precioproducto {

    public static void main(String[] args) {
        

        int precio,cantidad,referencia=0,subtotal,total=0,pagocliente,cambio;
        String Si="si";
        String VerificacionTelefonia;
        Scanner leer=new Scanner(System.in);

        for( int x=1; x<=5; x++){
            System.out.println("digite el precio del prodcuto");
            precio=leer.nextInt();

            System.out.println("digite la cantidad de productos");
            cantidad=leer.nextInt();
            subtotal=precio*cantidad;
            System.out.println(cantidad+" del producto de " +precio+ "es "+subtotal);

            referencia=referencia+1;

            total=total+subtotal;

        }
        System.out.println("el total de su compra es "+total);
        System.out.println("la cantidad de minutos de la compra es "+referencia);
        

        System.out.println("digite el valor del billete con el que va a pagar ");
        pagocliente=leer.nextInt();

        cambio=pagocliente-total;
        System.out.println("usted pago con cun billete de " +pagocliente+ "y el valor de la compra fue de "+total+ " y su cambio es de "+cambio);

        VerificacionTelefonia=leer.next();
        
        if (VerificacionTelefonia.equalsIgnoreCase(Si)){

            System.out.println("la cantidad de la compra fue"+referencia);
            
        }
        else{
            System.out.println("No pierdas mas minutos,adquiere ya tu telefonia exito");
        }


        leer.close();


    }
}





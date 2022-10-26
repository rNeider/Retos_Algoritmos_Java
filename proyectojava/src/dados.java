import java.util.Scanner;
public class dados {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int dado1=1,dado2=1;

        dado1=(int)(Math.random()*6)+1;
        dado2=(int)(Math.random()*6)+1;
        
        if (dado1==1 && dado2==1){
        System.out.println("el lanzamiento arrojo " +dado1+ " y "+dado2+ " salio un par de unos en los dados,Ganaste");
        }
        else if (dado1==1 && dado2==1){
            System.out.println("el lanzamiento arrojo " +dado1 +" y "+dado2+ " salio un total de tres en los dados, Ganaste");
        }
        else if (dado1==1 && dado2==1){
            System.out.println("el lanzamiento arrojo " +dado1 +" y "+dado2+ "salio un total de once en los dados, Ganaste");
        }
        else if (dado1==1 && dado2==1){
            System.out.println("el lanzamiento arrojo " +dado1 +" y "+dado2+ " salio un total de doce en los dados, Ganaste");
        }
        else if (dado1==1 && dado2==1){
            System.out.println("el lanzamiento arrojo"+dado1 +" y "+dado2+ " salio un total de siete en los dados, Ganaste");
        }
        else {
            System.out.println("el lanzamiento arrojo"+dado1 +" y "+dado2+ " En el lanzamiento no callo en ninguna situacion para ganar, Perdiste xd");

        }
        
        
        leer.close();
    }
}

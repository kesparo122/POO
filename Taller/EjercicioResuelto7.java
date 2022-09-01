package Taller;
import java.util.Scanner;

class EjercicioResuelto7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double A,B;
        System.out.println("Ingrese A");
        A = entrada.nextDouble();
        System.out.println("Ingrese B");
        B = entrada.nextDouble();
        entrada.close();
        
        if (A > B){
            System.out.println("A es mayor que B");
        }
        else if (A==B){
            System.out.println("A es igual que B");
        }
        else{
            System.out.println("A es menor que B");
        }
        
    }
}

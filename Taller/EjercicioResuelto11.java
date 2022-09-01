package Taller;
import java.util.Scanner;

class EjercicioResuelto11 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int N1,N2,N3,MAYOR;
        System.out.println("Ingrese entero 1");
        N1 = entrada.nextInt();
        System.out.println("Ingrese entero 2");
        N2 = entrada.nextInt();
        System.out.println("Ingrese entero 3");
        N3 = entrada.nextInt();
        entrada.close();
        MAYOR=0;
        
        if (N1>N2 && N1>N3){
            MAYOR=N1;
        }
        else if (N2>N1 && N2>N3){
            MAYOR=N2;
        }
        else if (N3>N1 && N3>N2){
            MAYOR=N3;
        }
        
        System.out.println("EL VALOR MAYOR ENTRE: "+N1+", "+N2+ ", " +N3+ " ES: "+MAYOR);
    }
}

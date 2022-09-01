package Taller;
import java.util.Scanner;

class EjercicioResuelto10 {
    public static void main(String[] args) {
        Scanner entradaStr= new Scanner(System.in);
        Scanner entradaDou= new Scanner(System.in);
        double PAT,EST,PAGMAT;
        String NI,NOM;
        System.out.println("Ingrese numero de inscripcion");
        NI = entradaStr.nextLine();
        System.out.println("Ingrese nombres");
        NOM = entradaStr.nextLine();
        System.out.println("Ingrese patrimonio");
        PAT = entradaDou.nextDouble();
        System.out.println("Ingrese estrato social");
        EST = entradaDou.nextDouble();
        entradaStr.close();
        entradaDou.close();
        
        PAGMAT = 50000;
        
        if (PAT > 2000000 && EST > 3){
            PAGMAT = PAGMAT + PAT*0.03;
        }
        
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+NI+" Y NOMBRE "+NOM+ " DEBE PAGAR: $" +PAGMAT);
    }
}
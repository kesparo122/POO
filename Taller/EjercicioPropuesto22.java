package Taller;

import java.util.Scanner;

class EjercicioPropuesto22 {
    public static void main(String[] args) {
        Scanner entradaStr= new Scanner(System.in);
        Scanner entradaDou= new Scanner(System.in);
        double SPH,H,Sueldo;
        String NE;
        System.out.println("Ingrese nombre");
        NE = entradaStr.nextLine();
        System.out.println("Ingrese salario basico por hora");
        SPH = entradaDou.nextDouble();
        System.out.println("Ingrese horas trabajadas en el mes");
        H = entradaDou.nextDouble();
        entradaStr.close();
        entradaDou.close();
        
        Sueldo = SPH*H;
        
        if (Sueldo > 450000){
            System.out.println(NE+" "+Sueldo);
        }
        else{
            System.out.println(NE);
        }
    }
}
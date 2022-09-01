package Taller;
import java.util.Scanner;

class EjercicioPropuesto18 {
    public static void main(String[] args) {
        Scanner entradaStr= new Scanner(System.in);
        Scanner entradaDou= new Scanner(System.in);
        double HTrab,ValH,PorRF,SalarioBruto,SalarioNeto;
        String Cod,Nom;
        System.out.println("Ingrese codigo del empleado");
        Cod = entradaStr.nextLine();
        System.out.println("Ingrese nombre");
        Nom = entradaStr.nextLine();
        System.out.println("Ingrese numero de horas trabajadas al mes");
        HTrab = entradaDou.nextDouble();
        System.out.println("Ingrese valor hora trabajada");
        ValH = entradaDou.nextDouble();
        System.out.println("Ingrese porcentaje de retencion en la fuente");
        PorRF = entradaDou.nextDouble();
        entradaStr.close();
        entradaDou.close();
        
        SalarioBruto = HTrab*ValH;
        SalarioNeto = SalarioBruto-SalarioBruto*PorRF;
        
        System.out.println("Codigo: "+Cod+", nombre: "+Nom+", salario bruto: "+SalarioBruto+", salario neto: "+SalarioNeto);
    }
}
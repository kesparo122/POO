package taller;

import java.util.Scanner;

public class EjercicioResuelto14 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double ventas1, ventas2, ventas3, salario, totalventas,salario1,salario2,salario3;
        System.out.println("Ingrese el total de ventas del departamento 1: ");
        ventas1=leer.nextDouble();
        System.out.println("Ingrese el total de ventas del departamento 2: ");
        ventas2=leer.nextDouble();
        System.out.println("Ingrese el total de ventas del departamento 3: ");
        ventas3=leer.nextDouble();
        System.out.println("Ingrese el salario de los trabajadores: ");
        salario=leer.nextDouble();
        totalventas=ventas1+ventas2+ventas3;
        if (ventas1>totalventas*0.33){
            salario1=salario+(salario*0.20);
        }
        else{
            salario1=salario;
        }
        if (ventas2>totalventas*0.33){
            salario2=salario+(salario*0.20);
        }
        else{
            salario2=salario;
        }
        if (ventas3>totalventas*0.33){
            salario3=salario+(salario*0.20);
        }
        else{
            salario3=salario;
        }
        System.out.println("El salario del departamento 1 es: "+salario1);
        System.out.println("El salario del departamento 2 es: "+salario2);
        System.out.println("El salario del departamento 3 es: "+salario3);
    }
    
}

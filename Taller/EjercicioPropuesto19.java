package taller;

import java.util.Scanner;

public class EjercicioPropuesto19 {
    public static void main(String[] args) {
        double l, perimetro, altura, area;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la medida del lado del triangulo: ");
        l=leer.nextDouble();
        perimetro=l*3;
        altura=(Math.sqrt(3)*l)/2;
        area=(l*altura)/2;
        System.out.println("El perimetro del triangulo es: "+perimetro+", la altura es: "+altura+" y el area es: "+area+"");
    }
    
}

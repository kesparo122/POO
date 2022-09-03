package taller;

import java.util.Scanner;

public class EjercicioPropuesto23 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double a,b,c, resultadopos, resultadoneg;
        System.out.println("Escriba el numero A de la ecuacion Ax²+Bx+c=0: ");
        a=leer.nextDouble();
        System.out.println("Escriba el numero B de la ecuacion Ax²+Bx+c=0: ");
        b=leer.nextDouble();
        System.out.println("Escriba el numero C de la ecuacion Ax²+Bx+c=0: ");
        c=leer.nextDouble();
        resultadopos=(-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        resultadoneg=(-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        System.out.println("Los resultados posibles son: "+resultadopos+" y "+resultadoneg);
    }
    
}

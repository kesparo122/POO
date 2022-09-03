package taller;

import java.util.Scanner;

public class EjercicioResuelto13 {
    public static void main(String[] args) {
        double costo, compra, descuento;
        String bola;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor total de la compra: ");
        compra=leer.nextDouble();
        System.out.println("Ingrese el color de la bola sacada: ");
        bola=leer.next();
        if ("blanco".equals(bola)){
            descuento=0;
        }
            else if ("verde".equals(bola)){
                descuento=0.10;
            }
                else if("amarillo".equals(bola)){
                    descuento=0.25;
                }
                    else if("azul".equals(bola)){
                        descuento=0.50;
                    }
                        else {
                            descuento=1;
                        }
        costo=compra-(compra*descuento);
        System.out.println("El monto a pagar es de: "+costo);
    }
    
}

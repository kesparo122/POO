package Parte2;

public class EjercicioPropuestoFigGeometricas {

    public static void main(String[] args) {
        Círculo figura1 = new Círculo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        Triangulo figura4 = new Triangulo(3, 5);
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro()+"\n");
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro()+"\n");
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro()+"\n");
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
    }

}

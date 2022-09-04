import java.util.Scanner;

class TrianguloMedidas {
    public static void main(String[] args) {
        double x, y, z, p, s, a;

        System.out.println("Ingrese las medidas de los lados del triangulo: \n");
        Scanner lado = new Scanner(System.in);
        
        x = lado.nextDouble();
        y = lado.nextDouble();
        z = lado.nextDouble();
        
        p = x+y+z;
        s = p/2;
        a = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("el perimetro es:"+p);
        System.out.println("el semiperimetro es:"+s);
        System.out.println("el area es:"+Math.ceil(a));
    }
}

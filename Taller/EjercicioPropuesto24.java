import java.util.Scanner;

class PelotaMasPesada {
    public static void main(String[] args) {
        double a, b, c;
        Scanner lado = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera A"); a = lado.nextDouble();
        System.out.println("Ingrese el peso de la esfera B"); b = lado.nextDouble();
        System.out.println("Ingrese el peso de la esfera C"); c = lado.nextDouble();
       
        if((a>b)){
            if(a>c){
                System.out.println("La esfera A es la de mayor peso");
            }
            else{
                System.out.println("La esfera C es la de mayor peso");
            }
        } 
        else{
            if(b>c){
                 System.out.println("La esfera B es la de mayor peso");
            }
            else{
                System.out.println("La esfera C es la de mayor peso");
            }
        }
    }
}

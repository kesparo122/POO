import java.util.Scanner;

class EsferaDistinta {
    public static void main(String[] args) {
    int a, b, c, d;
    
    Scanner dato = new Scanner(System.in);
    
        System.out.println("Ingrese el peso de la esfera A");
        a = dato.nextInt();
        System.out.println("Ingrese el peso de la esfera B");
        b = dato.nextInt();
        System.out.println("Ingrese el peso de la esfera C");
        c = dato.nextInt();
        System.out.println("Ingrese el peso de la esfera D");
        d = dato.nextInt();
        
        if((a==b)&&(a==c)){
            if(d>a){
            System.out.println("La esfera D es la diferete y es de mayor peso"); 
            }
            else{
            System.out.println("La esfera D es la diferete y es de menor peso");
            }
        }
        else if((a==b)&&(a==d)){
                System.out.println("La esfera C es la diferete");
                if(c>a){
                System.out.println("Y es de mayor peso");
                }
                else{
                System.out.println("Y es de menor peso");
                }
            }
        else{
            if((a==c)&&(a==d)){
                System.out.println("La esfera B es la diferete");
                if(b>d){
                System.out.println("Y es de mayor peso");
                }
                else{
                System.out.println("Y es de menor peso");
                }
            }
            else{
                System.out.println("La esfera A es la diferete");
                    if(a>b){
                    System.out.println("Y es de mayor peso");
                    }
                    else{
                    System.out.println("Y es de menor peso");
                    }
                }
            }
	}
}

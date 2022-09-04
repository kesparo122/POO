import java.util.Scanner;

class SalarioDevengado {
    public static void main(String[] args) {
        int NHT, VHN, HET, HE8, SAL;
        String NOM; 
        
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador");
        NOM = dato.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        NHT = dato.nextInt();
        System.out.println("Ingrese valor de una hora hora de trabajo normal");
        VHN = dato.nextInt();
    
        if (NHT > 40){
            HET = NHT - 40;
            if (HET > 8){
                HE8 = HET - 8;
                SAL = 40 * VHN + 16 * VHN + HE8 * 3 * VHN;
            }
            else{
                SAL = 40 * VHN + HET * 2 *  VHN;
            }
        }
        else{
            SAL = NHT * VHN;
        }
      
        System.out.println("El trabajador "+NOM+" devengo: $"+SAL);
    }
}

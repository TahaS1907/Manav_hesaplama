import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     double pear=2.14;
     double apple=3.67;
     double tomato=1.11;
     double banana=0.95;
     double eggplant=5;
     int kilo1,kilo2,kilo3,kilo4,kilo5;
     System.out.println("How many kilos of pear:");
kilo1= scanner.nextInt();
        System.out.println("How many kilos of apple:");
        kilo2= scanner.nextInt();
        System.out.println("How many kilos of tomato:");
        kilo3= scanner.nextInt();
        System.out.println("How many kilos of banana:");
        kilo4= scanner.nextInt();
        System.out.println("How many kilos of eggplant:");
        kilo5= scanner.nextInt();
        double toplam=(pear*kilo1)+(apple*kilo2)+(tomato*kilo3)+(banana*kilo4)+(eggplant*kilo5);
        System.out.println("Toplam tutar:"+toplam+"TL");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     double armut=2.14;
     double elma=3.67;
     double domates=1.11;
     double muz=0.95;
     double patlıcan=5;
     int tane1,tane2,tane3,tane4,tane5;
     System.out.println("Armut kaç kilo:");
tane1= scanner.nextInt();
        System.out.println("Elma kaç kilo:");
        tane2= scanner.nextInt();
        System.out.println("Domates kaç kilo:");
        tane3= scanner.nextInt();
        System.out.println("Muz kaç kilo:");
        tane4= scanner.nextInt();
        System.out.println("Patlıcan kaç kilo:");
        tane5= scanner.nextInt();
        double toplam=(armut*tane1)+(elma*tane2)+(domates*tane3)+(muz*tane4)+(patlıcan*tane5);
        System.out.println("Toplam tutar:"+toplam+"TL");
    }
}
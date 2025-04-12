package atvaltas;
import java.util.Scanner;
// 10-esbol 2 szamrendszer
public class Atvaltas {
    public static void main(String[] args) {
        System.out.println("Ez a program 10-es számrendszerből 2-es számrendszerbe váltja az átváltandó számot.");
        System.out.println("Kérem adja meg a 10-es számrendszerbeli számot: ");
        Integer szam;
        Scanner bemenetScan = new Scanner(System.in);
        szam = bemenetScan.nextInt();
        System.out.println("A megadott szám: "+szam);
        Integer osztando;
        osztando = szam;
        Integer maradek;
        String eredmeny="";
        System.out.println(szam/2+" "+szam%2);
        while (osztando>0) {
            maradek = osztando%2;
            osztando = osztando/2;
            eredmeny = maradek.toString()+eredmeny;
            System.out.println(osztando+" "+maradek);
        }
        System.out.println("A 2-es számrendszerben: "+eredmeny);
        }

    }
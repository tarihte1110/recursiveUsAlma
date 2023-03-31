import java.util.Scanner;
public class recursiveUsAlma {
    static int pow(int a, int b) {
        if(b==0) {
            return 1;
        }
        else {
            return a * pow(a,b-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean devamEt=true;

        while (devamEt) {
            System.out.print("Taban Değeri:");
            int abc = input.nextInt();
            System.out.print("Üs:");
            int cba = input.nextInt();
            System.out.println("SONUÇ => " + pow(abc, cba));

            System.out.println("Devam etmek istiyor musunuz? (E/H) ");
            String devam= input.next();

            if(devam.equalsIgnoreCase("H")){
                devamEt=false;
            }
        }
    }
}
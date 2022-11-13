import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a,b,c,n=1,r=1,y=1,kombinasyon;
    Scanner input = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını giriniz: ");
        a = input.nextInt();

        System.out.print("Kaç elemanlı kombinasyon hesaplatmak istiyorsunuz?: ");
        b= input.nextInt();
        c=a-b;

        for(int i=1;i<=a;i++){
            n *=i;
        }

        for(int x=1;x<=b;x++){
            r *=x;
        }

        for(int z=1;z<=c;z++){
            y *=z;
        }

        kombinasyon = n / (r*y);
        System.out.println("Kombinasyon sonucu: "+kombinasyon);

    }
}
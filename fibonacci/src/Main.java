import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        // 0 1 1 2 3 5 8 13 21 34 55 ...
        // a b c
        //   a b c
        //     a b c
        int a=0,b=1,c=1;
        System.out.print("Fibonacci Dizisinin Kaç Elemanının Yazdırılacağını Giriniz : ");
        int elemanSayisi= klavye.nextInt();
        for (int i =0;i<elemanSayisi;i++){
            System.out.print(a+ " ");
            a=b;
            b=c;
            c=a+b;

        }



    }
}
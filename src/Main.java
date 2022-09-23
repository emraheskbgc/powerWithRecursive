import java.util.Scanner;

public class Main {
    static int power(int base, int pow){
        if (pow == 0){
            return 1;
        }else if (base == 1){
            return 1;
        }else{
            return base *(power(base,pow-1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("üssü alıncak sayıyı giriniz = ");
        int base = input.nextInt();
        System.out.print("üs olacak sayıyı giriniz = ");
        int pow = input.nextInt();
        int result = power(base, pow);
        System.out.println("Sonuç = " + result);

    }
}

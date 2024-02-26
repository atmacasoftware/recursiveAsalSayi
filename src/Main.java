import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int tempNumber) {
        System.out.println(tempNumber);
        if (tempNumber == 1) {
            return true;
        } else {
            if (number != tempNumber) {
                if (number % tempNumber == 0) {
                    return false;
                } else {
                    return isPrime(number, tempNumber - 1);
                }
            }
            return isPrime(number, tempNumber - 1);
        }
    }

    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int number;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan bilgi alınması
        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        boolean result = isPrime(number, number);

        if (result) {
            System.out.println(number + " sayısı asal sayıdır.");
        }else{
            System.out.println(number + " sayısı asal sayı değildir.");
        }

    }
}
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("The Prime Numbers from 1 to 100 are = ");
        for (int i = 1;i <= 100;i++){
            if (isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2;i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}

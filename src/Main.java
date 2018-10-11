import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Myinteger a = new Myinteger(10);
        System.out.println("value a " + a.getValue());
        System.out.println("a có phải số chẵn " + a.isEven());
        System.out.println("a có phải số lẻ " + a.isOdd());
        System.out.println("a có phải số nguyên tố " + a.isPrime());
        Myinteger b = new Myinteger(10);
        System.out.println("nhập số");
        if (a.equals(input.nextInt())){
            System.out.println("số nhập bằng value a");
        }
        if (a.equals(b)){
            System.out.println("số nhập bằng value a");
        }
        System.out.println("10 có phải số chẵn " + Myinteger.isEven(10));
        System.out.println("10 có phải số lẻ " + Myinteger.isOdd(10));
        System.out.println("10 có phải số nguyên tố " + Myinteger.isPrime(10));
        System.out.println(" a = b ? " + a.equals(b));

    }
}

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.printf("Введите строку, что бы проверить является ли она палиндромом: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        isPalindrome(str);
    }

    private static void isPalindrome(String str) {
       String origin = str.replaceAll(" ", "").toLowerCase();
        StringBuilder test = new StringBuilder(origin);
        test.reverse();
        String test2 = test.toString();
        System.out.println((origin.equals(test2)) ? str + " - это палиндром!" : str + " - это не палиндром :(");
    }
}
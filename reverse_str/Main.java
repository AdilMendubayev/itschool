import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя строку, 
// а затем выводит все символы этой строки в обратном порядке

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var str = sc.next();
        var result = reverseByBuilder(str);
        System.out.println(result);
    }

    private static String reverseByChars(String sourceStr) {
        var strChars = sourceStr.toCharArray();
        var resultBuilder = new StringBuilder();

        for (int i = sourceStr.length() - 1; i >= 0; i--) {
            resultBuilder.append(strChars);
        }

        return resultBuilder.toString();
    }

    private static String reverseByBuilder(String sourceStr) {
        var strBuilder = new StringBuilder(sourceStr);
        strBuilder.reverse();
        return strBuilder.toString();
    }
}
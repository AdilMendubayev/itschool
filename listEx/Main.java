import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Main {

    private static final String ITEM = "item";

    public static void main(String[] args) {
        var n = 113;
        divWhilePossible(n);
    }

    private static void divWhilePossible(int n) {
        var result = n / 2;
        if (result < 2) {
            return;
        }

        System.out.println(result);

        divWhilePossible(result);
    }
}
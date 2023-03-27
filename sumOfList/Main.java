import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя набор чисел (целые), 
//который тот указываает через запятую,
//сохраняет их и затем выводит сумму всех чисел
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var numStr = sc.next(); 
        var strArr = numStr.split(",");
    
        var numList = new ArrayList<Integer>();
    
        for (String str : strArr) {
            numList.add(Integer.parseInt(str));
        }

        var result = 0;
        for (Integer value : numList) {
            result += value;    
        }

        System.out.println(result);
    }
}
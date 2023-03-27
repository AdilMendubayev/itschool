import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя набор слов, 
//сохраняет их в HashMap, где ключами являются слова, 
//а значениями - количество раз, которые слова появляются в наборе. 
//Затем программа выводит список слов 
//и количество раз, которые они встречаются в наборе.

//Программа принимает строки, пока пользователь не введет 'stop' на отдельной строке
//Пользователь может вводить несколько слов в одной строке
//Пользователь может использовать знаки припинания
//Слова разделены пробелами

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var words = new ArrayList<String>();
        while (true) {
            var rawWordLine = sc.nextLine();

            if ("stop".equals(rawWordLine)) {
                break;
            }

            var cleanedStrLine = rawWordLine.replaceAll("[^a-zA-Z\\s]+", "");
            cleanedStrLine = rawWordLine.replaceAll("\\s+", " ");

            var wordArr = cleanedStrLine.split(" ");
            for (var str : wordArr) {
                words.add(str);
            }
        }

        var wordCountMap = new HashMap<String, Integer>();
        for (var str : words) {
            if (wordCountMap.containsKey(str)) {
                var count = wordCountMap.get(str);
                wordCountMap.put(str, count + 1);
            } else {
                wordCountMap.put(str, 1);
            }
        }

        System.out.println(wordCountMap);
    }
}
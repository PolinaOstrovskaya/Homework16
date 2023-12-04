import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] words= scanner.nextLine().split(" ");
                Map<String, String> result = pairs(words);
                System.out.println(result);
            }

            public static Map<String, String> pairs(String[] strings) {
                Map<String, String> map = new HashMap<>();

                for (String str : strings) {
                    String key = str.substring(0, 1);
                    String value = str.substring(str.length() - 1);
                    map.put(key, value);
                }

                return map;
            }
        }



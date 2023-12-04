import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String[] input= scanner.nextLine().split(" ");
            Map<String, Boolean> result = wordMultiple(input);
            System.out.println(result); // Output: {"a": true, "b": true, "c": false}
        }

        public static Map<String, Boolean> wordMultiple(String[] strings) {
            Map<String, Boolean> map = new HashMap<>();

            for (String str : strings) {
                if (map.containsKey(str)) {
                    map.put(str, true);
                } else {
                    map.put(str, false);
                }
            }

            return map;
        }
    }


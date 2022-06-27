import java.util.Scanner;
import java.util.HashMap;
public class Sample12 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String result = "";
    HashMap<String, String> map = new HashMap<>();
    map.put(".-","A");
    map.put("-...","B");
    map.put("-.-.","C");
    map.put("-..","D");
    map.put(".", "E");
    map.put("..-.","F");
    map.put("--.","G");
    map.put("....","H");
    map.put("..","I");
    map.put(".---","J");
    map.put("-.-","K");
    map.put(".-..","L");
    map.put("--","M");
    map.put("-.","N");
    map.put("---","O");
    map.put(".--.","P");
    map.put("--.-","Q");
    map.put(".-.","R");
    map.put("...","S");
    map.put("-","T");
    map.put("..-","U");
    map.put("...-","V");
    map.put(".--","W");
    map.put("-..-","X");
    map.put("-.--","Y");
    map.put("--..","Z");


    String[] data = sc.nextLine().split("  ");
    for(String dt: data){
        String[] sec_dt = dt.split(" ");
        for (String value: sec_dt){
            result += map.get(value);
        }
        result += " ";
    }
    System.out.println(result);

}
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sample5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(
                "abc.txt"
        ));
        while (true) {
            String line = br.readLine();
            if(line==null)break;
            items.add(line);
        }
        br.close();
        FileWriter fw = new FileWriter("result.txt");
        int count = items.size();
        while (count>0){
            fw.write(items.get(count-1) + '\n');
            System.out.println(items.get(count-1));
            items.remove(count-1);
            count--;
        }
        fw.close();
    }
}
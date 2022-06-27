import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        int sum_val = 0;
        while(true){
            String line = br.readLine();
            if(line==null)break;
            String num_line = line.replaceAll("[^0-9]", "");
            sum_val += Integer.parseInt(num_line);
        }
        br.close();
        System.out.println(sum_val);

        int avg_val = sum_val / 10;
        System.out.println(avg_val);

        FileWriter fw = new FileWriter("result.txt");
        fw.write(avg_val + "\n");
        fw.close();
    }
}

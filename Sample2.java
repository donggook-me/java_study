import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sample2 {
    public static ArrayList<Integer> pivonaci(int n){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(0);
        answer.add(1);
        for(int i=2; i<n; i++){
            answer.add(answer.get(i-2)+answer.get(i-1));
        }
        return(answer);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = pivonaci(sc.nextInt());
        System.out.println(result);
    }
}

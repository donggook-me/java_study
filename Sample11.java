import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class Sample11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.next().split("");
        Arrays.sort(numbers);
        String sorted_num = String.join("",numbers);
        if(sorted_num.equals("0123456789")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }

}

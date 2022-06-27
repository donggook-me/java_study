import java.util.Scanner;

public class Sample4 {
    public static int sum_return(String numbers){
        String[] num_array = numbers.split(",");
        int total_sum = 0;
        for(String num:num_array){
            total_sum += Integer.parseInt(num);
        }
        return(total_sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = sum_return(sc.nextLine());
        System.out.println(answer);
    }
}

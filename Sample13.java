import java.util.Scanner;

public class Sample13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = "";
        int n = sc.nextInt();
        for(int i=0; i<line.length(); i++){
            
            int num = (int)line.charAt(i) + n;
            if(num>90) {
                num = 64 + (num + n) % 90;
            }
            result += (char)num;
            }
        System.out.println(result);
        }
    }


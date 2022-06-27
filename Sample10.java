import java.util.Scanner;

public class Sample10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        char rep = data.charAt(0);
        String result = "";
        int cnt = 1;
        for(int i=1; i<data.length(); i++){
            if(i == data.length()-1){
                if (rep == data.charAt(i)){
                    cnt++;
                    result += rep;
                    result += cnt;
                }
                else {
                    result += rep;
                    result += cnt;
                    rep = data.charAt(i);
                    cnt = 1;
                    result += rep;
                    result += cnt;
                }

            }
            if(rep == data.charAt(i)){
                cnt++;
            }
            else {
                result += rep;
                result += cnt;
                rep = data.charAt(i);
                cnt = 1;
            }

        }
        System.out.println(result);
    }
}

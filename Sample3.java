import java.util.Scanner;

public class Sample3 {

    public static void gugu(int n) {
        for(int i=1; i<=9; i++){
            System.out.print(i*n);
            System.out.print(" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        gugu(sc.nextInt());
    }


}

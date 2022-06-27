class Calculator {
    int[] data;
    Calculator(int[] data){
        this.data = data;
    }
    int sum(){
        int sum = 0;
        for(int i=0; i<data.length; i++){
            sum += data[i];
        }
        return(sum);
    }
    double avg(){
        int avg = this.sum() / data.length;
        return(avg);
    }
}

public class Sample7 {
    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = {6,7,8,9,10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력
    }
}
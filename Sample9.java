public class Sample9 {
    static void DashInsert(String input){
        String result = "" + input.charAt(0);
        for(int i=1; i<input.length(); i++){
            int a = Character.getNumericValue(input.charAt(i-1));
            int b = Character.getNumericValue(input.charAt(i));
            if(a%2==0 && b%2==0){
                result += "*";
            }
            else if(a%2==1 && b%2==1){
                result += "-";
            }
            result += b;
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        DashInsert("4546793");
    }
}

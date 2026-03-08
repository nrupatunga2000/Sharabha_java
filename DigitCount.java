public class DigitCount {
    public static void main(String[] args) {
        int num = 1994;
        int count = 0;
        int digit = 9;
        while(num>0){
            int lst = num%10;
            if(digit == lst){
                count ++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}

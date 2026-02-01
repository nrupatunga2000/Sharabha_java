public class ReplaceDigit {
    int convertfive(int num) {
        // Your code here
        String n = String.valueOf(num);
        n = n.replace('0','5');
        int nums = Integer.valueOf(n);
        return nums;
    }
    public static void main(String[] args) {
        ReplaceDigit obj = new ReplaceDigit();
        int num = 2008;
        System.out.println(obj.convertfive(num));

    }
}

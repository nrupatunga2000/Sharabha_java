public class ecptn {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try{
            int sum = i/j;
            System.out.println(sum);
        }

        catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}

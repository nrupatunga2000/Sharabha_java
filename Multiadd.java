public class Multiadd {
 public int tanu(){
        int a=10,b=1,c;
        c=a+b;
        while(c>9){
            int sum  = 0;
        while(c>0){
            sum += c%10; 
            c/= 10;
            
        }
        c=sum;
        }
        return c;
        
    }
    public static void main(String[] args) {
        Multiadd obj = new Multiadd();
        System.out.println(obj.tanu());
    } 
}

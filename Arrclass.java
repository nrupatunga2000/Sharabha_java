 class Ar {
    int arr[] = {10,20,30,4,6};
    
    void marks(){
        // print the array elements using for each loop
        for(int mark: arr){
            System.out.print(mark +" ");
        }
    }
}

public class Arrclass {
    public static void main(String[] args) {
        Ar obj = new Ar();
        obj.marks();
    }
}


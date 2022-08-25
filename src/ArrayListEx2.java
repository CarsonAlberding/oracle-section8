import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        int Arraylist[] = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i<Arraylist.length; i++){
            if (Arraylist[i] % 2 == 0){
                Arraylist.remove(Arraylist[i]);
            }
            System.out.println(Arraylist[i]);
        }
        
        
        
        
        
         
    }
}

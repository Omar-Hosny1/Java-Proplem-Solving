import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {

    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> HM = new HashMap<Integer,Integer>();  
        for(int i = 0; i <arr.length; i++){
            int currentEle = arr[i];
            if(HM.get(currentEle) == null){
                HM.put(currentEle, 1);
            }else{
                HM.put(currentEle, HM.get(currentEle) + 1);
            }
        }
        HashSet<Integer> HS = new HashSet<Integer>(HM.values());
            
        return HS.size() == HM.values().size();
    }

    public int[] sumZero(int n) {
        int[] result = new int[n]; 
        if(n % 2 == 0){
            for(int i = 0; i< result.length; i+=2){
                result[i] = i + 1;
                result[i + 1] = - (i + 1); 
            }
        }else{
            for(int i = 0; i < result.length - 1; i+=2){
                result[i] = i + 1;
                result[i + 1] = - (i + 1); 
            }
            result[n] = 0;
        }
        return result;
    }

    public static  boolean isPowerOfTwo(int n){
        if(n == 1 || n == 2) return true;
        while(n > 0 && n % 2 == 0){
            n = n/2;
            if(n == 1) return true;
        }
        return false;
    } 
}

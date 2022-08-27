import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
    }

    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(HM.get(nums[i]) == null){
                HM.put(nums[i], 1);
            }else{
                HM.put(nums[i], HM.get(nums[i]) + 1);
            }
        }
        int result[] = new int[2];
        int index = 0;
     for (Map.Entry<Integer, Integer> set :
             HM.entrySet()) {
            if(set.getValue() == 1){
                result[index] = set.getKey(); 
                index++;
            }
        }   
    return result;
    }
    
    public static boolean binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = (start + end) /2;
            if(arr[middle] == target) return true;
            else if(arr[middle] > target) end = middle - 1; 
            else if(arr[middle] < target) start = middle + 1; 
        }
        return false;
    }

    //LEET CODE
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

    //LEET CODE
    public static int[] sumZero(int n) {
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

    //LEET CODE
    public static  boolean isPowerOfTwo(int n){
        if(n == 1 || n == 2) return true;
        while(n > 0 && n % 2 == 0){
            n = n/2;
            if(n == 1) return true;
        }
        return false;
    } 
}

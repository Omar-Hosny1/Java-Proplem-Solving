public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(isPowerOfTwo(0));
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

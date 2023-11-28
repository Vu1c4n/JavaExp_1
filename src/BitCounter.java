public class BitCounter {
    public static int counter(int num){
        if(num<0 || num >9999){
            throw new IllegalArgumentException("Number out of range");
        }
        return counterHelper(num);
    }
    private static int counterHelper(int n){
        if(n/10 == 0){  return 1; }
        else{   return 1+counterHelper(n/10);}
    }
}

public class Factorial {
    private static final int UPPERBOUND = 10;
    public static int value(){
        int sum = 0;
        for(int i =1;i<=UPPERBOUND;i++){
            sum += facHelper(i);
        }
        return sum;
    }

    private static int facHelper(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*facHelper(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Factorial.value());
    }
}

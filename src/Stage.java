public class Stage {
    public static int stage(){
        int sum = 0;
        for(int i =1;i<=10;i++){
            sum += stageHelper(i);
        }
        return sum;
    }

    private static int stageHelper(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*stageHelper(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(stageHelper(11));
    }

}

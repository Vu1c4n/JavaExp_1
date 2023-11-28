public class SumEven {
    public static int sumV1(){
        int sum = 0;
        for(int i=1;i<=1000;i++){
            if((i%2) == 0){ sum += i;}
        }
        return sum;
    }

    public static int sumV2(){
        int sum = 0;
        int i = 1000;
        while(i > 0){
            if((i%2)==0){
                sum += 1;
            }
            i -= 1;
        }
        return sum;
    }
}

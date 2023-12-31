import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testTriangle();
        testBitCounter();
        testCostCalc();
        testSumEven();
        testFactorial();
    }
    public static void testTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三条边：");
        double[] edges = new double[3];
        try{
            for(int i = 0; i < 3;i++){
                edges[i] = sc.nextDouble();
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
            return;
        }
        System.out.println("三角形是否为直角三级形："+Triangle.isValid(edges));
    }
    public static void testBitCounter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-1000的数字i：");
        try{
            int n = sc.nextInt(); // 将这句话放进来，防止输入非int类型参数
            System.out.println("i的位数为："+BitCounter.counter(n));
        }
        catch(Exception e){
            System.out.println("错误信息："+e.toString());
        }
    }
    public static void testCostCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入距离：");
        int dis = sc.nextInt();
        System.out.println("请输入重量：");
        int wt = sc.nextInt();
        System.out.println("总运输费用为："+ CostCalc.cost(dis,wt));
    }
    public static void testSumEven(){
        System.out.println("1-1000间的偶数和为：");
        System.out.println(SumEven.sumV1());
        System.out.println(SumEven.sumV2());
    }
    public static void testFactorial(){
        System.out.println("1!+2!+...+10! = "+Factorial.value());
    }
}





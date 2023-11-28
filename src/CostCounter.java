import java.util.Scanner;

public class CostCounter {
    private static double cost(int dis, int wt){
        double unitCost = 0;
        if(dis > 0 && dis < 100){
            unitCost = 1.0;
        }
        else if(dis >= 100 && dis < 300){
            unitCost = 0.9;
        }
        else if(dis >= 300 && dis < 500){
            unitCost = 0.8;
        }
        else if(dis >= 500 && dis < 1000){
            unitCost = 0.7;
        }
        else {
            unitCost = 0.6;
        }
        return dis*wt*unitCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        int wt = sc.nextInt();
        System.out.println(CostCounter.cost(dis,wt));
        sc.close();
    }
}

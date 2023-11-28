public class CostCounter {
    public static double counter(int dis){
        return 1;
    }
    private static double counterHelper(int dis){
        if(dis > 0 && dis < 100){
            return dis*1.0;
        }
        else if(dis >= 100 && dis < 300){
            return dis*0.9;
        }
        else if(dis >= 300 && dis < 500){
            return (dis-300)*0.8;
        }
        else if(dis >= 500 && dis < 1000){
            return (dis-500)*0.8;
        }
        else {
            return (dis-1000) * 0.6;
        }
    }
}

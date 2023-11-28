import java.util.*;

public class Triangle {
    int[] edges = new int[3];
    Triangle(int e1,int e2,int e3){
        this.edges[0] = e1;
        this.edges[1] = e2;
        this.edges[2] = e3;
    }
   public static boolean isValid() {
       Queue<Integer> q = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; sc.hasNextLine() && i < 3;i++){
             q.offer(sc.nextInt());
        }
       int e1 = (int)q.poll();
        int e2 = (int) q.poll();
        int hypo = q.poll();
       return (e1*e1 + e2*e2 == hypo*hypo);
   }
}

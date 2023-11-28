import java.util.*;

public class Triangle {
   public static boolean isValid(int[] edges) {
       // 异常处理
        if(edges.length > 3){
            throw new IllegalArgumentException("wrong edges");
        }
        // 创建优先队列，将传入参数加入优先队列，获取最长边即为潜在的斜边（如果是直角三角形）
        Queue<Integer> q = new PriorityQueue<>();
        for(int i:edges){
            q.offer(i);
        }
        int e1 = q.poll();
        int e2 = q.poll();
        int hypo = q.poll();
        return (e1*e1 + e2*e2 == hypo*hypo);
   }

   // unit test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edges = new int[3];
        for(int i = 0; i < 3;i++){
            edges[i] = sc.nextInt();
        }
        System.out.println(isValid(edges));
    }
}

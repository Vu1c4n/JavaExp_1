import java.util.*;

public class Triangle {
   public static boolean isValid(double[] edges) {
       // 异常处理
        if(edges.length > 3){
            throw new IllegalArgumentException("wrong edges");
        }
        // 创建优先队列，将传入参数加入优先队列，获取最长边即为潜在的斜边（如果是直角三角形）
        Queue<Double> q = new PriorityQueue<>();
        for(double i:edges){
            q.offer(i);
        }
        Double e1 = q.poll();
        Double e2 = q.poll();
        Double hypo = q.poll();
        /*
        修复"Unboxing of xxx may cause Nullptr..."提示
         */
        return (e1!=null&&e2!=null&&hypo!=null && e1*e1 + e2*e2 == hypo*hypo);
   }
}

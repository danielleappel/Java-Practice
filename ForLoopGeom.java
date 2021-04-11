import java.util.*;

public class ForLoopGeom{
    public static void geom_series(int a, int b, int n){
        int sum = a;
        for (int i=0; i<n; i++){
            int b_term = (int) Math.pow(2,i) * b;
            sum = sum + b_term;
            System.out.print(sum + " ");
        }
        System.out.print("\n");
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            geom_series(a, b, n);
        }
        in.close();
    }
}

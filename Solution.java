import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        ArrayList<ArrayList<String>> rows = new ArrayList<>(n);
        scan.nextLine();
        
        for (int i = 0; i < n; i++)
        {
            String inp_row = scan.nextLine();
            rows.add(i, new ArrayList<String>(Arrays.asList(inp_row.split("\\s"))));
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            scan.nextLine();
            
            if (x <= rows.size() && y < rows.get(x-1).size()){
                System.out.println(rows.get(x-1).get(y));
            }
            else{
                System.out.println("ERROR!");
            }

        }
        scan.close();

    }
}

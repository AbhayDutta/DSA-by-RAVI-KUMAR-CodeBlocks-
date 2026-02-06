import java.util.*;
public class apseries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms, first term and common difference:");
       int n = sc.nextInt();
       int a = sc.nextInt();
         int d = sc.nextInt();
         

        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }
    }
}

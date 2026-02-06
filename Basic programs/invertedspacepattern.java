import java.util.Scanner;
public class invertedspacepattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int n =sc.nextInt();
        int space=0;
        int star= n;
        int row=1;
        while(row<=n){

             //space
            int i =1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
              //star
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
           
          
            }
            System.out.println();
            space++;
            star--;
            row++;
        }

    }
}

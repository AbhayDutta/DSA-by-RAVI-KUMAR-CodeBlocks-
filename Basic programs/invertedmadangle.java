import java.util.Scanner;




public class invertedmadangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
System.out.println("Enter the rows");

//for loop
/* 
        int n =sc.nextInt();
for(int i =1; i<=n; i++){
    for(int j=n;j>=i; j--){
        System.out.print("*");
    }
    System.out.println( );
    
}        }
}
*/

//while loop
 
int n=sc.nextInt();
int i =1;
while(i<=n){
    int j =n;
    while(j>=i){
        System.out.print("*");
        j--;
    }
    System.out.println();
    i++;
    
}
    }
}
    
import java.util.Scanner;

public class lottery{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

     if(n>300 && n<=460){
        System.out.println("macbook jitgaye bhaijaan!");
     }
    else if(n>=200 && n<=280){
        System.out.println("kurkure !");
    }
    else if(n>1100 && n<=1500){
        System.out.println("cycle larke");
    }
else if(n>50 && n<=80){
        System.out.println("Bike mila he apko");
    }


    else{
        System.out.println("Better Luck next time");
    }
        sc.close();
}
}

import java.util.Scanner;

public class lotterypart2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter your lottery number:");
        int n = sc.nextInt();
        

     if(n>300 && n<=460){
         System.out.println("macbook jitgaye bhaijaan!");
       if(n>=300 && n<=460){ 
        System.out.println("Model 1");
       }else{
            System.out.println("Model 2");
       }
    
        
    }
     
    else if(n>=200 && n<=280){
        System.out.println("kurkure !");
    
    if(n>=200 && n<=240){
        System.out.println("Flavour kurkure");
    }
    else{
        System.out.println("onion kurkure");
    }}
    else if(n>1100 && n<=1300){
        System.out.println("Cycle !");
    
    
     if(n>1300 && n<=1500){
        System.out.println("Avion cycle larke");
    }
    else{
        System.out.println("Hero cycle larke");
    }}
    else if(n>50 && n<=80){
        System.out.println("Bike mila he apko");
    
    if(n>50 && n<=65){
        System.out.println("Bullet bike");
    }
    else{
        System.out.println("Rajdoot bike");
    }
}
     
    else{
        System.out.println("Better Luck next time");
    }
        sc.close();
}
}


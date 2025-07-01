import java.util.Scanner;
public class Oddecen {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("given number is prime");

        }else{
            System.out.println("given number is odd");
        }
        
    }
}

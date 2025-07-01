import java.util.Scanner;
class aritematic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number to perform arithematic operation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter your choice3");
        System.out.println("1.Addition");
        System.out.println("2.substration");
        System.out.println("3.Multiplication");
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("Addition is"+(a+b));
            break;
            case 2:System.out.println("Susbstration is"+(a-b));
            break;
            case 3:System.out.println("multiplication is"+(a*b));
            break;
        }
        

    }
}
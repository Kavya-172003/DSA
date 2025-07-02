import java.util.Scanner;
public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check if it's a vowel or not:");
        String str = sc.nextLine().toLowerCase();
        if (str.length() == 1) {
            switch(str) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Entered letter is a vowel.");
                    break;
                default:
                    System.out.println("Entered letter is not a vowel.");
            }
        } else {
            System.out.println("Please enter only one character.");
        }
    }
}

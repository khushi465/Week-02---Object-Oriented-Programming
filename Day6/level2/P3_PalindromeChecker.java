
import java.util.*;

public class P3_PalindromeChecker {

    private String text;

    P3_PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean checker(){
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public void display() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome?: " + checker());
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String text = sc.nextLine();
        P3_PalindromeChecker check = new P3_PalindromeChecker(text);
        check.display();

    }
}

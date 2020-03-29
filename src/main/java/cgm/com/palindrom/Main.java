package cgm.com.palindrom;

public class Main {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkItIsPalindrome("p p"));
        System.out.println(palindrome.checkItIsPalindrome(" Paw    el"));
    }
}

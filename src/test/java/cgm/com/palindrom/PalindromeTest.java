package cgm.com.palindrom;

import cgm.com.exception.TooShortPhraseException;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void shouldReturnTrueBecauseIsNormalPalindrome() {
        //given
        Palindrome palindrome = new Palindrome();
        String phrase = "potop";
        //when
        boolean result = palindrome.checkItIsPalindrome(phrase);
        //then
        assertTrue(result);
    }


    @Test
    public void shouldReturnTrueBecauseIsPalindromeWithCapitalLetters() {
        //given
        Palindrome palindrome = new Palindrome();
        String phrase = "POtop";
        //when
        boolean result = palindrome.checkItIsPalindrome(phrase);
        //then
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueBecauseIsPalindromeWithDifferentCharacter() {
        //given
        Palindrome palindrome = new Palindrome();
        String phrase = "!1p ot     op1!";
        //when
        boolean result = palindrome.checkItIsPalindrome(phrase);
        //then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseBecauseIsNotPalindrome() {
        //given
        Palindrome palindrome = new Palindrome();
        String phrase = "potok";
        //when
        boolean result = palindrome.checkItIsPalindrome(phrase);
        //then
        assertFalse(result);
    }

    @Test
    public void shouldReturnExceptionWhenPhraseIsToShort() {
        //given
        final Palindrome palindrome = new Palindrome();
        final String phrase = "a a";
        //when
        Exception exception = assertThrows(TooShortPhraseException.class, () -> {
            palindrome.checkItIsPalindrome(phrase);
        });

        String expectedMessage = "phrase must have at least 3 characters";
        String actualMessage = exception.getMessage();
        //then
        assertTrue(actualMessage.contains(expectedMessage));
    }


}
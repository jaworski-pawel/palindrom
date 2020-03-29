package cgm.com.palindrom;

import cgm.com.exception.TooShortPhraseException;

public class Palindrome {

    public boolean checkItIsPalindrome(String phrase) {

        String clearPhrase = removeWhitespace(phrase);
        checkLength(clearPhrase);

        int start = 0;
        int end = clearPhrase.length() - 1;

        while (start < end) {
            if (clearPhrase.charAt(start) == clearPhrase.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    private void checkLength(String phrase) {
        if (phrase.length() < 3) {
            throw new TooShortPhraseException();
        }
    }

    private String removeWhitespace(String phrase) {

        phrase = phrase.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);
            int asciiPosition = (int) currentChar;

            if (asciiPosition >= 33 && asciiPosition <= 126) {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }
}
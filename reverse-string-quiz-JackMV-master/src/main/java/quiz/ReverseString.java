package quiz;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public String reverse(String input) {
    	List<Character> wordAsArray = new ArrayList<>();
    	StringBuilder sb = new StringBuilder();
    	int length = input.length();
    	for (int i = 0; i < length; i++) {
    		wordAsArray.add(input.charAt(i));
    	}
    	for (int i = length - 1; i >= 0; i--) {
    		sb.append(wordAsArray.get(i));
    	}
        return sb.toString();
    }
}
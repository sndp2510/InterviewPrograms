import java.util.HashSet;
import java.util.Set;

public class CanBePallindrome {

	public static void main(String[] args) {
		
		String givenString = "abbcdeadc";
		Set <Character> uniqueCharcters = new HashSet<Character>();
		
		// Put each characters of string in Set 
		for(int index=0; index<givenString.length(); index++){
			char charAt = givenString.charAt(index);
			uniqueCharcters.add(charAt);			
		}
		
		System.out.println("Unique character :: " + uniqueCharcters.size());
		
		
		int oddCharCount = 0;
		int givenStringLength = givenString.length();
		
		// replace the char one by one from the String and count odd occurences
		for (Character uniChar : uniqueCharcters) {
			String remainingString = givenString.replaceAll(uniChar.toString(), "");
			int remainingStringLength = remainingString.length();
			
			int uniCharOcurenceCount = givenStringLength-remainingStringLength;
			if(uniCharOcurenceCount%2!=0){
			
						
				oddCharCount++;
			}
		}
		
		// Now at this stage, If oddCharCount is 1 or 0 Then string is pallindrome
		if(oddCharCount==1 || oddCharCount ==0){
			System.out.println("Given String Can be a Pallindrome");
		}else{
			System.out.println("Given String Can NOT be a Pallindrome");
		}

	}

}

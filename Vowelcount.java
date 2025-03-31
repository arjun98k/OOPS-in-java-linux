import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowelcount {
    public static void main(String[] args) {
        String str = "This is a really simple sentence";
        String vowel = "[aeiouAEIOU]";

        Pattern pattern = Pattern.compile(vowel);
        

        int vowelcount = 0;
        int consonantscount = 0;

        for (int i = 0; i < str.length(); i++) {
              char c = str.charAt(i);
              if (Character.isLetter(c)) {
                Matcher matcher = pattern.matcher(String.valueOf(c));
              

            if (matcher.find()) {
                vowelcount++;
            } else {
                consonantscount++;
                
            } }
        }
        System.out.println(vowelcount);
        System.out.println(consonantscount);
        
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CountPuncuation {
    public static void main(String[] args) {
        String str = "Arjun, might be! great coder , if he focus on coding";

        String pun ="[!,'\".;?-]";
        Pattern pattern = Pattern.compile(pun);
        Matcher matcher = pattern.matcher(str);

        int countpunc = 0;
        while (matcher.find()) {
            countpunc++;
        }

        System.out.println(countpunc);
    }
}
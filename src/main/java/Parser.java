import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static String changeSpecialCharacters(String special){
        Pattern pattern = Pattern.compile("[;*^%!@]");
        Matcher matcher = pattern.matcher(special);
        matcher.find();
        return matcher.replaceAll(";");
    }

    public static String changeBreakToLineBreak(String changedString) {
        Pattern pattern = Pattern.compile("#{2}");
        Matcher matcher = pattern.matcher(changedString);
        matcher.find();
        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println(count);
        String answer = matcher.replaceAll("\n\n");
        return answer;
    }
    public static String changeSpellName(String spelling){
        Pattern pattern = Pattern.compile("^(?i)Name", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(spelling);
        matcher.find();
        return matcher.replaceAll("Name");
    }
    public static String changeSpellMilk(String spelling){
        Pattern pattern = Pattern.compile("(?i)M[1i!]lk");
        Matcher matcher = pattern.matcher(spelling);
        matcher.find();
        return matcher.replaceAll("Milk");
    }
    public static String changeSpellBread(String spelling){
        Pattern pattern = Pattern.compile("(?i)Bread");
        Matcher matcher = pattern.matcher(spelling);
        matcher.find();
        return matcher.replaceAll("Bread");
    }
    public static String changeSpellCookies(String spelling){
        Pattern pattern = Pattern.compile("(?i)C[o0][o0]kies");
        Matcher matcher = pattern.matcher(spelling);
        matcher.find();
        return matcher.replaceAll("Cookies");
    }
    public static String changeSpellApples(String spelling){
        Pattern pattern = Pattern.compile("(?i)Apples");
        Matcher matcher = pattern.matcher(spelling);
        matcher.find();
        return matcher.replaceAll("Apples");
    }
    public static String changeSpellPrice(String spelling){
        Pattern pattern = Pattern.compile("(?i)price");
        Matcher matcher = pattern.matcher(spelling);
        matcher.find();
        return matcher.replaceAll("price");
    }



}

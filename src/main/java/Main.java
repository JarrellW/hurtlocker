import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);

    }

    public String readRawDataToString() throws Exception{
        Parser parse = new Parser();
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));

        String linebreak = parse.changeBreakToLineBreak(result);
        String spellingName = parse.changeSpellName(linebreak);
        String spellingMilk = parse.changeSpellMilk(spellingName);
        String spellingBread = parse.changeSpellBread(spellingMilk);
        String spellingCookies = parse.changeSpellCookies(spellingBread);
        return spellingCookies;
    }

}

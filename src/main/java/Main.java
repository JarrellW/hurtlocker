import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);

    }

    public String readRawDataToString() throws Exception{
        Parser parse = new Parser();
        Display display = new Display();
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));

        String linebreak = parse.changeBreakToLineBreak(result);
        String spellingName = parse.changeSpellName(linebreak);
        String spellingMilk = parse.changeSpellMilk(spellingName);
        String spellingBread = parse.changeSpellBread(spellingMilk);
        String spellingCookies = parse.changeSpellCookies(spellingBread);
        String spellingApples = parse.changeSpellApples(spellingCookies);
        String spellingPrice = parse.changeSpellPrice(spellingApples);
        String changeSpecial = parse.changeSpecialCharacters(spellingPrice);
        ArrayList<Items> itemsParser = display.itemsDisplay(changeSpecial);
        System.out.println(itemsParser);
        return null;
    }

}

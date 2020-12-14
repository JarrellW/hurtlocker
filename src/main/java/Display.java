import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Display {
    Integer errorCount;

    public Display(){
        this.errorCount = 0;
    }

    public ArrayList<Items> itemsDisplay(String string) {
        Pattern pattern = Pattern.compile("(\\S+):(\\S*);(\\S+):(\\S*);(\\S+):(\\S*);(\\S+):(\\S*)");
        Matcher matcher = pattern.matcher(string);
        ArrayList food = new ArrayList<Items>();
        while (matcher.find()) {
            String price = matcher.group(4);
            String type = matcher.group(2);
            if ("".equals(price) || "".equals(type)) {
                errorCount++;
            } else {
                System.out.println(type + " " + price);
                Items item = new Items(type, Double.valueOf(price));
                food.add(item);
            }

        }

        return food;
    }
}

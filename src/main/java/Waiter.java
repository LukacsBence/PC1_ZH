import java.util.Objects;
public class Waiter extends Chef{

    public void modifyPrice (String recipe, int price)
    {
        for(String[] rec : ettermek) {
            if (Objects.equals(rec[0], recipe)) {
                rec[2] =  Integer.toString(price);
            }
        }
    }
}
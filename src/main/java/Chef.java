import java.util.ArrayList;
import java.util.Objects;

public class Chef
{
    public Chef() {
    }

    protected ArrayList<String[]> ettermek = new ArrayList<>();
    public void newRecipe (String recipe)
    {
        String[] etterem = new String[2];
        etterem[0] = recipe;
        etterem[1] = " ";
        ettermek.add(etterem);
    }
    public void removeRecipe (String recipe)
    {
        for (int i = 0; i < ettermek.size(); i++) {
            if(Objects.equals(ettermek.get(i)[0], recipe))
            {
                ettermek.remove(i);
            }
        }
    }

    public String getMenu(){
        String result = "";

        if(ettermek.size() != 0){
            for(int i = 0; i < ettermek.size(); i++){
                result += ettermek.get(i)[0]+ " " +ettermek.get(i)[1];
                if(i != ettermek.size() - 1) result += "\r\n";
            }
        }
        return result;
    }
}
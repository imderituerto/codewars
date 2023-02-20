import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

    List<String> filteredColours = new ArrayList<>();   // ADDED

    for (String colour: filteredColours) {
        if (colour.charAt(0) == 'r'){     // ADDED
            filteredColours.add(colour);
        }
    }

        System.out.println(filteredColours);
    }
}
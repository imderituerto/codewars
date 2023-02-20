import java.util.List;

public class MixedList {

        public int sum(List<?> mixed) {
            int[] test = {0,1,2,3,4,5,6,7,8,9};
            for(int i = 0; i < mixed.size(); i++){
                if (mixed.get(i) != test)
                        return -1;
            }
        }
}

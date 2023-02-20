import java.util.Arrays;

public class SmallestInt {

        public static int findSmallestInt(int[] args) {
            Arrays.sort(args);
            return args[0];
        }
    }

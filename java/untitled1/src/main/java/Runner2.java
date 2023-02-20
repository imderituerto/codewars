// CODE WARS EXERCISES

public class Runner2 {
    public static int[] invert(int[] array) {
        int n = -1;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 0) {
                array[i] *= n;
                return array;
            }
        }
        return array;
    }
}

public class BestGrade {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int avg = 0;
        int n = classPoints.length;
        for (int point : classPoints)
            sum = sum + point;
            avg = (sum / n);
            return yourPoints < avg ? false : true;
    }
}

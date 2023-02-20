public class GetGrade {
        public static char getGrade(int s1, int s2, int s3) {
            double x = s1 + s2 + s3;
            if(x >= 90 && x <= 100)
                return 'A';
            else if(x >= 80 && x < 90)
                return 'B';
            else if(x >= 70 && x < 80)
                return 'C';
            else if(x > 60 && x < 70)
                return 'D';
            else if(x > 0 && x <= 60)
                return 'F';
            return 0;
        }
    }

public class solution {

    public class Kata
    {
        public static int[] countPositivesSumNegatives(int[] input)
        {
            //initialize two new variables (int)
            int countPositives = 0;
            int sumNegatives = 0;

            //return an empty array ([])
            if(input == null || input.length==0) return new int[0];

            //loop through array
            for(int i = 0; i < input.length; i++){
                if(input[i] > 0) countPositives++;
                else sumNegatives += input[i];}

            //return variables in a new double array
            return new int[]{countPositives, sumNegatives};
            }
        }
    }

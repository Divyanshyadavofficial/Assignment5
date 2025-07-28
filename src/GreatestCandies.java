import java.util.Arrays;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(MaxCandies(candies,extraCandies)));

    }
    static boolean[] MaxCandies(int[]candies,int extraCandies){
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max = candies[i];
            }
        }
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>=max){
                result[i] = true;
            }
            else {
                result[i]=false;
            }
        }
        return result;
    }
}

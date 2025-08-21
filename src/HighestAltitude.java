import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {1,2,4,-1,5};
        System.out.println((largestAltitude(gain)));
    }
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestPoint = currentAltitude;
        for (int j : gain) {
            currentAltitude = currentAltitude + j;
            highestPoint = Math.max(highestPoint, currentAltitude);
        }
        return highestPoint;
    }

}

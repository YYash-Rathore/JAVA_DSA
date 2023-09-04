import java.util.HashMap;
import java.util.Map;

public class practice {
    public static void main(String[] args) {
        String[] balloons = {"r", "g", "b", "b", "g", "y", "y"};
        String result = findOddColor(balloons);
        System.out.println("The odd-colored balloon is: " + result);
    }

    public static String findOddColor(String[] balloons) {
        Map<String, Integer> colorCount = new HashMap<>();

        // Count the occurrences of each color
        for (String color : balloons) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        // Find the first color with an odd count
        for (String color : balloons) {
            if (colorCount.get(color) % 2 != 0) {
                return color;
            }
        }

        // If all counts are even, return the "All are even" message
        return "All are even";
    }
}


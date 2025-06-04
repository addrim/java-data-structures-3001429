import java.util.Arrays;

public class practiceArrays {
    public static void main(String[] args) {

        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"monday", "tuesday"};
        System.out.println(Arrays.toString(weekdays));

        for(String day : weekdays) {
            System.out.println("week day: " + day);
        }

        for(int i = 0; i < weekdays.length; i++) {
            System.out.println("week day: " + weekdays[i].toUpperCase());
        }
    }
}

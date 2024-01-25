import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int cookingMinute = scanner.nextInt();
        
        if (minute + cookingMinute >= 60) {
            if (hour+(minute+cookingMinute)/ 60 >= 24) {
                System.out.println((hour+(minute+cookingMinute)/ 60)-24);
                System.out.println((minute+cookingMinute) % 60);
            } else {
                System.out.println(hour+(minute+cookingMinute)/60);
                System.out.println((minute+cookingMinute) % 60);
            }
        } else {
            System.out.println(hour);
            System.out.println(minute+cookingMinute);
        }
    }
}

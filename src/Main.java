import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DefinitionOfTheLeap(2000);
        defineTheApplication(0, 2000);
        int count_days = CalculationOfDeliveryDays(80);
        System.out.println("delivery time " + count_days+" days");

    }

    // Task 1
    public static void DefinitionOfTheLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Leap year");
        } else {
            System.out.println(year + " Not a leap year");
        }


    }

    // Task 2
    public static void defineTheApplication(int OC, int year) {
        int currentYear = LocalDate.now().getYear();
        if (OC == 0 && year >= currentYear) {
            System.out.println("You have the current version of IOS");
        } else if (OC == 0 && year < currentYear) {
            System.out.println("You have an old version of iOS, update the program");
        } else if (OC == 1 && year >= currentYear) {
            System.out.println("You have the current version of Android");
        } else if (OC == 1 && year < currentYear) {
            System.out.println("You have an old version of Android, update the program");
        } else {
            System.out.println("The operating system is not defined");
        }
    }

    // Task 3
    public static int CalculationOfDeliveryDays(int distance){
        int days = 0;
        if (distance >=0&&distance <40){
            days +=1;
        }
        if (distance >=40&&distance <60){
            days +=2;
        }
        if (distance >=60&&distance <80){
            days +=3;
        }
        if (distance >=80){
            days +=4;
        }
        return days;

    }
}

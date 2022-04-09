public class Greeting {
    public static void main (String[] args) {
        String day = "Monday";
        String hours = "am";
        switch (day){
            case"Sunday":
                System.out.println("Sunday is a Holiday");
            switch (hours) {
                case "am":
                    System.out.println("God Morning");
                    break;
                case "pm":
                    System.out.println("God Evening");
                    break;
            }
            break;
            case "Monday":
                System.out.println("Monday is a Working Day..");
        switch (hours){
            case "am":
                System.out.println("Good Morning");
                break;
            case "pm":
                System.out.println("Good Evening");
                break;

        }
        break;
            default:
                System.out.println("Invalid Day");
        }
    }
}

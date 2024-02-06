public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();

        displayTime("Before setting time: ", time1);
        System.out.println();
        time1.setTime(13,23, 30);
        displayTime("After Setting Time", time1);
        System.out.println();

        try {
            time1.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        displayTime("After setting time to invalid value", time1);
    }
    public static void displayTime(String header, Time t){
        System.out.printf("%s%nUniversal Time: %s%nStandard time %s%n", header, t.toUniversalString(), t.toString());
    }
}

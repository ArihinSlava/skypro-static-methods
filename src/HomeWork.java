public class HomeWork {

    public static void leapYear (int yearNumbers) {
        if (yearNumbers % 4 == 0) {
            System.out.println(yearNumbers + " - год высокосный");
        } else if (yearNumbers % 100 != 0 || yearNumbers % 400 == 0) {
            System.out.println(yearNumbers + " - год невысокосный");
        }
    }


    public static void main(String[] args) {
        /// Задача 1
        System.out.println(" Задача 1 ");
        int yearNum = 2020;
        leapYear(yearNum);
        yearNum = 2030;
        leapYear(yearNum);


    }
}








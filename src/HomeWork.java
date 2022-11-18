import java.time.LocalDate;

public class HomeWork {

    public static void leapYear (int yearNumbers) {
        if (yearNumbers % 4 == 0) {
            System.out.println(yearNumbers + " - год высокосный");
        } else if (yearNumbers % 100 != 0 || yearNumbers % 400 == 0) {
            System.out.println(yearNumbers + " - год невысокосный");
        }
    }

    public static void clientDevice (boolean clientOS , int clientDeviceYear) {
        String lightVersion;
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear > currentYear) {
            lightVersion = " ";
        } else lightVersion = " облегченную";
        if (clientOS) {
            System.out.println("Установите " + lightVersion + " для iOS устройства");
        } else {
            System.out.println("Установите " + lightVersion + " для Android устройства");
        }
    }


    public static void main(String[] args) {
        /// Задача 1
        System.out.println(" Задача 1 ");
        int yearNum = 2020;
        leapYear(yearNum);
        yearNum = 2030;
        leapYear(yearNum);
        int currentYear = LocalDate.now().getYear();
        leapYear(currentYear);

        /// Задача 2
        System.out.println(" Задача 2 ");
        boolean clientOS = true;
        int clientDeviceYear = 2020;
        clientDevice(clientOS , clientDeviceYear);
        clientOS = false;
        clientDeviceYear = 2030;
        clientDevice(clientOS, clientDeviceYear);


    }
}








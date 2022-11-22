import java.time.LocalDate;

public class HomeWork {

    public static void clientDevice (int typeOs , int yearDevice) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > yearDevice && typeOs == 1) {
            System.out.println(" Установите lite-версию для Android");
        } else if (currentYear <= yearDevice && typeOs == 1) {
            System.out.println("Установите версию для Android");
        } else if (currentYear > yearDevice && typeOs == 0) {
            System.out.println(" Установите lite-версию для iOS");
        } else if (currentYear <= yearDevice && typeOs == 0) {
            System.out.println(" Установите версию для iOS");
        }
    }

    public static void leapYear (int yearNumbers) {
        if (yearNumbers % 4 == 0 && yearNumbers % 100 != 0 || yearNumbers % 400 == 0) {
            System.out.println(yearNumbers + " - год высокосный");
        } else  {
            System.out.println(yearNumbers + " - год невысокосный");
        }
    }



    public static void deliveryDays (int deliveryDistance) {
        System.out.println("Удаленность клиента " + deliveryDistance + " км");
        if (deliveryDistance > 100) {
            System.out.println(" Извините, доставка невозможна");
        } else {
            System.out.println("На доставку потребуется дней: " + (1 + (deliveryDistance + 19) / 40));
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
        int typeOS = 0;
        int yearDevice = 2020;
        clientDevice(typeOS ,yearDevice);



        /// Задача 3
        System.out.println(" Задача 3 ");
        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);
        deliveryDistance = 50;
        deliveryDays(deliveryDistance);
        deliveryDistance = 20;
        deliveryDays(deliveryDistance);


    }
}








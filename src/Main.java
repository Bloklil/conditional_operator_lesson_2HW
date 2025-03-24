import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        System.out.println(checkYears(year));

        System.out.println("Задание 2");
        int osType = 1; // 0-IOS, 1-android
        int clientDeviceYear = 2024;
        suggestAppVersion(osType, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставка свыше 100 км невозможна.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        System.out.println("Задание 5 старое"); // старое задание не удалял
        byte monthNumber = 13;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Это зима");
                break;
            case 3, 4, 5:
                System.out.println("Это весна");
                break;
            case 6, 7, 8:
                System.out.println("Это лето");
                break;
            case 9, 10, 11:
                System.out.println("Это осень");
                break;
        }
        if (monthNumber > 12) {
            System.out.println("Такого месяца не существует пока");
        }
    }

    public static String checkYears(int year) {
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            return year + " год является високосным";
        } else if (year > 1584) {
            return year + " год не является високосным";
        } else {
            return "В это время ещё не задумывались о високосных годах";
        }
    }

    public static void suggestAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear(); // Текущий год
        if (osType == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Вы можете установить обычное приложение");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1; // Доставка в пределах 20 км занимает 1 день
        } else if (deliveryDistance <= 60) {
            return 2; // Доставка от 20 до 60 км занимает 2 дня
        } else if (deliveryDistance <= 100) {
            return 3; // Доставка от 60 до 100 км занимает 3 дня
        } else {
            return -1; // Доставка свыше 100 км невозможна
        }
    }

}
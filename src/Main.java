public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte clientOS = 0; // 0-IOS, 1-android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        short clientDeviceYear = 2_016;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Мы можете установить обычное приложение");
        }

        System.out.println("Задание 3");
        int year = 2025;
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является высокосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(" в это время ещё не задумывались о високосных годах");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 1;
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("Потребуется одни сутки на доставку");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("На доставку потребуется пара суток");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println(" На доставку нужно трое суток");
        } else {
            System.out.println("К сожалению мы к вам не доедем");
        }

        System.out.println("Задание 4");
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
}
public class Main {
    public static void main(String[] args) {
        printResult(2020);               // Условие к заданию 1
        printVersionOS(2014, 1);// Условие к заданию 2
        printResultDelivery(40);      // Условие к заданию 3
    }
    /**
     * Задание 1
     */
    public static boolean isCalculateYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printResult(int year) {
        if (isCalculateYear(year)) {
            System.out.println((year + " год является високосным"));
            return;
        }
        System.out.println((year + " год не является високосным"));
    }
    /**
     * Задание 2
     */
    public static boolean isLastUpdateYear(int year) {
        return year >= 2015; //Год выпуска телефона. С 2015 г. обновления не требуются
    }
    public static String getVersion(int version) {
        if (version == 0) {
            return "IOS";
        }
        return "Android";
    }
    public static void printVersionOS(int year, int versionOS) {
        if (isLastUpdateYear(year)) {
            System.out.println("Установите версию приложения для  " + getVersion(versionOS));
        } else {
            System.out.println("Установите  облегченную версию приложения для  " + getVersion(versionOS));
        }
    }
    /**
     * Задание 3
     */
    public static boolean isCalculateDistance(int distance) {
        return distance > 0 && distance < 20000;
    }
    public static void printResultDelivery(int distance) {
        if (isCalculateDistance(distance)) {
            System.out.println("Потребуется дней : " + ((distance + 19) / 40 + 1));
            return;
        }
            System.out.println("не корректные данные");
    }
}



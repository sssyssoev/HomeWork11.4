

import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        System.out.println(" Попытка сдать 11-е ДЗ с ТРЕТЬЕГО раза");
    }

    public static int enterInt(String str) {
        Scanner s = new Scanner(System.in);

        System.out.printf(str);

        int x = s.nextInt();
        System.out.printf("You entered  :  " + x);
        return x;
    }

    public static void checkIfYearLeap(int year) {
        System.out.println("    Проверяем год на високосность");

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "  Год високосный");
        } else {
            System.out.println(year + "  Год невисокосный");
        }
    }

    public static void task1() {
        String yearStr = "Введите год";
        int year = enterInt(yearStr);
        checkIfYearLeap(year);

    }

    public static void checkDeviceType(int devOS, int deviceManYear) {

        int currYear = LocalDate.now().getYear();

        if (deviceManYear < currYear) {
            if (devOS == 0) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (devOS == 1) System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (deviceManYear >= currYear) {
            if (devOS == 0) System.out.println("  Установите версию приложения для IOS по ссылке");
            if (devOS == 1) System.out.println("  Установите версию приложения для Android по ссылке");
        }
    }


    public static void task2() {
        System.out.println("  ");
        System.out.println("  Проверяем версию приложения");
        int clientOS = enterInt("  Введите тип устройства: 0 - iOS/ 1 - Android");
        int deviceManYear = enterInt("Введите год производства устройства");
        int currentYear = LocalDate.now().getYear();
        System.out.println("Введен " + deviceManYear + " год про-ва устройстра");
        checkDeviceType(clientOS, deviceManYear);
    }

    public static int checkTime(int deliveryDistance) {

        int deliveryTime = 0;


        System.out.println("              ");


        if (deliveryDistance >= 20) {
            deliveryTime = 1;

        }

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;

        }

        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;

        }


        if (deliveryDistance > 100) {

            deliveryTime = -1;

        }

        if (deliveryTime >= 0) {
            System.out.println("  доставка займет: " + deliveryTime + " дней ");
        } else {

            System.out.println("  Доставка невозможна");
        }


        return deliveryTime;
    }

    public static void task3() {
        int delDist = enterInt("  введите дистанцию доставки");
        checkTime(delDist);
    }
}


public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Условный оператор 2. Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        System.out.println("Условный оператор 2. Задача 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear == 2015) {
            System.out.println("Приложение будет работать");
        }
        //Задание 3
        System.out.println("Условный оператор 2. Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");
        //Задание 4
        System.out.println("Условный оператор 2. Задача 4");
        int deliveryDistance = 95;
        int daysForDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (daysForDelivery + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (daysForDelivery + 2));
        }
        else {
            System.out.println("Доставка не осуществляется");
        }
        //Задание 5
        System.out.println("Условный оператор 2. Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
                default:
                System.out.println("Такого месяца не существует");
        }
    }
}
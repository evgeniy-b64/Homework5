public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {// Пишем код для задачи 1
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 1: Операционная система ||");
        System.out.println(separator);
        byte clientOS = (byte) (Math.random() * 2); // 0 — iOS, 1 — Android
        if ( clientOS == 0 ){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {// Пишем код для задачи 2
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 2: Операционная система - 2 ||");
        System.out.println(separator);
        byte clientOS = (byte) (Math.random() * 3); // 0 — iOS, 1 — Android
        short clientDeviceYear = 2015;
        if ( clientOS == 0 ){
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ваша ОС не поддерживается");
        }
    }

    public static void task3 () {// Пишем код для задачи 3
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 3: Високосный год ||");
        System.out.println(separator);
        short year = 2400;//(short) (Math.random() * 2400);
        boolean isLeapYear = false;
        if ( year % 2 == 0 ) {isLeapYear = true;}
        if ( year % 100 == 0 ) {isLeapYear = false;}
        if ( year % 400 == 0 ) {isLeapYear = true;}

        if (isLeapYear == true ) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }
    }

    public static void task4 () {// Пишем код для задачи 4
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 4: Доставка ||");
        System.out.println(separator);
        byte deliveryDistance = 95;
        byte deliveryTime;
        if (deliveryDistance < 20)  {
            deliveryTime = 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
        } else {
            deliveryTime = 3;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: "+deliveryTime);
        }
    }

    public static void task5 () {// Пишем код для задачи 5
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 5: Времена года ||");
        System.out.println(separator);
        byte monthNumber = (byte) ((Math.random() * 12)+1);
        System.out.println("Номер месяца - "+monthNumber);
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Время года - зима");
                break;
            case 3:
            case 4:
            case 5:
              System.out.println("Время года - весна");
              break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень");
                break;
            default:
                System.out.println("Не определено.");
        }
    }
}
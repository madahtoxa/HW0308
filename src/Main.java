public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");
        var osUser = 3;
        int year = 2011;
        if (osUser == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osUser == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osUser == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для android по ссылке");
        } else if (osUser == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else System.out.println("Некорретные данные");


        System.out.println("Задание 3");
        double yearHW3 = 2024;
        double qwe = (yearHW3 / 4);
        double test = yearHW3 / 4 % 1;
        if (yearHW3 / 4 % 1 == 0 && yearHW3 % 100 != 0 || yearHW3 % 400 == 0) {
            System.out.println(yearHW3 + " год высокосный");
        } else
            System.out.println(yearHW3 + " не высокосный");


        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int distanceCount = 0;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println("Дней на доставку "+deliveryDays);


        System.out.println("Задание 5");
        int mounth = 11;
        switch (mounth) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
    }
}
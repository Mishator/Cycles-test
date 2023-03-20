public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int salary = 65535;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int salary = 65535;
        int total = 0;
        for ( ; total < 1_000_000; ) {
            total = total + total/100;
            total = total + salary;
            System.out.println(total);
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int salary = 65535;
        int total = 0;
        while (total < 1_000_000) {
            total = total + total/100;
            total = total + salary;
            System.out.println(total);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int [] weights ={90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        String phone = "604157537";
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        }
        System.out.println("phone = " + phone);
    }
    }
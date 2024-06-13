public class Main {
    public static void main(String[] args) {

// 1.
        System.out.println("1.");
        int deposit = 0, month = 0;
        while (deposit <= 2459000) {
            deposit = deposit + 15000;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d\n", month, deposit);
        }
        System.out.println();

// 2.
        System.out.println("2.");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

// 3.
        System.out.println("\n");
        System.out.println("3.");
        int populationY = 12000000;
        int birthRate = 17, birth;
        int mortalityRate = 8, died;
        for (i = 1; i <= 10; i++) {
            died = populationY * mortalityRate / 1000;
            birth = populationY * birthRate / 1000;
            populationY = populationY + birth - died;
            System.out.printf("Год %d, численность населения составляет %d\n", i, populationY);
        }


// 4.
        System.out.println();
        System.out.println("4.");
        double depositInBank = 15000;
        i = 0;
        while (depositInBank < 12000000) {
            i++;
            depositInBank = depositInBank + depositInBank * 7 / 100;
            System.out.printf("После %d месяца вклад вырос до %.2f руб\n", i, depositInBank);
        }

// 5.
        System.out.println();
        System.out.println("5.");
        depositInBank = 15000;
        i = 0;
        while (depositInBank < 12000000) {
            i++;
            depositInBank = depositInBank + depositInBank * 7 / 100;
            if (i % 6 == 0) {
                System.out.printf("После %d месяца вклад вырос до %.2f руб\n", i, depositInBank);
            }
        }
        System.out.printf("После %d месяца вклад наконец то превысил 12 000 000 и составил %.2f р\n", i, depositInBank);

// 6.
        System.out.println();
        System.out.println("6.");
        depositInBank = 15000;
        int monthPercent = 7;
        int depositYear = 12 * 9;
        for (i = 1; i <= depositYear; i++) {
            depositInBank = depositInBank + depositInBank * monthPercent / 100;
            if (i % 6 == 0) {
                System.out.printf("После %d месяца накопления составляют %.2fр.\n", i, depositInBank);
            }
        }

// 7.
        System.out.println("\n7.");
        int monthFirstFriday = 2;
        for (i = monthFirstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        // v2
        System.out.println();
        for (i = monthFirstFriday; i <= 31; i++) {
            if ((i - monthFirstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

// 8.
        System.out.println("\n8.");
        int year = 2024;
        int yearBelow200 = year - 200;
        int yearUp100 = year + 100;
        int period = 79;
        for (i = yearBelow200; i <= yearUp100; i++) {
            if (i % period == 0) {
                System.out.println(i);
            }
        }



    }
}
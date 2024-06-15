public class Main {
    public static void main(String[] args) {

// 1.   v1
        System.out.println("\n1.");
        int purposeForDeposit = 2459000;
        int contribution = 15000;
        int deposit = 0, month = 0;
        while (deposit <= purposeForDeposit) {
            deposit += contribution;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d\n", month, deposit);
        }
        System.out.println();
//      v2
        deposit = 0;
        month = 0;
        while (deposit <= purposeForDeposit) {
            deposit += contribution;
            month++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d\n", month, deposit);
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
            populationY += birth - died;
            System.out.printf("Год %d, численность населения составляет %d\n", i, populationY);
        }


// 4.
        System.out.println();
        System.out.println("4.");
        double depositInBank = contribution;
        int monthPercent = 7, targetAccumulation = 12000000;
        month = 0;
        while (depositInBank < targetAccumulation) {
            month++;
            depositInBank = percentage(depositInBank, monthPercent);
            System.out.printf("После %d месяца вклад вырос до %.2f руб\n", month, depositInBank);
        }

// 5.
        System.out.println();
        System.out.println("5.");
        int reportingPeriod = 6;
        depositInBank = contribution;
        month = 0;
        while (depositInBank < targetAccumulation) {
            month++;
            depositInBank = percentage(depositInBank, monthPercent);
            if (month % reportingPeriod == 0) {
                System.out.printf("После %d месяца вклад вырос до %.2f руб\n", month, depositInBank);
            }
        }
        System.out.printf("После %d месяца вклад наконец то превысил 12 000 000 и составил %.2f р\n", month, depositInBank);

// 6.
        System.out.println();
        System.out.println("6.");
        depositInBank = contribution;
        int depositYear = 12 * 9;
        for (month = 1; month <= depositYear; month++) {
            depositInBank =  percentage(depositInBank, monthPercent);
            if (month % reportingPeriod == 0) {
                System.out.printf("После %d месяца накопления составляют %.2fр.\n", month, depositInBank);
            }
        }

// 7.
        System.out.println("\n7.");
        int monthFirstFriday = 2, dayInMonth = 31;
        for (i = monthFirstFriday; i <= dayInMonth; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        // v2
        System.out.println();
        for (i = monthFirstFriday; i <= dayInMonth; i++) {
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

    private static double percentage(double depositInBank, int monthPercent) {
        return depositInBank * (100 + monthPercent) / 100;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("1.");
        int deposit = 0, month = 0;
        while (deposit <= 2459000) {
            deposit = deposit + 15000;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d\n", month, deposit);
        }
        System.out.println();

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

    }
}
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

    }
}
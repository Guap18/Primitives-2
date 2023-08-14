public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int was = 100;
        int refill = 1100;
        int from = 1000;
        int bonus = 100;
        if (refill > from) {
            int total = refill / bonus + refill + was;
            System.out.println("Итоговый счёт - " + total + "руб");

        } else {
            int total = refill + was;
            System.out.println("Итоговый счёт -" + total + "руб");
        }

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
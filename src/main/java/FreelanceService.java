public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int monthsRest = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                monthsRest++;
            } else {
                money += income;
                money -= expenses;
            }

        }
        return monthsRest;
    }

}


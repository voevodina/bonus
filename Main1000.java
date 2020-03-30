public class Main {
    public static void main(String[] args) {
        //amount - сумма пополнения
        // balance - текущий баланс клиента
        long balance = 100;
        long bonus;
        long amount = 1000;
        if (amount > 1000) {
            bonus = (balance + amount) / 100;
        } else {
            bonus = 0;
        }
        balance = balance + amount + bonus;
        System.out.println(bonus);
    }
}
public class BankExeption {
    public static void main(String[] args) {

        BankAccount zoro = new BankAccount();
        zoro.deposit(20000.00);
        while (true) {
            try {
                zoro.withDraw(6000);
            } catch (LimitException e) {
                try {
                    zoro.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;
            }
        }
    }
}
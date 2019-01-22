package Demeter;

public class Customer {
    private Wallet wallet;

    public int getPayment(int payment){
        if(wallet == null) throw NotEnoughMoneyExcepyion();
        if(wallet.getTotalMoney() >= payment){
            wallet.substractMoney(payment);
            return payment
        }
    }


    private Exception NotEnoughMoneyExcepyion() {
    }
}

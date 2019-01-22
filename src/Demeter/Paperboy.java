package Demeter;

public class Paperboy {

    int payment = 10000;

    try{
        int piadAmount = customer.getPayment(payment);
    }
    catch(NotEnoughMoneyExcepyion ex){
        System.out.println("다음에 올게요!");
    }
}

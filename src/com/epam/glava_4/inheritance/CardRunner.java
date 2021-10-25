package com.epam.glava_4.inheritance;

public class CardRunner {
    public static void main(String[] args) {
        CardAction action1 = new CardAction();
        CardAction action2 = new CreditCardAction();
        CreditCardAction creditCardAction = new CreditCardAction();
        action1.doPayment(15.5);
        action2.doPayment(21.2);
        ((CreditCardAction) action2).checkCreditLimit();
        creditCardAction.doPayment(7.0);
        creditCardAction.checkCreditLimit();
  //      ((CreditCardAction) action1).checkCreditLimit();
    }
}


public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double cost = 2.50;
        // increase the amount of cash by the price of an affordable mean and return the change
        if(payment<cost){
            return payment;
        }
        this.money += cost;
        this.affordableMeals++;
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment-cost;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double cost = 4.30;
        // increase the amount of cash by the price of a hearty mean and return the change
        if(payment<cost){
            return payment;
        }
        this.money += cost;
        this.heartyMeals++;
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment-cost;
    }
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        double cost = 2.50;
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if(card.balance()>=cost){
            card.takeMoney(cost);
            this.affordableMeals++;
            return true;
        }
        // otherwise false is returned
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double cost = 4.30;
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if(card.balance()>=cost){
            card.takeMoney(cost);
            this.heartyMeals++;
            return true;
        }
        return false;
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum>=0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

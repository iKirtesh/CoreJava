package Design_Patterns.Behavioral_Patterns.Strategy;


interface DiscountStrategy {
    double giveDiscount();
}

class flatDiscount implements DiscountStrategy {
    @Override
    public double giveDiscount() {
        // TODO: Implement this method
        System.out.println("Flat discount applied");
        return 0;
    }
}

class CouponDiscount implements DiscountStrategy {
    @Override
    public double giveDiscount() {
        System.out.println("Coupon discount applied");
        return 0;
    }
}

class CashbackDiscount implements DiscountStrategy {
    @Override
    public double giveDiscount() {
        System.out.println("Cashback discount applied");
        return 0;
    }
}

class ApplyDiscount {
    private DiscountStrategy discountStrategy;

    public ApplyDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    void getDiscount() {
        discountStrategy.giveDiscount();
    }

    void setStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}

public class Main {
    public static void main(String[] args) {
        ApplyDiscount applyDiscount = new ApplyDiscount(new flatDiscount());
        applyDiscount.getDiscount();

        applyDiscount.setStrategy(new CashbackDiscount());
        applyDiscount.getDiscount();
    }
}

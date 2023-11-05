package Design_Patterns.Structural_Patterns.Adapter;

interface AndroidCharger {
    void chargeAndroidPhone();
}

class ChargerABC implements AndroidCharger {

    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your android phone charging");
    }
}

interface AppleCharger {
    void chargePhone();
}

class ChargerXYZ implements AppleCharger {

    @Override
    public void chargePhone() {
        System.out.println("Your iphone charging");
    }
}


class IPhone15 {
    private AppleCharger appleCharger;

    public IPhone15(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIphone() {
        appleCharger.chargePhone();
    }
}

class Adapter implements AppleCharger {
    private final AndroidCharger charger;

    public Adapter(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargeAndroidPhone();
        System.out.println("Your Phone is charging with adapter");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Program Started");
        
        AppleCharger charger = new Adapter(new ChargerABC());

        IPhone15 iPhone15 = new IPhone15(charger);
        iPhone15.chargeIphone();
    }
}
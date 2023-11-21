package Design_Patterns.Behavioral_Patterns.ChainofResponsibility;

interface Approver {
    void setNext(Approver approver);
    void approveRequest(int amount);
}

class Manager implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver approver) {
        this.next = approver;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= 1000) {
            System.out.println("Manager approves purchase request");
        } else if (next != null) {
            next.approveRequest(amount);
        }
    }
}

class Director implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver approver) {
        this.next = approver;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= 5000) {
            System.out.println("Director approves purchase request");
        } else if (next != null) {
            next.approveRequest(amount);
        }
    }
}

class VicePresident implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver approver) {
        this.next = approver;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= 10000) {
            System.out.println("Vice President approves purchase request");
        } else if (next != null) {
            next.approveRequest(amount);
        }
    }
}

class President implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver approver) {
        this.next = approver;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= 20000) {
            System.out.println("President approves purchase request");
        } else if (next != null) {
            next.approveRequest(amount);
        }
    }
}

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vp = new VicePresident();
        Approver president = new President();

        manager.setNext(director);
        director.setNext(vp);
        vp.setNext(president);

        manager.approveRequest(500);
        manager.approveRequest(1500);
        manager.approveRequest(5000);
        manager.approveRequest(15000);
        manager.approveRequest(25000);
    }
}
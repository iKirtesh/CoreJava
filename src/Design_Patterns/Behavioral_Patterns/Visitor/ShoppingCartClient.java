package Design_Patterns.Behavioral_Patterns.Visitor;

interface shoppingItem {
    int accept(ShoppingCartVisitor visitor);
}

interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

class Book implements shoppingItem {
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruit implements shoppingItem {
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    public int visit(Book book) {
        int cost = 0;
        if(book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost = " + cost);
        return cost;
    }

    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }
}

public class ShoppingCartClient {
    private static int calculatePrice(shoppingItem[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for(shoppingItem item: items) {
            sum += item.accept(visitor);
        }
        return sum;
    }

    public static void main(String[] args) {
        shoppingItem[] items = new shoppingItem[]{
            new Book(20, "1234"),
            new Book(100, "5678"),
            new Fruit(10, 2, "Banana"),
            new Fruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }
}
public class Pizza {
    private String m_size;
    private int m_cheese;
    private int m_pepperoni;
    private int m_veggie;

    // Default constructor
    public Pizza() {
        m_size = "medium";
        m_cheese = 1;
        m_pepperoni = 0;
        m_veggie = 0;
    }

    // Overloaded constructor
    public Pizza(String size, int cheese, int pepp, int vegg) {
        m_size = size;
        m_cheese = cheese;
        m_pepperoni = pepp;
        m_veggie = vegg;
    }

    // Copy constructor
    public Pizza(Pizza pie) {
        this.m_size = pie.m_size;
        this.m_cheese = pie.m_cheese;
        this.m_pepperoni = pie.m_pepperoni;
        this.m_veggie = pie.m_veggie;
    }

    // Accessors and Mutators
    public String getSize() {
        return m_size;
    }

    public int getCheese() {
        return m_cheese;
    }

    public int getPepperoni() {
        return m_pepperoni;
    }

    public int getVeggie() {
        return m_veggie;
    }

    public void setSize(String size) {
        m_size = size;
    }

    public void setCheese(int cheese) {
        m_cheese = cheese;
    }

    public void setPepperoni(int pepperoni) {
        m_pepperoni = pepperoni;
    }

    public void setVeggie(int veggie) {
        m_veggie = veggie;
    }

    // Calc cost
    public double calcCost() {
        double baseCost = 0;
        if (m_size.equalsIgnoreCase("small")) {
            baseCost = 10;
        } else if (m_size.equalsIgnoreCase("medium")) {
            baseCost = 12;
        } else if (m_size.equalsIgnoreCase("large")) {
            baseCost = 14;
        }
        double toppingCost = 2 * (m_cheese + m_pepperoni + m_veggie);
        return baseCost + toppingCost;
    }

    // Create string for pizza composition
    public String toString() {
        return "Pizza size: " + m_size + "\nCheese toppings: " + m_cheese + "\nPepperoni toppings: " + m_pepperoni
                + "\nVeggie toppings: " + m_veggie + "\nTotal cost: $" + calcCost();
    }

    // Check if two pizzas are equal
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pizza otherPizza = (Pizza) obj;
        return m_size.equals(otherPizza.getSize()) && m_cheese == otherPizza.getCheese()
                && m_pepperoni == otherPizza.getPepperoni() && m_veggie == otherPizza.getVeggie();
    }

    // public static void main(String[] args) {
    //     Pizza pizza1 = new Pizza("large", 1, 1, 2);
    //     System.out.println(pizza1.toString());
    //     System.out.println("Cost: $" + pizza1.calcCost());

    //     System.out.println("Are pizza1 and pizza1 equal? " + pizza1.equals(pizza1));
    // }
}

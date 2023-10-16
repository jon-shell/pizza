/** Pizza.java
 * @author Name : John Shelton 
 * @author Student ID: 2407106
 * @author Email : jshelton@chapman.edu
 * Course : CPSC 231 Section 02
 * Assignment : Mastery Project 2
 */
/**
 * Pizza provides the default, copy, and overload constructors as well as tools neccesary to 
 * calculate the price of a pizza.
 */
public class Pizza {
    private String m_size;
    private int m_cheese;
    private int m_pepperoni;
    private int m_veggie;

    /** Default constructor
     * Creates the base constructor with a medium size and cheese
    */
    public Pizza() {
        m_size = "medium";
        m_cheese = 1;
        m_pepperoni = 0;
        m_veggie = 0;
    }

    /** Overloaded constructor
     * Creates a template to be able to instantiate new pizzas 
     * @param string size 
     * @param int cheese 
     * @param int pepp
     * @param int vegg
    */
    public Pizza(String size, int cheese, int pepp, int vegg) {
        m_size = size;
        m_cheese = cheese;
        m_pepperoni = pepp;
        m_veggie = vegg;
    }

    /** Copy constructor
     * Creates a method to copy certain prexisting pizza objects 
     * @param Pizza pie
    */
    public Pizza(Pizza pie) {
        this.m_size = pie.m_size;
        this.m_cheese = pie.m_cheese;
        this.m_pepperoni = pie.m_pepperoni;
        this.m_veggie = pie.m_veggie;
    }

    /** Accessors getSize
     * @return m_size
    */
    public String getSize() {
        return m_size;
    }
    /** Accessors getCheese
     * @return m_cheese
    */
    public int getCheese() {
        return m_cheese;
    }
    /** Accessors getPepperoni
     * @return m_pepperoni
    */
    public int getPepperoni() {
        return m_pepperoni;
    }
    /** Accessors getVeggie
     * @return m_veggie
    */
    public int getVeggie() {
        return m_veggie;
    }
    /** Mutator setSize
     * @param string size
    */
    public void setSize(String size) {
        m_size = size;
    }
    /** Mutator setCheese
     * @param int cheese
    */
    public void setCheese(int cheese) {
        m_cheese = cheese;
    }
    /** Mutator setPepperoni 
     * @param int pepperoni
    */
    public void setPepperoni(int pepperoni) {
        m_pepperoni = pepperoni;
    }
    /** Mutator setVeggie
     * @param int veggie
    */
    public void setVeggie(int veggie) {
        m_veggie = veggie;
    }
    /** Calculates the cost of a pizza based on size and toppings 
     * @return baseCost + toppingCost  
    */ 
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

    /** Create string for pizza composition
     * @return string 
     */ 
    public String toString() {
        return "Pizza size: " + m_size + "\nCheese toppings: " + m_cheese + "\nPepperoni toppings: " + m_pepperoni
                + "\nVeggie toppings: " + m_veggie + "\nTotal cost: $" + calcCost();
    }

    /** Check if two pizzas are equal
     * @param Object obj
     * @return string
    */
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
}

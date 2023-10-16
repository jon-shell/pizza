public class PizzaOrder {
    private Pizza[] m_order;
    private int numPizzas;

    /** PizzaOrder is a default constructor that makes an order with 1 medium cheese
     *  pizza at standard
    */
    public PizzaOrder() {
        numPizzas = 1;
        m_order = new Pizza[numPizzas];
        m_order[0] = new Pizza(); // Default to a single medium cheese pizza
    }
    /** The PizzaOrder mutator is a template to create custom orders
     * @param int numPizza
    */
    public PizzaOrder(int numPizza) {
        numPizzas = numPizza;
        m_order = new Pizza[numPizzas];
    }
    /** The addPiza method is the process to add to the current order
     * @param Pizza pizza
    */
    public int addPizza(Pizza pizza) {
        for (int i = 0; i < numPizzas; i++) {
            if (m_order[i] == null) {
                m_order[i] = pizza;
                return 1; // Successfully added the pizza
            }
        }
        return -1; // order is full
    }
    /** The calcTotoal method is the process to calculate the price of the finished order
     * @return double totalCost
    */
    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            if (m_order[i] != null) {
                totalCost += m_order[i].calcCost();
            }
        }
        return totalCost;
    }
    /** The toString method is the process of summarizing the finished order in a string
     * @return string orderSummary
    */
    public String toString() {
        double totalCost = calcTotal();
        StringBuilder orderSummary = new StringBuilder("Order Summary:\n");
        for (int i = 0; i < numPizzas; i++) {
            if (m_order[i] != null) {
                orderSummary.append("Pizza ").append(i + 1).append(":\n").append(m_order[i].toString()).append("\n\n");
            }
        }
        orderSummary.append("Total Cost: $").append(totalCost);
        return orderSummary.toString();
    }
}
public class PizzaOrder {
    private Pizza[] m_order;
    private int numPizzas;

    public PizzaOrder() {
        numPizzas = 1;
        m_order = new Pizza[numPizzas];
        m_order[0] = new Pizza(); // Default to a single medium cheese pizza
    }

    public PizzaOrder(int numPizza) {
        numPizzas = numPizza;
        m_order = new Pizza[numPizzas];
    }

    public int addPizza(Pizza pizza) {
        for (int i = 0; i < numPizzas; i++) {
            if (m_order[i] == null) {
                m_order[i] = pizza;
                return 1; // Successfully added the pizza
            }
        }
        return -1; // order is full
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            if (m_order[i] != null) {
                totalCost += m_order[i].calcCost();
            }
        }
        return totalCost;
    }

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
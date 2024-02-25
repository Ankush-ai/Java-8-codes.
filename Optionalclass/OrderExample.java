// Suppose you have a list of orders, and each order has a customer. Your task is to find the name of the customer who placed the first order in the list. The challenge is that the list or the first order might be empty.
// java
package Optionalclass;

import java.util.List;
import java.util.Optional;

public class OrderExample {
    public static class Order {
        private String customerName;

        public Order(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerName() {
            return customerName;
        }
    }

    public static void main(String args[]) {
        List<Order> orders = List.of(
                new Order("Customer 1"),
                new Order("Custoemr 2"),
                new Order(("Customer 3")));
        Optional<String> firstCustomerName = orders.stream()
                .findFirst()
                .map(Order::getCustomerName);

        System.out.println("The first custoemr is : " + firstCustomerName.orElse("Not found"));
    }

}

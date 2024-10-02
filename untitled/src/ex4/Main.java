package ex4;

import classes.Order;
import classes.Product;
import utils.Utils;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        List<Order> randomOrders = Utils.getRandomListOfOrder(200);

        String cat = Utils.getRandomCategory();

        List<Product> res =
            randomOrders
                    .stream()
                    .filter(order ->
                            order.getOrderDate().
                                    isAfter(LocalDate.of(2020, 2, 4))
                            &&
                                order.getOrderDate().
                                        isBefore(LocalDate.of(2022, 6, 4))
                    )
                    .filter(order -> order.getCustomer().getTier().equals(cat))
                    .flatMap(order -> order.getProducts().stream())
                    .toList()
        ;


        for(Product p : res) System.out.println(p);


    }
}
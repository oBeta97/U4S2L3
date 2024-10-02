package ex4;

import classes.Order;
import classes.Product;
import com.github.javafaker.Faker;
import utils.Utils;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        List<Order> randomOrders = Utils.getRandomListOfOrder(100);

        for(Order o : randomOrders) System.out.println(o);

        Faker f = new Faker();

        String tier = f.leagueOfLegends().rank();

        System.out.println(" ");
        System.out.println(" ---------------------------- TIER -------------------- ");
        System.out.println(tier);
        System.out.println(" ------------------------------------------------ ");
        System.out.println(" ");

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
                    .filter(order -> order.getCustomer().getTier().equals(tier))
                    .flatMap(order -> order.getProducts().stream())
                    .toList()
        ;


        for(Product p : res) System.out.println(p);


    }
}
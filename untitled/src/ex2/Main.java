package ex2;

import classes.Order;
import utils.Utils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Order> randomOrders = Utils.getRandomListOfOrder(10);

        System.out.println("Ordini");
        for (Order o : randomOrders) System.out.println(o);


        System.out.println(" ");


        System.out.println("Ordini con manga");
        for (Order o : randomOrders)
            if(
                o.getProducts()
                        .stream()
                        .anyMatch(product -> product.getCategory().equals("Manga"))
            )
            {
                System.out.println(o);
            }


    }
}
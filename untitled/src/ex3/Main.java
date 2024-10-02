package ex3;

import classes.Product;
import utils.Utils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        List<Product> randomProducts = Utils.getRandomProductsByCategory("TV Series",3);
        System.out.println("PRE SCONTO");
        for (Product p : randomProducts) System.out.println(p);

        randomProducts = randomProducts
                .stream()
                .map(product -> {
                    double newPrice = product.getPrice() * 0.9;
                    product.setPrice(newPrice);
                    return product;
                })
                .toList();

        System.out.println(" ");
        System.out.println("POST SCONTO");
        for (Product p : randomProducts) System.out.println(p);

    }
}
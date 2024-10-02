package ex1;

import classes.*;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Product> randomProducts = Utils.getRandomProducts(10);

        System.out.println("Lista completa");
        for (Product p : randomProducts) System.out.println(p);

        if(
            randomProducts
                .stream()
                .noneMatch(product -> product.getCategory().equals("Book"))
        )
            System.out.println("Nessun libro!");
        else {
            List<Product> booksOver100 =
                randomProducts
                        .stream()
                        .filter(p -> p.getCategory().equals("Book") && p.getPrice() > 100.0)
                        .toList()
            ;

            System.out.println("Libri che costano più di 100");
            for (Product p : booksOver100) System.out.println(p);

        }
    }
}
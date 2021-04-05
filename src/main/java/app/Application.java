package app;

import domain.bouquet.Bouquet;
import domain.flowers.Daisy;
import domain.flowers.Rose;
import domain.flowers.Sunflower;
import domain.enums.LeavesSize;

public class Application {
    public static void main(String[] args) {
        System.out.printf("-----------Welcome to the flower shop-----------");
        System.out.println();
        Daisy daisy1 = new Daisy(
                "Daisy1",
                "white",
                LeavesSize.SMALL,
                20,
                "10/04/2021",
                25,
                true);
        Daisy daisy2 = new Daisy(
                "Daisy2",
                "pink",
                LeavesSize.SMALL,
                20,
                "12/04/2021",
                30,
                true);
        Rose rose1 = new Rose(
                "Rose1",
                "red",
                LeavesSize.MIDDLE,
                70,
                "11/04/2021",
                40,
                true
        );  Rose rose2 = new Rose(
                "Rose2",
                "white",
                LeavesSize.MIDDLE,
                90,
                "11/04/2021",
                80,
                true
        );
        Sunflower sunflower1 = new Sunflower(
                "Sunflower",
                "yellow",
                LeavesSize.BIG,
                250,
                "05/04/2021",
                100,
                true
        );
        daisy1.grow();
        rose2.grow();
        sunflower1.grow();
        sunflower1.beautifulFlowers();
        Bouquet.addFlowers (daisy1);
        Bouquet.addFlowers(daisy2);
        Bouquet.addFlowers(rose1);
        Bouquet.addFlowers(rose2);
        Bouquet.addFlowers(sunflower1);
        Bouquet.createBouquet();
        Bouquet.sortByFreshness();
        Bouquet.pricesBouquet();
        Bouquet.findLengthStem(30,80);



    }
}

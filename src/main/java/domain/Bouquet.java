package domain;
import domain.interfaces.FlowersService;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class Bouquet {
    private static final List<Flowers> bouquet = new LinkedList<>();

    public Bouquet() {
    }
    public static void addFlowers(Flowers flowers) {bouquet.add(flowers);
    }

    public static void removeFlower(Flowers nameFlower) {
        bouquet.stream()
                .filter(bouquet -> bouquet.getNameFlower().equals(nameFlower))
                .findFirst()
                .ifPresent(bouquet::remove);
    }

    public static void createBouquet(){ // метод создания букета с упаковкой
        System.out.println("------------Your bouquet is created--------------");
        String packaging = "packaging";
        AtomicInteger count= new AtomicInteger();
        bouquet.stream()
                .map(bouquet -> (count.getAndIncrement()+1)+"."+ bouquet.getNameFlower()+"+"+packaging)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------");
    }

    public static void sortByFreshness () { // метод сортировки по свежести цветов
        bouquet.stream()
                .map(bouquet ->bouquet.getDateWhenRipped()+" - "+bouquet.getNameFlower())
                .sorted()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void pricesBouquet(){ //метод вычисления цены букета
        int price = bouquet.stream()
                .mapToInt(bouquet -> bouquet.getPriceFlower())
                .sum();
        System.out.println("--------------------Bouquet price-----------------");
        System.out.println("Bouquet price: "+price);
        System.out.println("--------------------------------------------------");
        }

        public static void findLengthStem (int minLengthStem,int maxLengthStem) { // метод нахождения по заданному диапазону длины стебля
            System.out.println("-----------The flower you are looking for!----------");
         bouquet.stream()
                .filter(bouquet->bouquet.getLengthStem()>minLengthStem &&
                        bouquet.getLengthStem()<maxLengthStem)
                .forEach(System.out::println);
        }

    }






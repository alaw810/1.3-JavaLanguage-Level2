package com.alaw810;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Restaurant> restaurantHashSet = new HashSet<>();

        while (true) {
            System.out.println("Choose one option from the menu:");
            System.out.println("1. Add restaurant");
            System.out.println("2. View all listed restaurants");
            System.out.println("3. Exit");

            String option = sc.nextLine();
            switch (option) {
                case "1":
                    System.out.print("Enter the restaurant name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the restaurant rating: ");
                    int rating = sc.nextInt();
                    sc.nextLine();
                    Restaurant restaurant = new Restaurant(name, rating);

                    if (!restaurantHashSet.add(restaurant)) {
                        System.out.println("This restaurant already exists");
                    } else {
                        System.out.println("Restaurant added");
                    }
                    break;

                case "2":
                    if (restaurantHashSet.isEmpty()) {
                        System.out.println("No restaurants in the list yet.");
                    } else {
                        for (Restaurant r : restaurantHashSet) {
                            System.out.println(r);
                        }
                    }
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        }

    }

}

package com.ultraLesson.objectOrientation.capstoneProject2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Runner {
        public static void main(String[] args) {
            List<ProductType> productList = new ArrayList<>();
            productList.add(new ProductType("apple", 50));
            productList.add(new ProductType("milk", 25));
            productList.add(new ProductType("news Paper", 5));

            ShoppingCart cartProduct = new ShoppingCart(productList);

            System.out.println("Enter the choice of product you wish to buy: apple / milk / paper");

            Scanner scanner = new Scanner(System.in);
            String choiceOfproduct = scanner.nextLine();

            switch (choiceOfproduct) {
                case "apple":
                    System.out.println("Please enter the numbers of KG you want to buy: ");
                    cartProduct.appleProduct();
                    break;
            case "milk":
                    System.out.println("Please enter the numbers of liters you want to buy:");
                    cartProduct.milkProduct();
                    break;
                case "News paper":
                    System.out.println("Please enter the numbers of quantity you want to buy: ");
                    cartProduct.newsPaperProduct();
                    break;

            default:
            System.out.println("Invalid Choice!");
            }
        }
    }


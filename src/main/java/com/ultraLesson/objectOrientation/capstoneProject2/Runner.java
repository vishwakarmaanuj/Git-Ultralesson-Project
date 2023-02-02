//package com.ultraLesson.objectOrientation.capstoneProject2;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//public class Runner {
//
//    public class Runner {
//        public static void main(String[] args) {
//            List<ProductType> productList = new ArrayList<>();
//            productList.add(new ProductType("Apple", 50));
//            productList.add(new ProductType("Milk", 25));
//            productList.add(new ProductType("News Paper", 5));
//
//            ShoppingCart cartProduct = new ShoppingCart(productList);
//
//            System.out.println("Enter the product you wish to buy: Apple / Milk / Paper");
//
//            Scanner scanner = new Scanner(System.in);
//            String product = scanner.nextLine();
//
//            switch (product) {
//                case "Apple":
//                    System.out.println("Please enter the numbers of KG you want to buy: ");
//                    cartProduct.productApple();
//                    break;
//            case "Milk":
//                    System.out.println("Please enter the numbers of liters you want to buy:");
//                    cartProduct.productMilk();
//                    break;
//                case "Paper":
//                    System.out.println("Please enter the numbers of quantity you want to buy: ");
//                    cartProduct.productPaper();
//                    break;
//
//            default:
//            System.out.println("Invalid Choice!");
//            }
//        }
//    }
//}

package com.ultraLesson.objectOrientation.capstoneProject2;

import java.util.List;
import java.util.Scanner;
public class ShoppingCart {

    private final List<ProductType> shoppingCart;

    public ShoppingCart(List<ProductType> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    ProductType product = new ProductType();
    E_Wallet walletAmount = new E_Wallet();
    OfferOnProduct productOffer = new OfferOnProduct();
    float amount;

    private int quantityOfProduct() {
        Scanner scanner = new Scanner(System.in);
        product.setQuantity(scanner.nextInt());
        return product.getQuantity();
    }

    public void appleProduct() {
        for (ProductType cart1 : shoppingCart) {
            if (cart1.getProduct() == "apple") {
                amount = cart1.getAmount();
                calculateAmount(quantityOfProduct());
            }
        }
    }

    public void milkProduct() {
        for (ProductType cart1 : shoppingCart) {
            if (cart1.getProduct() == "milk") {
                amount = cart1.getAmount();
                calculateAmount(quantityOfProduct());
                productOffer.offerOnMilk(product.getQuantity());
            }
        }
    }

    public void newsPaperProduct() {
        for (ProductType cart1 : shoppingCart) {
            if (cart1.getProduct() == "News Paper") {
                amount = cart1.getAmount();
                calculateAmount(quantityOfProduct());
            }
        }
    }

    private void calculateAmount(int quantity) {
        float total = quantity * amount;
        System.out.println("The amount of the product is: " + total);
        if(total >= 100) {
            walletAmount.isDiscountApplicable(total);
        }
    }
}
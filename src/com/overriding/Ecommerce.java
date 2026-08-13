package com.overriding;

class Order {

    void calculateTotal() {
        System.out.println("Calculating order total");
    }

    void applyDiscount() {
        System.out.println("Applying discount");
    }

    void calculateShippingCharge() {
        System.out.println("Calculating shipping charge");
    }

    void generateInvoice() {
        System.out.println("Generating invoice");
    }
}


// Amazon Order
class AmazonOrder extends Order {

    @Override
    void calculateTotal() {
        System.out.println("Amazon Order Total: ₹2000");
    }

    @Override
    void applyDiscount() {
        System.out.println("Amazon Discount: 20%");
    }

    @Override
    void calculateShippingCharge() {
        System.out.println("Amazon Shipping Charge: ₹50");
    }

    @Override
    void generateInvoice() {
        System.out.println("Amazon Invoice Generated");
    }
}


// Flipkart Order
class FlipkartOrder extends Order {

    @Override
    void calculateTotal() {
        System.out.println("Flipkart Order Total: ₹1800");
    }

    @Override
    void applyDiscount() {
        System.out.println("Flipkart Discount: 15%");
    }

    @Override
    void calculateShippingCharge() {
        System.out.println("Flipkart Shipping Charge: ₹40");
    }

    @Override
    void generateInvoice() {
        System.out.println("Flipkart Invoice Generated");
    }
}


// Local Store Order
class LocalStoreOrder extends Order {

    @Override
    void calculateTotal() {
        System.out.println("Local Store Order Total: ₹1500");
    }

    @Override
    void applyDiscount() {
        System.out.println("Local Store Discount: 5%");
    }

    @Override
    void calculateShippingCharge() {
        System.out.println("Local Store Shipping Charge: ₹30");
    }

    @Override
    void generateInvoice() {
        System.out.println("Local Store Invoice Generated");
    }
}


// Main
public class Ecommerce {

    public static void main(String[] args) {

        AmazonOrder amazon = new AmazonOrder();

        amazon.calculateTotal();
        amazon.applyDiscount();
        amazon.calculateShippingCharge();
        amazon.generateInvoice();

        System.out.println();

        FlipkartOrder flipkart = new FlipkartOrder();

        flipkart.calculateTotal();
        flipkart.applyDiscount();
        flipkart.calculateShippingCharge();
        flipkart.generateInvoice();

        System.out.println();

        LocalStoreOrder local = new LocalStoreOrder();

        local.calculateTotal();
        local.applyDiscount();
        local.calculateShippingCharge();
        local.generateInvoice();
    }
}

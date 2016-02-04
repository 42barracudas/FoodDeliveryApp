package com.company;

import com.company.model.Client;
import com.company.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Banana", 2.28));
        products.add(new Product("Pizza", 7.62));
        products.add(new Product("Sushi", 7.28));
        products.add(new Product("Something", 7.88));
        products.add(new Product("Apple", 4.48));
        DemoDatabase.getInstance().setProducts(products);
        DemoDatabase.getInstance().printAllProducts();




        Client client1 = new Client();
        Client client2 = new Client();
        client1.setName("nameE");
        client2.setName("nameee2");

        DemoDatabase.getInstance().addClient(client1);
        DemoDatabase.getInstance().addClient(client1);
        DemoDatabase.getInstance().addClient(client2);
        DemoDatabase.getInstance().addClient(client2);

        DemoDatabase.getInstance().printAllClients();

	// write your code here
        //system for food delivery
//1. look
//2. book
//3. approve
// use singleton
    }
}

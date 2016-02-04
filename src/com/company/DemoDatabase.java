package com.company;

import com.company.model.Client;
import com.company.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitaliy on 2/3/2016.
 */
public class DemoDatabase {
    private static DemoDatabase instance;
    private List<Product> products;

    private List<Client> clientList;

    public void addClient(Client client) {
        if (clientList == null) {
            clientList = new ArrayList<>();
        }
        if (clientList.isEmpty()) {
            client.setClientID(0);
        } else
            client.setClientID(getMaximumClientID(clientList) + 1);
        clientList.add(client);
    }

    private int getMaximumClientID(List<Client> clientList) {
        int max = clientList.get(0).getClientID();
        for (int i = 1; i < clientList.size(); i++) {
            if (clientList.get(i).getClientID() > max) {
                max = clientList.get(i).getClientID();
            }
        }
        return max;
    }

    public static DemoDatabase getInstance() {
        if (instance == null) {
            instance = new DemoDatabase();
        }
        return instance;
    }

    public void showProducts() {
        printAllProducts();
    }

    public void printAllProducts() {
        for (Product item : products) {
            System.out.println(item.toString());

        }
    }

    public void printAllClients() {
        for (Client item : clientList) {
            System.out.println(item.toString());

        }

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

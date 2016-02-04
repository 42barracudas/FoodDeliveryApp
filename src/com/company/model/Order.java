package com.company.model;

/**
 * Created by Vitaliy on 2/4/2016.
 */
public class Order {
    private Client client;
    private Product product;
    private int id;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

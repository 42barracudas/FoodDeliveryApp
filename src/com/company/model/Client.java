package com.company.model;

/**
 * Created by Vitaliy on 2/4/2016.
 */
public class Client {
    private String name;
    private int clientID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientID=" + clientID +
                '}';
    }
}

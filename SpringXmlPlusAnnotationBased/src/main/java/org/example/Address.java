package org.example;
public class Address {
    private String City;
    private String State;

    public Address() {
    }

    public Address(String city, String state) {
        City = city;
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}

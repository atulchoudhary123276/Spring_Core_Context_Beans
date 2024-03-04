package org.example;
public class Address {
    private String City;
    private String State;

    public Address() {
    }

    public Address(String city, String state) {
        this.City = city;
        this.State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}

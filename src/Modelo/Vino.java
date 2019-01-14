/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 */
public class Vino implements Comparable<Vino>{
    private String country,description,title;
    private long price;


    public Vino(long price, String country, String description, String title) {
        this.price = price;
        this.country = country;
        this.description = description;
        this.title = title;
    }


    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Vino aLong) {
        return this.getTitle().compareTo(aLong.getTitle());
    }
}

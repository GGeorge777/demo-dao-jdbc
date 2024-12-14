package app;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1,"Books");

        Seller seller = new Seller(21, "Maik", "mail@gmail.com", new Date(),4000.0, obj);


    }
}
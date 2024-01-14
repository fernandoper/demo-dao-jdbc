package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import db.DB;
import db.DbIntegrityException;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob","bob@gmail.com", new Date(), 3000.00, obj);

        System.out.println(seller);

    }
}
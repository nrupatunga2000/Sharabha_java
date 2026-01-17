package com.persivex;
import java.sql.Connection;
public class Book_table {
    public static void Create_book_table(Connection conn){
        try(Statement stmt = conn.createStatement()) {
    //creating the table book;
    String createTableQuery = "create table if not exists book("
    + "t_id int primary key auto_increment,"
    +"b_name varchar(50),"
    + "b_author varchar(50))";

        } catch (Exception e) {
        }
    }
}

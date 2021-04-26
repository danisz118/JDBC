package com.itvdn.jdbcandhibernate.ex003_result_set;

import java.sql.*;
import java.util.List;


public class Main {



    public static void main(String[] args) {
        DBWorker worker = new DBWorker();
        List<Client> clients = worker.getAllClients();

        for (Client client : clients) {
            System.out.println(client.getId() + " " + client.getName() + " " + client.getAge() + " " + client.getPhone());
        }

    }

}

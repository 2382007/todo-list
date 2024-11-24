module TodoApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires java.desktop;

    opens todoapp;
    opens todoapp.entities;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.views;
    opens todoapp.config;
}
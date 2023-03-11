package lesson_mysql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class Sql {
    private static String URL = "jdbc:mysql://localhost:3306/tms";
    private static String LOGIN = "root";
    private static String PASSWORD = "rootroot";
    private static final Logger logger = LogManager.getLogger(Main.class);

    private static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            logger.info("С IDEA установленно успешно");
        } catch (Exception ex) {
            System.out.println("Соединение не установленно");
            logger.error(ex);
        }
        return DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }

    void initConnection() throws SQLException {
        getConnection();
        createTables();
        createTables2();
        insertValuesIntoTableAuthor();
        insertValuesIntoTableBook();
        displayBookPages();
        displayAuthorAndBooksWherePagesMore300();
    }

    private static void createTables() {
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String str = "CREATE TABLE author (id INT PRIMARY KEY , name TEXT(10), surname TEXT(10))";
            statement.executeUpdate(str);
            connection.commit();
            statement.close();
            connection.close();
        } catch (SQLException | RuntimeException e) {
            System.err.println(e);
            logger.error(e);
        }
    }

    private static void createTables2() {
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String str2 = "CREATE TABLE book(id INT PRIMARY KEY, title TEXT(10),author_id INT, pages INT)";
            statement.executeUpdate(str2);
            connection.commit();
            statement.close();
            connection.close();
        } catch (SQLException | RuntimeException e) {
            System.err.println(e);
            logger.error(e);
        }
    }

    private static void insertValuesIntoTableAuthor() {
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String s = "INSERT INTO author (id, name ,surname) VALUES (1,'Сергей','Есенин')," +
                    "(2,'Владимир','Высоцкий')," +
                    "(3,'Александр','Пушкин')";
            statement.executeUpdate(s);
            connection.commit();
            statement.close();
            connection.close();
        } catch (SQLException | RuntimeException e) {
            System.err.println(e);
            logger.error(e);

        }
    }

    private static void insertValuesIntoTableBook() {
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String s = "INSERT INTO book (id, title, author_id, pages) VALUES (1,'Письмо к женщине',1,100)," +
                    "(2,'Роман о девочках',2,132)," +
                    "(3,'Зимнее утро',3,245)";
            statement.executeUpdate(s);
            connection.commit();
            statement.close();
            connection.close();
        } catch (SQLException | RuntimeException e) {
            System.err.println(e);
            logger.error(e);
        }
    }

    private static void displayBookPages() {
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("select title AS Book, pages AS Pages from book\n" +
                    "where pages > 100");
            while (rs.next()) {
                String str = rs.getString("Book") + " " + rs.getString("Pages");
                System.out.println(str);
            }
            connection.close();
            stm.close();
            rs.close();
        } catch (SQLException | RuntimeException e) {
            System.err.println(e);
            logger.error(e);
        }
    }

    private static void displayAuthorAndBooksWherePagesMore300() {
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("select a1.name AS Author, a1.surname, a2.title AS Book from author a1\n" +
                    "join book a2 on a1.id = a2.author_id\n" +
                    "where a2.pages > 100");
            while (rs.next()) {
                String str = rs.getString("Author") + " " + rs.getString("surname") + " " + rs.getString("Book");
                System.out.println(str);
            }
            connection.close();
            stm.close();
            rs.close();
        } catch (SQLException | RuntimeException e) {
            System.err.println(e);
            logger.error(e);
        }
    }
}

package lesson_mysql;
/*
...Написать скрипт по созданию 2 таблиц: author(id,name,surname), book(id, title, authod_id, pages).
Заполнить таблицы данными(через скрипт)
Вывести данные о всех авторах и его книгах(использовать join).
Вывести все книги, где количество страниц больше 300.

Доп.задание (со *)
Вывести авторов у которых есть хотя бы 1 книги, где количество страниц больше 300.

сделать это в отдельном файле и также залить на гит через пул реквест
 */

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Sql sql = new Sql();
        sql.initConnection();

    }
}

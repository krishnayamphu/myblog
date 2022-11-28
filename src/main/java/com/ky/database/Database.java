package com.ky.database;

import com.ky.database.autotables.CategoryTable;
import com.ky.database.autotables.UserTable;

public class Database {
    public static void run(){
        UserTable.create();
        CategoryTable.create();
    }

    public static void destroy(){
        UserTable.remove();
        CategoryTable.remove();
    }
}

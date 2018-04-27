package com.example.jguzikowski.aidlproductservice.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by j.guzikowski on 9/20/17.
 */

public class ProductContract {

    /* Add content provider constants to the Contract
     Clients need to know how to access the task data, and it's your job to provide
     these content URI's for the path to that data:
        1) Content authority,
        2) Base content URI,
        3) Path(s) to the tasks directory
        4) Content URI for data in the TaskEntry class
      */

        // The authority, which is how your code knows which Content Provider to access
        public static final String AUTHORITY = "com.example.jguzikowski.aidlproductservice";

        // The base content URI = "content://" + <authority>
        public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

        // Define the possible paths for accessing data in this contract
        // This is the path for the "tasks" directory
        public static final String PATH_PRODUCTS = "products";

        /* TaskEntry is an inner class that defines the contents of the task table */
        public static final class ProductsEntry implements BaseColumns {

            // TaskEntry content URI = base content URI + path
            public static final Uri CONTENT_URI =
                    BASE_CONTENT_URI.buildUpon().appendPath(PATH_PRODUCTS).build();


            // Task table and column names
            public static final String TABLE_NAME = "products";

            // Since TaskEntry implements the interface "BaseColumns", it has an automatically produced
            // "_ID" column in addition to the two below
            public static final String COLUMN_NAME = "name";
            public static final String COLUMN_PRICE = "price";
            public static final String COLUMN_COUNTRY = "country";
            public static final String COLUMN_DELIVERY = "delivery";



        }
    }


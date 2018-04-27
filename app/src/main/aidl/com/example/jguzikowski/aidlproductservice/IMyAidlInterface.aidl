// IMyAidlInterface.aidl
package com.example.jguzikowski.aidlproductservice;

// Declare any non-default types here with import statements
import com.example.jguzikowski.aidlproductservice.Product;
interface IMyAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */

    //void addProduct(in Product p, Callback c);
    void addProduct(in Product p);
  oneway void deleteProduct(in long id);
  List<Product> getAllProduct();
}

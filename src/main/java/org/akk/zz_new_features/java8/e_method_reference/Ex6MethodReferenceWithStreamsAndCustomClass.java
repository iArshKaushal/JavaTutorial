package org.akk.zz_new_features.java8.e_method_reference;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

///  Example 3: Function in Stream with custom class
///
class Product {
    String productName;

    Product(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return "Product: " + productName;
    }
}


public class Ex6MethodReferenceWithStreamsAndCustomClass {
    public static void main(String[] args) {

        // Creating List
        List<Product> products = List.of(
                new Product("LG 32 inch 8K Monitor"),
                new Product("Macbook Pro Ma"),
                new Product("Electric Computer Table")
        );

        ///  Approach 1 - Method Reference
        List<String> list = products.stream()
                .map(Product::getProductName)
                .toList();

        // Printing
        System.out.println(list);


        ///  Approach 2 - Lambda
        Stream<String> stringStream = products.stream()
                .map((Product p) -> p.getProductName());

        // Printing
        stringStream.forEach(System.out::println);


    }
}



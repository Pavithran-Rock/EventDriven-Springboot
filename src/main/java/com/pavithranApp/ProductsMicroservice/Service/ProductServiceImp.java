package com.pavithranApp.ProductsMicroservice.Service;

import com.pavithranApp.ProductsMicroservice.Models.CreateProductRestModel;
import org.springframework.stereotype.Service;
//So this service annotation, it will mark this class as a special spring component, indicating that
//this class contains business logic.
//It will also allow Spring Framework to discover this class at the time when our application starts up.
//Create a new instance of this class and add it to Spring Application Context.
//And once the object of this class is in spring application context, we can use spring Dependency injection
//and inject it into other classes.
@Service
public class ProductServiceImp implements ProductService{
//Now the business logic that we will write in the create product method will persist product details
//
//into a database and then will publish product created event into Kafka topic.
//
//And if all is good, this method will return product id as return value.
    @Override
    public String createProduct(CreateProductRestModel productRestModel) {
        return "";
    }
}

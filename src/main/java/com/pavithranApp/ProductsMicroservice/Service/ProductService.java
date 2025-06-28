package com.pavithranApp.ProductsMicroservice.Service;

import com.pavithranApp.ProductsMicroservice.Models.CreateProductRestModel;

public interface ProductService {
    String createProduct(CreateProductRestModel productRestModel);
}

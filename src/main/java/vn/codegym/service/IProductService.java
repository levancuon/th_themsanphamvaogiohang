package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.Optional;

/*TODO: Bước 4: Xây dựng package service
        - Interface IProductService*/

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}
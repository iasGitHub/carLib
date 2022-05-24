package sn.simplon.carlib.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.carlib.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}

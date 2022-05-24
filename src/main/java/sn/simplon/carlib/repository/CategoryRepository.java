package sn.simplon.carlib.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.carlib.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}

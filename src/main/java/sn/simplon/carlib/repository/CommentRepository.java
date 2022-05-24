package sn.simplon.carlib.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.carlib.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {

}

package spring.homework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.CrudRepository;
import spring.homework.domain.Comment;

public interface CommentDao extends ReactiveMongoRepository<Comment,String> {
    void deleteByBookId(String id);
}

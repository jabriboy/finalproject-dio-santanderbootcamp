package dio.bootcamp.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.bootcamp.finalproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
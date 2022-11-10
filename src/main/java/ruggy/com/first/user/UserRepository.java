package ruggy.com.first.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ruggy.com.first.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}

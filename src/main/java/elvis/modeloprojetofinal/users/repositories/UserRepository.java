package elvis.modeloprojetofinal.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import elvis.modeloprojetofinal.users.entities.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     List<User> findByEmailLikeIgnoreCase(String email);
     List<User> findByNameLikeIgnoreCase(String name);
}

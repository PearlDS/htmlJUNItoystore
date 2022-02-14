package applicationpackage.repositories;


import applicationpackage.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findUserByUserNameAndPassWord(String userName, String passWord);



}

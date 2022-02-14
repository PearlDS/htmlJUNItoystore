package applicationpackage.services;

import applicationpackage.data.User;
import applicationpackage.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user){
        System.out.println(user);
        userRepository.save(user);
    }

    public User getUserByPassWordAndUserName(String userName, String passWord){
        return userRepository.findUserByUserNameAndPassWord(userName,passWord);
    }


}

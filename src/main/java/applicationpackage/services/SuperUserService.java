package applicationpackage.services;

import applicationpackage.data.SuperUser;
import applicationpackage.repositories.SuperUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperUserService {

    @Autowired
    private SuperUserRepository superUserRepository;


    public SuperUser createSuperUser(SuperUser superUser){
        return superUserRepository.save(superUser);
    }

}

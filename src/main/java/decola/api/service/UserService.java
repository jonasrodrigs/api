package decola.api.service;

import decola.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserInfo() {
        // Retornando as informaçoes
        return new User("Jonas Rodrigues Desenvolvedor full stack", "mexylemphotos@gmail.com", 28,  "Programador Java, Spring Boot, Angular");
    }
}

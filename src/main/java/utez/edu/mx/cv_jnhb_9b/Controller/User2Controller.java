package utez.edu.mx.cv_jnhb_9b.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user1")
@CrossOrigin("*")
public class User2Controller {
    @GetMapping("")
    public  String getMessage(){
        return "Hola desde el controlador 2";
    }
}

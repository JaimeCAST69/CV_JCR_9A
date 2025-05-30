package utez.edu.mx.cv_jcr_9a;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user2")
@CrossOrigin
public class User2Controller {
    @GetMapping("")
    public String hello() { return "Hola desde User2Controller!"; }
}

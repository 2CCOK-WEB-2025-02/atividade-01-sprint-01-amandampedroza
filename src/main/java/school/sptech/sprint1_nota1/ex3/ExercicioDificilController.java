package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {

        ExercicioDificilResponse teste = new ExercicioDificilResponse(0, 0);

        teste.setEnesimoTermo(n);
        teste.setSoma(n);
        return teste;
    }
}

package future.project.future.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class LoginController {
    
    // private Usuario ur;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // @GetMapping("/cadastroUsuario") //Essa parte aqui vai ser so para adm dentro da pagina
    // public String cadastro() {
    //     return "cadastro";
    // }

    // @RequestMapping(value="/cadastroUsuario", method=RequestMethod.GET)
    // public String cadastroUsuario(@Valid Usuario usuario, BindingResult result) {

    //     if(result.hasErrors()){
    //         return "redirect:/cadastroUsuario";
    //     }
    //     return "";
    // }
    
}

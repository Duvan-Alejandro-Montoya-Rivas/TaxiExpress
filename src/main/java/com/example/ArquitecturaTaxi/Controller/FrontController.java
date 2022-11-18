package com.example.ArquitecturaTaxi.Controller;

import com.example.ArquitecturaTaxi.Model.Cliente;
import com.example.ArquitecturaTaxi.Service.ServiceCliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FrontController {
    private ServiceCliente serviciocliente;
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("Cliente", new Cliente());
        return "Registro";
    }

}

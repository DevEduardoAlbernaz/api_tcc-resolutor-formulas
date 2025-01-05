package com.edu.formulas.controllers;

import com.edu.formulas.Services.TrigonometriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/trigonometria")
public class TrigonometriaController {
    @Autowired
    private TrigonometriaServices trigonometriaService;
    @GetMapping("/hipotenusa")
    public Double calcularHipotenusa(@RequestParam String sintax) {
        return trigonometriaService.hipotenusa(sintax);
    }
    @GetMapping("/hipotenusa/passoapasso")
    public String mostrarHipotenusa(@RequestParam String sintax) {
        return trigonometriaService.papHipotenusa(sintax);
    }
}

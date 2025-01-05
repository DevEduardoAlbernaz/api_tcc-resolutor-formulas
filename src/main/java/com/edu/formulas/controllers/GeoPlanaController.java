package com.edu.formulas.controllers;

import com.edu.formulas.Services.GeoPlanaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/geometriaPlana")
public class GeoPlanaController {
    @Autowired
    private GeoPlanaServices servicesPlana;
    @GetMapping("/quadrado/area")
    public Double calcularAreaQuadrado(@RequestParam String sintax) {
        return servicesPlana.areaQuadrado(sintax);
    }
    @GetMapping("/quadrado/area/passoapasso")
    public String mostrarPapQuadrado(@RequestParam String sintax) {
        return servicesPlana.papQuadrado(sintax);
    }
    @GetMapping("/circulo/area")
    public double calcularAreaCirculo(@RequestParam String sintax) {
        return servicesPlana.areaCirculo(sintax);
    }
    @GetMapping("/circulo/area/passoapasso")
    public String mostrarPapCirculo(@RequestParam String sintax) {
        return servicesPlana.papCirculo(sintax);
    }
    @GetMapping("/trapezio/area")
    public double calcularAreaTrapezio(@RequestParam String sintax) {
        return servicesPlana.areaTrapezio(sintax);
    }
    @GetMapping("/trapezio/area/passoapasso")
    public String mostrarPapCirculoTrapezio(@RequestParam String sintax) {
        return servicesPlana.papTrapezio(sintax);
    }
    @GetMapping("/triangulo/area")
    public double calcularAreaTriangulo(@RequestParam String sintax) {
        return servicesPlana.areaTriangulo(sintax);
    }
    @GetMapping("/triangulo/area/passoapasso")
    public String mostrarAreaTriangulo(@RequestParam String sintax) {
        return servicesPlana.papTriangulo(sintax);
    }
    @GetMapping("/paralelepipedo/area")
    public double calcularAreaParalelepipedoRetangular(@RequestParam String sintax) {
        return servicesPlana.areaParalelepipedoRetangular(sintax);
    }
    @GetMapping("/paralelepipedo/area/passoapasso")
    public String mostrarAreaParalelepipedo(@RequestParam String sintax) {
        return servicesPlana.papParalelepipedoRetangular(sintax);
    }
}

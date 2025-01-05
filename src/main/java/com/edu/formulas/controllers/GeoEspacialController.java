package com.edu.formulas.controllers;

import com.edu.formulas.model.Formulas;
import com.edu.formulas.repository.FormulasRepository;
import com.edu.formulas.dto.FormulasRequestDTO;
import com.edu.formulas.Services.GeoEspacialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/geometriaEspacial")
public class GeoEspacialController {
    @Autowired
private GeoEspacialServices espacialServices;
    @Autowired
    private FormulasRepository repository;
    double pi = 3.14;
    @GetMapping("/cilindro/volume")
    public double calcularVolumeCilindro(@RequestParam String sintax) {
        return espacialServices.volumeCilindro(sintax);
    }

    @GetMapping("/cilindro/volume/passoapasso")
    public String papVolumeCilindro(@RequestParam String sintax) {
        return espacialServices.papVolumeCilindro(sintax);
    }

    @GetMapping("/paralelepipedoRetangular/volume")
    public double calcularVolumeRetangulo(@RequestParam String sintax) {
        return espacialServices.volumeRetangulo(sintax);
    }

    @GetMapping("/paralelepipedoRetangular/volume/passoapasso")
    public String mostrarVolumeRetangulo(@RequestParam String sintax) {
        return espacialServices.papVolumeRetangulo(sintax);
    }

    @GetMapping("/cubo/volume")
    public double calcularVolumeCubo(@RequestParam String sintax) {
        return espacialServices.volumeCubo(sintax);
    }

    @GetMapping("/cubo/volume/passoapasso")
    public String mostrarVolumeCubo(@RequestParam String sintax) {
        return espacialServices.papVolumeCubo(sintax);
    }

    @GetMapping("/esfera/volume")
    public double calcularVolumeEsfera(@RequestParam String sintax) {
        return espacialServices.volumeEsfera(sintax);
    }

    @GetMapping("/esfera/volume/passoapasso")
    public String mostrarVolumeEsfera(@RequestParam String sintax) {
        return espacialServices.papVolumeEsfera(sintax);
    }
 @PostMapping
    public void saveFormula(@RequestBody FormulasRequestDTO data){
    Formulas formData = new Formulas(data);
    repository.save(formData);
    return;
}
}

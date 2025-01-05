package com.edu.formulas.Services;
import com.edu.formulas.dto.FormulasRequestDTO;
import com.edu.formulas.model.Formulas;
import com.edu.formulas.repository.FormulasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class GeoPlanaServices {
    @Autowired
    private FormulasRepository repository;
    double pi = 3.14;
    public double areaQuadrado(String sintax) {
        String ladoT = sintax.replaceAll("[^0-9]", "");
       double  lado = Double.parseDouble(ladoT);
        double a = lado * lado;
        String pap = "A = "+lado+"² \n"+
                "A = "+lado+" × "+lado +
                "\nA = "+a;

        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Área do Quadrado", sintax, pap, a);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return a;

    }

    public String papQuadrado(String sintax){
    String ladoT = sintax.replaceAll("[^0-9]", "");
    double  lado = Double.parseDouble(ladoT);
    double a = lado * lado;
    String pap = "A = "+lado+"² \n"+
            "A = "+lado+" × "+lado +
            "\nA = "+a;
    return  pap;
    }

    public double areaCirculo(String sintax) {
        String raioT = sintax.replaceAll("[^0-9]", "");
        double raio = Double.parseDouble(raioT);
        double resRaio = Math.pow(raio, 2);
        double a = pi * resRaio;
        String pap= "A = "+pi+" × "+raio+"²\n"
                +"A = "+pi+" × "+raio+" × "+raio+"\n"
                +"A = "+pi+" × "+ resRaio+"\n"
                +"A = "+ a;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Área do Circulo", sintax, pap, a);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return a;
    }

    public String papCirculo(String sintax){
            String raioT = sintax.replaceAll("[^0-9]", "");
            double raio = Double.parseDouble(raioT);
            double resRaio = Math.pow(raio, 2);
            double a = pi * resRaio;
            String pap= "A = "+pi+" × "+raio+"²\n"
                    +"A = "+pi+" × "+raio+" × "+raio+"\n"
                    +"A = "+pi+" × "+ resRaio+"\n"
                    +"A = "+ a;
            return pap;
        }

    public double areaTrapezio(String sintax) {
        //encontrar os numeros na sintax
        double[] numeros = new double[3]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 3) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double bMaior = numeros[0];
        double bMenor = numeros[1];
        double alt = numeros[2];
        //calcular
        double bB = bMaior + bMenor;
        double az = bB * alt;
        double a = bB * alt / 2;
        String pap = "A = ("+bMaior+" + "+bMenor+") × "+ alt+" ÷ 2\n"
                +" A = "+bB+" × "+ alt+" ÷ 2\n"
                +" A = "+bB+" × "+ alt+" ÷ 2\n"
                +" A = "+az+" ÷ 2\n"
                +" A = "+a;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Área do Trapezio", sintax, pap, a);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return a;
    }
    public String papTrapezio(String sintax){
        //encontrar os numeros na sintax
        double[] numeros = new double[3]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 3) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double bMaior = numeros[0];
        double bMenor = numeros[1];
        double alt = numeros[2];
        //calcular
        double bB = bMaior + bMenor;
        double az = bB * alt;
        double a = az / 2;
        String pap = "A = ("+bMaior+" + "+bMenor+") × "+ alt+" ÷ 2\n"
                +" A = "+bB+" × "+ alt+" ÷ 2\n"
                +" A = "+bB+" × "+ alt+" ÷ 2\n"
                +" A = "+az+" ÷ 2\n"
                +" A = "+a;
        return pap;
    }

    public double areaTriangulo(String sintax) {
        //encontrar os numeros na sintax
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 2) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double base = numeros[0];
        double alt = numeros[1];
        double a = (base * alt) / 2;
        double ba = base * alt;

        String pap = "A = "+base+" × "+alt+" ÷ 2\n"
                +"A = "+ba+" ÷ 2\n"+
                "A = "+a;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Área do Triangulo", sintax, pap, a);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return a;
    }

    public String papTriangulo(String sintax){
        //encontrar os numeros na sintax
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 2) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double base = numeros[0];
        double alt = numeros[1];
        double ba = base * alt;
        double a = ba / 2;
        String pap = "A = "+base+" × "+alt+" ÷ 2\n"
                +"A = "+ba+" ÷ 2\n"+
                "A = "+a;
        return pap;
    }

    public double areaParalelepipedoRetangular(String sintax) {
        //encontrar os numeros na sintax
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 2) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double base = numeros[0];
        double alt = numeros[1];
        //calcular
        double a = base * alt;
        String pap="A = "+base +" × "+alt +"\n"
                + "A = "+a;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Área do Triangulo", sintax, pap, a);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return a;
    }
    public String papParalelepipedoRetangular(String sintax){
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 2) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double base = numeros[0];
        double alt = numeros[1];
        //calcular
        double a = base * alt;
        String pap="A = "+base +" × "+alt +"\n"
                + "A = "+a;
        return pap;
    }
}

package com.edu.formulas.Services;

import com.edu.formulas.dto.FormulasRequestDTO;
import com.edu.formulas.model.Formulas;
import com.edu.formulas.repository.FormulasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Service
public class GeoEspacialServices {
    double pi = 3.14;
    @Autowired
    private FormulasRepository repository;

    public double volumeCilindro(String sintax){
        if (repository == null) {
            throw new RuntimeException("Repository não foi injetado corretamente");
        }
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 2) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }

        double raio = numeros[0];
        double alt = numeros[1];
        double rQ = Math.pow(raio, 2);
        double pRq= pi * rQ;
        double v = pi * rQ * alt ;
        String vFormatado = String.format("%.2f", v);

        String pap ="V = "+pi+" × " +raio+"² × "+ alt+"\n"
                +"V = "+pi+" × ("+raio+" × "+raio+") × "+ alt+"\n"
                +"V = "+pi+" × "+rQ+" × "+ alt+"\n"
                +"V = "+pRq+" × "+ alt+"\n"
                +"V = "+vFormatado;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Volume do Cilindro", sintax, pap, v);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return v;
    }

    public String papVolumeCilindro(String sintax){
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 2) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        double raio = numeros[0];
        double alt = numeros[1];
        double rQ = Math.pow(raio, 2);
        double pRq= pi * rQ;
        double v = pRq * alt ;
        String vFormatado = String.format("%.2f", v);

        String pap ="V = "+pi+" × " +raio+"² × "+ alt+"\n"
                +"V = "+pi+" × ("+raio+" × "+raio+") × "+ alt+"\n"
                +"V = "+pi+" × "+rQ+" × "+ alt+"\n"
                +"V = "+pRq+" × "+ alt+"\n"
                +"V = "+vFormatado;

        return pap;
    }

    public double volumeRetangulo(String sintax){
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
        double a = numeros[0];
        double b = numeros[1];
        double c = numeros[2];
        double v = a * b * c ;
        double ab= a * b;
        String pap = "V = "+a+" × "+b+" × "+c+"\n"
                +"V = "+ab+" × "+c+"\n"
                +"V = "+v;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Volume do Paralelepipedo", sintax, pap, v);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        System.out.println(formula);
        return v;
    }

    public String papVolumeRetangulo(String sintax){
        double[] numeros = new double[3]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 3) {
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double a = numeros[0];
        double b = numeros[1];
        double c = numeros[2];
        double ab= a * b;
        double v = ab * c ;
        String pap = "V = "+a+" × "+b+" × "+c+"\n"
                +"V = "+ab+" × "+c+"\n"
                +"V = "+v;
        return pap;

    }

    public double volumeCubo(String sintax){
        double[] numeros = new double[1]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 1) {
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        double l = numeros[0];
        double v = Math.pow(l, 3);
        String vFormatado = String.format("%.2f", v);
        String pap = "V = "+l+"³\n"
                +"V = "+l+" × "+l+" × "+l+"\n"
                +"V = "+vFormatado;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Volume do Cubo", sintax, pap, v);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return v;
    }

    public String papVolumeCubo(String sintax){
        double[] numeros = new double[1]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 1) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double l = numeros[0];
        double v = Math.pow(l, 3);
        String vFormatado = String.format("%.2f", v);
        String pap = "V = "+l+"³\n"
                +"V = "+l+" × "+l+" × "+l+"\n"
                +"V = "+vFormatado;
        return pap;
    }

    public double volumeEsfera(String sintax){
        double[] numeros = new double[1]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 1) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double r = numeros[0];
        double rCubo= Math.pow(r, 3);
        double v =(pi*rCubo*4)/3 ;
        double piRcubo = pi*rCubo;
        double piRcuboF= piRcubo*4;
        String vFormatado = String.format("%.2f", v);

        String pap = "V = "+pi+" × "+r+"³ × 4 ÷ 3 \n"
                +"V = "+pi+"  ×  ("+r+" × "+r+" × "+r+") × 4 ÷ 3 \n"
                +"V = "+pi+" × "+ rCubo+" × 4 ÷ 3 \n"
                +"V = "+piRcubo+" × 4 ÷ 3 \n"
                +"V = "+piRcuboF+" ÷ 3 \n"
                +"V = "+vFormatado;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Volume da Esfera", sintax, pap, v);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return v;
    }

    public String papVolumeEsfera(String sintax){
        double[] numeros = new double[1]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 1) {
            // Armazena cada número encontrado no array
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        // pegar do array
        double r = numeros[0];
        double rCubo= Math.pow(r, 3);
        double piRcubo = pi*rCubo;
        double piRcuboF= piRcubo*4;
        double v = piRcuboF/3 ;
        String vFormatado = String.format("%.2f", v);

        String pap = "V = "+pi+" × "+r+"³ × 4 ÷ 3 \n"
                +"V = "+pi+"  ×  ("+r+" × "+r+" × "+r+") × 4 ÷ 3 \n"
                +"V = "+pi+" × "+ rCubo+" × 4 ÷ 3 \n"
                +"V = "+piRcubo+" × 4 ÷ 3 \n"
                +"V = "+piRcuboF+" ÷ 3 \n"
                +"V = "+vFormatado;
        return pap;
    }
}

package com.edu.formulas.Services;

import com.edu.formulas.dto.FormulasRequestDTO;
import com.edu.formulas.model.Formulas;
import com.edu.formulas.repository.FormulasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class TrigonometriaServices {
    @Autowired
    private FormulasRepository repository;
    public double hipotenusa(String sintax){
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 3) {
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        double catetoUm = numeros[0];
        double catetoDois = numeros[1];
        double multiCatateto1 = catetoUm * catetoUm;
        double multiCatateto2 = catetoDois * catetoDois;
        double extrairRaiz = (catetoUm * catetoUm)+(catetoDois * catetoDois);
        double h = Math.sqrt(extrairRaiz);

        String hFormatado = String.format("%.2f", h);
        String pap = " H² = "+catetoUm+"² + "+ catetoDois+"² \n"
                +" H² = ("+catetoUm+" × "+catetoUm+ ") + ("+ catetoDois+" × "+catetoDois+") \n"+
                " H² = "+ multiCatateto1 +" + "+ multiCatateto2 +" \n"
                +"√H = √"+ extrairRaiz+"\n"
                +" H² = "+ hFormatado;
        FormulasRequestDTO formulaDTO = new FormulasRequestDTO("Hipotenusa", sintax, pap, h);
        Formulas formula = new Formulas(formulaDTO);
        repository.save(formula);
        return h;
    }

    public String papHipotenusa(String sintax){
        double[] numeros = new double[2]; // Assumimos que há exatamente 3 números na string
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(sintax);
        int index = 0;
        while (matcher.find() && index < 3) {
            numeros[index] = Double.parseDouble(matcher.group());
            index++;
        }
        double catetoUm = numeros[0];
        double catetoDois = numeros[1];
        double multiCatateto1 = catetoUm * catetoUm;
        double multiCatateto2 = catetoDois * catetoDois;
        double extrairRaiz = multiCatateto1+multiCatateto2;
        double h = Math.sqrt(extrairRaiz);
       String hFormatado = String.format("%.2f", h);
        String pap = " H² = "+catetoUm+"² + "+ catetoDois+"² \n"
                +" H² = ("+catetoUm+" × "+catetoUm+ ") + ("+ catetoDois+" × "+catetoDois+") \n"+
                " H² = "+ multiCatateto1 +" + "+ multiCatateto2 +" \n"
                +"√H = √"+ extrairRaiz+"\n"
                +" H² = "+ hFormatado;
        return pap;
    }

}

package com.project.AutoSpareService.Models;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class AutoDAO {
    private List<Auto> autos;

    {
        autos = new ArrayList<>();
        autos.add(new Auto(1,"Toyota","model1"));
        autos.add(new Auto(2,"brand2", "model2"));
        autos.add(new Auto(3,"brand3", "model3"));
    }
    public List<Auto> auto(){
        return autos;
    }

    public Auto showAuto(int id){
        return  autos.stream().filter(auto ->auto.getId() == id).findAny().orElse(null);
    }
}

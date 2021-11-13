/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sales.controlador;

import com.sales.modelo.Fotos;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author fatom
 */
@Named
@RequestScoped
public class FotosC  extends  Fotos{
    private List <Fotos>Fotos;

    @PostConstruct
    public void init(){
        for(int i=0;i<5;i++){
            Fotos f= new Fotos(i,"ciudad","imagenes",i+".png",i);
            Fotos.add( f);
        }
    }
    
    
    public List <Fotos> getFotos() {
        return Fotos;
    }

    public void setFotos(List <Fotos> Fotos) {
        this.Fotos = Fotos;
    }
    
    
    
    
}

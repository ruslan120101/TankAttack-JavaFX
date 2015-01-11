/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprites;

import javafx.scene.image.*;

/**
 *
 * @author Ruslan
 */
public abstract class Sprite extends ImageView {
    
    public static String imageName;
    
    private double width;
    private double height;
    
    public double health = 100;
    public HealthBar healthBar;
       
    
    
    public double height() {
        
        return this.height;
        
    }
    
    public double width() {
        
        return this.width;
        
    }
    
    public void setHeight(double height) {
        
        this.height = height;
        
    }
    
    public void setWidth(double width) {
        
        this.width = width;
        
    }
    
}

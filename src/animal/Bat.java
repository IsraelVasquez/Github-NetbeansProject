/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author ivasquez
 */
public class Bat implements IFly, ImakeSound {
    
    String Sound;
    @Override
    public void makeSound() {
        
        this.Sound = "~eeh";
    }

    public void Ifly() {
        System.out.println("I can fly");
        
    }

    
    
}

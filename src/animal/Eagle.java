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
public class Eagle implements IFly, Iwalk, ImakeSound {
    
    boolean Fly;
    String Sound;
    
    @Override
    public void Iwalk() {
        System.out.println("waddle");
    }

    //public String getSound() {
        //return Sound;
    //}

    //public void setSound(String Sound) {
        //this.Sound = Sound;
    //}

    @Override
    public void makeSound() {
    System.out.println(Sound);
    }

    public void Ifly() {
        System.out.println("I can fly");
        
    }
        
        
        
   
    
}

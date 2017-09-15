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
public class Shark implements ISwim, ImakeSound {
    String Sound = "~moah~";
    @Override
    public void Iswim() {
    System.out.println("swimming");
    }

    @Override
    public void makeSound() {
    System.out.println(Sound);
    }

    public void setSound(String Sound) {
    this.Sound = Sound;
    }

    public String getSound() {
        return Sound;
    }
    
}
    


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
public class Bass implements ISwim, ImakeSound {
    String Sound;
    @Override
    public void Iswim() {
        System.out.println("swimmming");
    }

    @Override
    public void makeSound() {
       this.Sound = "splish splash splush";
    }
    
}

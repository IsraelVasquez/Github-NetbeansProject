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
public class Dolphin implements ISwim, ImakeSound {
    String Sound;
    @Override
    public void makeSound() {
        this.Sound = "click clique";
    }

    @Override
    public void Iswim() {
        System.out.println("swimming");
    }
    
}

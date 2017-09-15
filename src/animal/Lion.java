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
public class Lion implements Iwalk, ImakeSound {
    String Sound;
    @Override
    public void Iwalk() {
        System.out.println("prancing");
    }

    @Override
    public void makeSound() {
        this.Sound ="rooar!";
    }
    
}

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
public class Penguin implements ISwim, Iwalk {
    
         
    @Override
    public void Iwalk() {
        System.out.println("waddling");
    }

    @Override
    public void Iswim() {
        System.out.println("I am swimmming");
        
    }
    
}

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
public class Bird extends Animal {
    
    double Wingspan;
    
    public Bird(String Name, double Wingspan) {
        super(Name);
        this.Wingspan = Wingspan;
    }

    public double getWingspan() {
        return Wingspan;
    }

    public void setWingspan(double Wingspan) {
        this.Wingspan = Wingspan;
    }
    
    
}

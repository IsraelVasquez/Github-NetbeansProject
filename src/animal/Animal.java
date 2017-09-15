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
public class Animal{
    String Name;

    public Animal(String Name) {
        this.Name = Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        System.out.println(Name);
        return Name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.ArrayList;

/**
 *
 * @author ivasquez
 */
public class AnimalList {
    
    public static void main(String[] args){
        
        Bird Ethan = new Bird("ostrich",6.6);
        Bird John = new Bird("penguin", 2.6);
        Bird Parker = new Bird("eagle", 7.5);
        Fish Caleb = new Fish("shark", true);
        Mammal Aiden = new Mammal("lion", 100.5);
        Mammal Trevor = new Mammal("bat", 100.0);
        Fish Anthony = new Fish("bass", true);
        Fish Israel = new Fish("flying fish", true);
        Mammal AnthonyG = new Mammal("dolphin", 96.8);
        
        System.out.println("-----Animals-----");
    
        ArrayList<Animal> Animals = new ArrayList();
        Animals.add(Ethan);
        Animals.add(John);
        Animals.add(Parker);
        Animals.add(Caleb);
        Animals.add(Aiden);
        Animals.add(Trevor);
        Animals.add(Anthony); 
        Animals.add(AnthonyG);
        Animals.add(Israel);

            for (Animal animals : Animals) {
                animals.getName();
            } 
        
        System.out.println("-----Birds-----");
    
        ArrayList<Bird> Birds = new ArrayList();
        Birds.add(Ethan);
        Birds.add(John);
        Birds.add(Parker);
        
            for (Bird birds : Birds) {
                birds.getName();
            }
        
        System.out.println("-----Mammals-----");
    
        ArrayList<Mammal> Mammals = new ArrayList();
        Mammals.add(Trevor);
        Mammals.add(Aiden);
        Mammals.add(AnthonyG);
        
            for (Mammal mammal : Mammals) {
                mammal.getName();
            }
        
        System.out.println("-----Fishes-----");
        
        ArrayList<Fish> Fishes = new ArrayList();
        Fishes.add(Anthony);
        Fishes.add(Israel);
        Fishes.add(Caleb);
        
            for (Fish fish : Fishes) {
                fish.getName();
            }
      
        System.out.println("-----Flyers-----");
        
        ArrayList<String> flyers = new ArrayList();
        flyers.add(Trevor.getName());
        flyers.add(Parker.getName());
        flyers.add(Israel.getName());
        
        
        System.out.println("-----Walkers-----");
        
        ArrayList<String> walkers = new ArrayList();
        walkers.add(John.getName());
        walkers.add(Ethan.getName());
        walkers.add(Aiden.getName());
        
        
        System.out.println("-----Swimmers-----");
        
        ArrayList<String> Swimmers = new ArrayList();
        Swimmers.add(Anthony.getName());
        Swimmers.add(John.getName());
        Swimmers.add(Caleb.getName());
        Swimmers.add(Israel.getName());
        
        
        System.out.println("-----Soundmakers-----");
        
        ArrayList<String> Soundmakers = new ArrayList();
        Soundmakers.add(Anthony.getName());
        Soundmakers.add(John.getName());
        Soundmakers.add(Caleb.getName());
        Soundmakers.add(Israel.getName());
        Soundmakers.add(Aiden.getName());
        Soundmakers.add(Trevor.getName());
        Soundmakers.add(Ethan.getName());
        Soundmakers.add(Parker.getName());
        Soundmakers.add(AnthonyG.getName());
        }
        
    }
    

        
        

    



    

    
    
    
        
    
    

    
   

    
    
    


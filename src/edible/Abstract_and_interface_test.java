package edible;

import animal.Animal;
import animal.Chickens;
import animal.Tigers;
import fruit.Apples;
import fruit.Fruits;
import fruit.Oranges;

public class Abstract_and_interface_test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chickens();
        animals[1] = new Tigers();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());

             if (animal instanceof Chickens){
                 Edible edibler = (Chickens) animal;
                 System.out.println(edibler.howToEat());
             }
        }

        Fruits[] fruits = new Fruits[2];
        fruits[0] = new Apples();
        fruits[1] = new Oranges();
        for (Fruits fruit:fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

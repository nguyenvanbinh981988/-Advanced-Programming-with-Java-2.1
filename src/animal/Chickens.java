package animal;

import edible.Edible;

public class Chickens extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat(){
        return "Could be fried";
    }
}

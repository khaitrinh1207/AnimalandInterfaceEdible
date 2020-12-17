package Animal;

import Edible.Edible;

public class Chicken extends Animal implements Edible {


        public String makeSound(){
            return "Chicken : Cluck- Cluck";
        }

    public String howToEat() {
    return "could be fried";
    }
}


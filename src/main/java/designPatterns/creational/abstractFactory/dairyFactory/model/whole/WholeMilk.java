package designPatterns.creational.abstractFactory.dairyFactory.model.whole;

import designPatterns.creational.abstractFactory.dairyFactory.model.Milk;

public class WholeMilk extends Milk {

    public WholeMilk() {
        super();
        generateIngredientsList("Whole milk");
    }

    @Override
    public String showIngredients() {
        return ingredients.toString();
    }

}

package designPatterns.creational.abstractFactory.dairyFactory.model.skimmed;

import designPatterns.creational.abstractFactory.dairyFactory.model.Milk;

public class SkimmedMilk extends Milk {

    public SkimmedMilk() {
        super();
        generateIngredientsList("Skimmed milk");
    }

    @Override
    public String showIngredients() {
        return ingredients.toString();
    }
}

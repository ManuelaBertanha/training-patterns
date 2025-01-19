package designPatterns.creational.abstractFactory.dairyFactory.model.semiSkimmed;

import designPatterns.creational.abstractFactory.dairyFactory.model.Milk;

public class SemiSkimmedMilk extends Milk {

    public SemiSkimmedMilk() {
        super();
        generateIngredientsList("Semi skimmed milk");
    }

    @Override
    public String showIngredients() {
        return ingredients.toString();
    }

}

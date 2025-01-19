package designPatterns.creational.abstractFactory.dairyFactory.model;

import designPatterns.creational.abstractFactory.dairyFactory.enums.MilkStabilizer;

public abstract class Milk extends Dairy {

    protected float pricePerLiter;

    @Override
    protected void generateIngredientsList(String ingredient) {
        ingredients.add(0, ingredient);
        ingredients.add(1, String.valueOf(MilkStabilizer.SODIUM_CITRATE));
        ingredients.add(2, String.valueOf(MilkStabilizer.SODIUM_TRIPHOSPHATE));
        ingredients.add(3, String.valueOf(MilkStabilizer.SODIUM_MONOPHOSPHATE));
        ingredients.add(4, String.valueOf(MilkStabilizer.SODIUM_DIPHOSPHATE));
    }

}

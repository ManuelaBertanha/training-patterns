package designPatterns.creational.abstractFactory.dairyFactory.model;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Dairy {

    public Dairy() {
        ingredients = new ArrayList<>();
    }

    protected List<String> ingredients; // TRY TO CREATE A NUTRITIONAL TABLE
    protected double fatContent;
    protected DateFormat manufactureDate;
    protected DateFormat expirationDate;
    protected String batchNumber;

    protected abstract void generateIngredientsList(String ingredient);
    public abstract String showIngredients();

    //abstract void setFatContent(double percentage);
    //abstract DateFormat calculateExpirationDate();
    //abstract String generateBatchNumber();
}

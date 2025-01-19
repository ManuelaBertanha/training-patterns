package designPatterns.creational.abstractFactory.dairyFactory.model;

import java.text.DateFormat;
import java.util.List;

public abstract class Dairy {

    protected List<String> ingredients; // TRY TO CREATE A NUTRITIONAL TABLE
    protected double fatContent;
    protected DateFormat manufactureDate;
    protected DateFormat expirationDate;
    protected String batchNumber;

    abstract List<String> generateIngredientsList();
    abstract void setFatContent(double percentage);
    abstract DateFormat calculateExpirationDate();
    abstract String generateBatchNumber();
}

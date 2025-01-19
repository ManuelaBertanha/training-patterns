package designPatterns.creational.abstractFactory.dairyFactory.model;

public abstract class Milk extends Dairy {

    protected float pricePerLiter;

    public abstract int getPrice();
}

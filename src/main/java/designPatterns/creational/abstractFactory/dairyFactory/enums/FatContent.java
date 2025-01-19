package designPatterns.creational.abstractFactory.dairyFactory.model.enums;

public enum FatContent {

    SKIMMED(0.3),
    SEMI_SKIMMED(1.0),
    WHOLE(3.0);

    private final double percentage; // GETTER?

    FatContent(double percentage) {
        this.percentage = percentage;
    }

}

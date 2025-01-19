package designPatterns.creational.abstractFactory.dairyFactory.enums;

public enum MilkStabilizer {

    SODIUM_CITRATE("sodium citrate"),
    SODIUM_TRIPHOSPHATE("sodium triphosphate"),
    SODIUM_MONOPHOSPHATE("sodium monophosphate"),
    SODIUM_DIPHOSPHATE("sodium diphosphate");

    private final String stabilizer;

    MilkStabilizer(String stabilizer) {
        this.stabilizer = stabilizer;
    }

    @Override
    public String toString() {
        return stabilizer;
    }

}

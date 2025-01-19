import designPatterns.creational.abstractFactory.dairyFactory.model.Milk;
import designPatterns.creational.abstractFactory.dairyFactory.model.semiSkimmed.SemiSkimmedMilk;
import designPatterns.creational.abstractFactory.dairyFactory.model.skimmed.SkimmedMilk;
import designPatterns.creational.abstractFactory.dairyFactory.model.whole.WholeMilk;

public class Application {

    public static void main(String[] args) {

        Milk skimmedMilk = new SkimmedMilk();
        Milk semiSkimmedMilk = new SemiSkimmedMilk();
        Milk wholeMilk = new WholeMilk();

        System.out.println(skimmedMilk.showIngredients() +
                '\n' + semiSkimmedMilk.showIngredients() +
                '\n' + wholeMilk.showIngredients()
        );
    }

}

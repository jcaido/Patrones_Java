package bridge.fighter;

public class WizardFighterImpl implements Fighter{

    @Override
    public void attack() {
        System.out.println("Wizard attack!!");
    }

    @Override
    public void protect() {
        System.out.println("Wizard protect!!");
    }
}

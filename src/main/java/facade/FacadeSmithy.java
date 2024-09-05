package facade;

import abstractFactory.weapon.Weapon;

public class FacadeSmithy {

    public void work(String name, boolean make) {
        if (make) {
            Forge forge = new Forge();
            forge.work(name);
            if (Skills.getSkills(name, make)) {
                if (!forge.search(name))
                    return;
                forge.remove(name);
                forge.working(name);
                System.out.println("The " + name + " has been created");
            } else
                System.out.println("It has not been possible to " + Forge.ACTION + " the " + name);
        } else {
            Workbench workbench = new Workbench();
            workbench.work(name);
            if (Skills.getSkills(name, make)) {
                if (!workbench.search(name))
                    return;
                workbench.remove(name);
                workbench.working(name);
                System.out.println("The " + name + " has been improved");
            } else
                System.out.println("It has not been possible to " + Workbench.ACTION + " the " + name);
        }
    }
}

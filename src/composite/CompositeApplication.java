package composite;

import compositeArmy.CompositeHuman;
import compositeArmy.Soldier;

public class CompositeApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        Soldier soldier1 = new Soldier();
        Soldier soldier2 = new Soldier();
        Soldier soldier3 = new Soldier();
        Soldier soldier4 = new Soldier();
        Soldier soldier5 = new Soldier();
        Soldier soldier6 = new Soldier();
        Soldier soldier7 = new Soldier();
        Soldier soldier8 = new Soldier();
        Soldier soldier9 = new Soldier();
        Soldier soldier10 = new Soldier();

        CompositeHuman squad = new CompositeHuman("명");
        squad.add(soldier1);
        squad.add(soldier2);
        squad.add(soldier3);
        squad.add(soldier4);
        squad.add(soldier5);
        squad.add(soldier6);
        squad.add(soldier7);
        squad.add(soldier8);
        squad.add(soldier9);
        squad.add(soldier10);
        System.out.println("squad : ");
        squad.say();
        squad.sayAll();

        CompositeHuman platoon = new CompositeHuman("분대");
        for (int i = 0; i < 3; i++) {
            platoon.add(squad);
        }
        System.out.println("platoon : ");
        platoon.sayAll();

        CompositeHuman company = new CompositeHuman("소대");
        for (int i = 0; i < 3; i++) {
            company.add(platoon);
        }
        System.out.println("company : ");
        company.sayAll();
//        company.say();

    }
}

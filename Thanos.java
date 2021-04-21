import java.util.ArrayList;
import java.util.Collections;

public class Thanos {

    public static void main(String[] args){
        Hero widow = new Hero("Black Widow", 34);
        Hero cap = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero redWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero stephen = new Hero("Doctor Strange", 42);
        ArrayList<Hero> hero = new ArrayList<>();
        Collections.addAll(hero, widow, cap, vision, ironMan, redWitch, thor, hulk, stephen);
        thor.setAge(1501);
        Collections.shuffle(hero);
        System.out.println("Our heroes are gathered:");
        for(Hero avenger: hero){
            avenger.presentHero();
        }
        System.out.println("\nThanos snap his fingers, now remains:");
        ArrayList<Hero> heroLeft = new ArrayList<Hero>(hero.subList(0, hero.size()/2));
        for(Hero remaining: heroLeft){
            System.out.println(remaining.getName());
        }
    }
}

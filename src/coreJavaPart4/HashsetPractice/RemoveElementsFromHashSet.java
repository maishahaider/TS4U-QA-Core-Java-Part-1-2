package coreJavaPart4.HashsetPractice;

import java.util.HashSet;

public class RemoveElementsFromHashSet {
    public static void main(String[] args) {
        HashSet<String> players= new HashSet<>();

        players.add("Messi");
        players.add("Ronaldo");
        players.add("Neymar");
        players.add("Salah");

        System.out.println("The players are: "+players);

        Boolean removedResult= players.remove("Messi");
        System.out.println("Is the player removed? "+removedResult);

        System.out.println(players);
        Boolean allRemoved=players.removeAll(players);
        System.out.println("All player are removed? "+allRemoved);

        System.out.println("After removing all players: "+players);
    }
}

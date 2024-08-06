package coreJavaPart4.HashMapExample;

import java.util.HashMap;

public class InsertItemDuplicateKey {
    public static void main(String[] args) {
        HashMap<Integer,String> nominatedPlayers=new HashMap<>();
        nominatedPlayers.put(10,"Messi");
        nominatedPlayers.put(7,"Ronaldo");
        nominatedPlayers.put(11,"Neymar");
        nominatedPlayers.put(9,"Mbappe");

        System.out.println("The nominated players are: "+nominatedPlayers);

        nominatedPlayers.put(7,"John");
        System.out.println("After inserting a value in the same key: "+nominatedPlayers);
    }
}

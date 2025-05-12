/** Mapy */

import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) {
        Map<Integer, String> matrix = new HashMap<>();
        matrix.put(100, "Neo");
        matrix.put(200, "Morfeusz");
        matrix.put(300, "Trinity");
        matrix.put(400, "Apoc");

        System.out.println("Team size: " + matrix.size());

        System.out.println("Find by key: " + matrix.get(200));
        System.out.println("Find by key: " + matrix.get(0));

        matrix.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

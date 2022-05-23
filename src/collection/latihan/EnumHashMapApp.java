package collection.latihan;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

    public static enum Level{
        FREE, STANDARD, PREMIUM, VIP
    }
    public static void main(String[] args) {

        Map<Level, String> levelStringMap = new EnumMap<Level, String>(Level.class);

        levelStringMap.put(Level.FREE,"Eko");
        levelStringMap.put(Level.PREMIUM, "Yusuf");
        levelStringMap.put(Level.VIP,"Eka");
        levelStringMap.put(Level.STANDARD,"Pendi");

        for (Level key:levelStringMap.keySet()){
            System.out.println(levelStringMap.get(key));
        }

    }
}

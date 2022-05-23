package collection.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();

        mutable.add("yusuf");
        mutable.add("Marsudien");
        List<String> imutable = Collections.unmodifiableList(mutable);

        List<String> elem = List.of("saniat","santy","Icake");
    }
}

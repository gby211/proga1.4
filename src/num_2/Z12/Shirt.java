package num_2.Z12;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    private void fill(String[] strings){
        code = strings[0].trim();
        name = strings[1].trim();
        color = strings[2].trim();
        size = strings[3].trim();
    }

    Shirt(String str){
        String[] strings = str.split(",");
        fill(strings);
    }

    public static Shirt[] getArray(String[] strings){
        Shirt[] shirts = new Shirt[strings.length];
        int i = 0;
        for(String str: strings) {
            shirts[i] = new Shirt(str);
            i++;
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
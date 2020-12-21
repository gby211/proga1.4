package num_2.Z12;


import java.util.ArrayList;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String area;
    private String city;
    private String street;
    private String house;
    private String flat;

    Address(){

    }

    private void fill(String[] strings){
        country = strings[0].trim();
        area = strings[1].trim();
        city = strings[2].trim();
        street = strings[3].trim();
        house = strings[4].trim();
        flat = strings[5].trim();
    }

    public void splitByComma(String string){
        String[] strings = string.split(",");
        fill(strings);
    }

    public void splitBySeparator(String string){
        StringTokenizer st = new StringTokenizer(string, ",.;:-");
        ArrayList<String> strings = new ArrayList<>();
        while(st.hasMoreTokens())
            strings.add(st.nextToken());
        String[]strings1 = new String[strings.size()];
        strings.toArray(strings1);
        fill(strings1);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
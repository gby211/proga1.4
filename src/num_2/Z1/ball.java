package num_2.Z1;

import javax.xml.namespace.QName;

public class ball {
    private Double size;
    private Double prise;
    private String name;
    private Double x=0.0,y=0.0;



    public ball(Double size, Double prise, String name) {
        this.prise = prise;
        this.size = size;
        this.name = name;
    }

    public ball(String name) {
        prise = 0.0;
        size = 0.0;
        this.name = name;
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "bool{" + ", name='" + name + '\'' +
                "size=" + size +
                ", prise=" + prise + '}';
    }
}

package num_2.Z12;

public class Person {
    private String firstName;
    private String secondName;
    private String thirdName;

    Person(String firstName){
        this.firstName = firstName;
    }

    Person(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    Person(String firstName, String secondName, String thirdName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }
    //
    public String getFIO(){
        String result;
        if(secondName == null && thirdName == null)
            result = new StringBuilder().append(firstName).toString();
        else if(secondName != null && thirdName == null)
            result = new StringBuilder().append(firstName).append(" ").append(secondName).toString();
        else if(secondName == null)
            result = new StringBuilder().append(firstName).append(" ").append(thirdName).toString();
        else
            result = new StringBuilder().append(firstName).append(" ").append(thirdName).append(" ").append(secondName).toString();

        return result;
    }
}
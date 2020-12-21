package num_2.Z12;

public class Phone {

    public static String formatPhone(String str){
        String result = "";
        StringBuilder builder = new StringBuilder(str);
        if(str.length() == 11) {
            if (builder.charAt(0) == '8')
                builder.replace(0, 1, "7");
            builder.insert(0, '+');
        }
        builder.insert(2, "(").insert(2+4, ")").insert(2+4+4, "-").insert(2+4+4+3, "-");
        System.out.println(builder);
        return  result;
    }
}
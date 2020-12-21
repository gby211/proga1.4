package num_2.Z12;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class FilenameFormat {

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    private static void writeUsingFiles(String data, String fileName) throws IOException{
        FileWriter writer = new FileWriter(fileName, false);
        writer.write(data);
        writer.flush();
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<String>();
        for (String element : list)
            if (!newList.contains(element))
                newList.add(element);
        return newList;
    }

    private static String arrayToString(String[] data){
        StringBuilder builder = new StringBuilder();
        for(String s : data) {
            builder.append(s).append(" ");
        }
        return builder.toString();
    }

    public static void shuffle(String[] data){
        for(int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i].charAt(data[i].length() - 1) == data[j].charAt(0)) {
                    String tmp = data[j];
                    for (int k = j; k > i + 1; k--)
                        data[k] = data[k - 1];
                    data[i + 1] = tmp;
                }
                if (data[i].charAt(0) == data[j].charAt(data[j].length() - 1)) {
                    String tmp = data[j];
                    for (int k = j; k > i; k--)
                        data[k] = data[k - 1];
                    data[i] = tmp;
                }
            }
        }
    }

    public static void getLine(String fileName){
        try {
            ArrayList<String> data = new ArrayList<>(Arrays.asList(readUsingFiles(fileName).split(" ")));
            data = removeDuplicates(data);
            String[] result = new String[data.size()];
            data.toArray(result);
            shuffle(result);
            writeUsingFiles(arrayToString(result), fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
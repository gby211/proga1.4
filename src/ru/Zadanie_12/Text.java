package ru.Zadanie_12;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TextDocument implements IDocument{

    static JTextArea area = new JTextArea();
    static String file_name;

    TextDocument(){
    }

    @Override
    public void create(JFrame f) {
        JFrame f1 = new JFrame("Введите имя");
        f1.setSize(250, 100);
        f1.setLocationRelativeTo(null);
        f1.setLayout(new GridLayout(2,1));
        JTextField field = new JTextField();
        f1.add(field);
        JButton butOK = new JButton("ОК");
        f1.add(butOK);
        f1.setVisible(true);
        butOK.addActionListener(e -> {
            file_name = field.getText() + ".txt";
            f1.setVisible(false);

            try {
                Files.createFile(Path.of(System.getProperty("user.dir")+ "\\" + file_name));
                workWithTextFile(f, System.getProperty("user.dir") + "\\" + file_name);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });


    }

    @Override
    public void open(JFrame f) {
        //указание пути
        final String[] path_file = {""};
        JFrame f1 = new JFrame();
        f1.setSize(250, 100);
        f1.setLocationRelativeTo(null);
        f1.setLayout(new GridLayout(2,1));
        JTextField field = new JTextField(System.getProperty("user.dir") + "\\");
        f1.add(field);
        JButton butOK = new JButton("ОК");
        f1.add(butOK);
        butOK.addActionListener(e1 -> {
            f1.setVisible(false);
            try {
                workWithTextFile(f, field.getText());
                file_name = field.getText();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        f1.setVisible(true);
    }

    @Override
    public void save() {
        try (FileWriter writer = new FileWriter(file_name, false)) {
            writer.write(area.getText());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void close(JFrame f) {
        save();
        f.remove(f.getContentPane().getComponents()[0]);
    }

    public static void workWithTextFile(JFrame f, String path) throws IOException {

        f.add(area, BorderLayout.CENTER);
        String text = readFile(path);
        area.setText(text);
        if(text.isEmpty())
            area.setText("//Write your text here");
    }

    private static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
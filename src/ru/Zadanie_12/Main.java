package ru.Zadanie_12;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

class MainTest extends JFrame{

    static IDocument document = null;
    static JFrame f = new JFrame();

    public static void main(String[] args) {

        AbstractFabric fabric = new Fabric();


        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(new BorderLayout());

        JMenuBar bar = new JMenuBar();
        JMenu file_menu = new JMenu("File");
        JMenu window_menu = new JMenu("Window");
        bar.add(file_menu);
        bar.add(window_menu);

        //==================================== Создание файла ==============================================
        JMenu new_menu = new JMenu("New");
        JMenuItem text_menu_item = new JMenuItem("Text");
        text_menu_item.addActionListener(e -> {
            try {
                document = fabric.createDoc("text");
                document.create(f);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        JMenuItem img_menu_item = new JMenuItem("Image (decorative)"); //здесь можно будет создать изображение
        JMenuItem music_menu_item = new JMenuItem("Music (decorative)"); //здесь можно будет создать аудио
        file_menu.add(new_menu);
        new_menu.add(text_menu_item);
        new_menu.add(music_menu_item);
        new_menu.add(img_menu_item);

        //==================================== Открытие файла ==============================================

        JMenuItem open_menu_item = new JMenuItem("Open recent");
        open_menu_item.addActionListener(e -> {

            try {
                document = fabric.createDoc("text");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            document.open(f);

        });


        //==================================== Сохранение файла =============================================

        JMenuItem save_menu_item = new JMenuItem("Save");
        save_menu_item.addActionListener(e -> document.save());


        //==================================== Выход ========================================================

        JMenuItem exit_menu_item = new JMenuItem("Close");
        exit_menu_item.addActionListener(e -> document.close(f));


        file_menu.add(open_menu_item);
        file_menu.add(save_menu_item);
        window_menu.add(exit_menu_item);


        f.setJMenuBar(bar);

        f.setVisible(true);

    }

}
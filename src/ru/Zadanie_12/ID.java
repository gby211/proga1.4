package ru.Zadanie_12;
import javax.swing.*;

interface IDocument {
    void create(JFrame f);
    void open(JFrame f);
    void save();
    void close(JFrame f);
}
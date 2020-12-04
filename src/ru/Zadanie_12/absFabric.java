package ru.Zadanie_12;
import java.io.IOException;

interface AbstractFabric {
    IDocument createDoc(String type) throws IOException;
}

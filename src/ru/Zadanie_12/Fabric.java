package ru.Zadanie_12;

public class Fabric implements AbstractFabric{

    @Override
    public IDocument createDoc(String type){
        return switch (type) {
            case "text" -> new TextDocument();
            case "image" -> new ImageDocument();
            case "music" -> new MusicDocument();
            default -> null;
        };
    }
}
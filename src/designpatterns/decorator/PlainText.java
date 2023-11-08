package designpatterns.decorator;

public class PlainText implements TextComponent{
    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }
}

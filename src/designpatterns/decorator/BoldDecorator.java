package designpatterns.decorator;

public class BoldDecorator extends TextDecorator{
    public BoldDecorator(TextComponent wrappedText) {
        super(wrappedText);
    }

    @Override
    public String getText() {
        return "<b>"+super.getText() +"<b>";
    }
}

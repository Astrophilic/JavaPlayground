package designpatterns.decorator;

public class ItalicDecorator extends TextDecorator{


    public ItalicDecorator(TextComponent wrappedText) {
        super(wrappedText);
    }

    @Override
    public String getText() {
        return "<i>"+super.getText()+"<i>";
    }

}

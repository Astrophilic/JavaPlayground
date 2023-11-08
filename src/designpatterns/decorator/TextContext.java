package designpatterns.decorator;

public class TextContext {

    public static void runExample(){
        TextComponent text  = new ItalicDecorator(new BoldDecorator(new BoldDecorator(new PlainText("hello world"))));
        System.out.println(text.getText());

    }
}

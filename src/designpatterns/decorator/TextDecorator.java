package designpatterns.decorator;

public abstract class TextDecorator implements TextComponent {
    private final TextComponent wrappedText;

    public TextDecorator(TextComponent wrappedText) {
        this.wrappedText = wrappedText;
    }

    @Override
    public String getText() {
        return wrappedText.getText();
    }

}

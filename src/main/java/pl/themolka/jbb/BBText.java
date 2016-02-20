package pl.themolka.jbb;

public class BBText extends BBObject {
    private String text;

    public BBText() {
    }

    public BBText(String text) {
        this.text = text;
    }

    public String getRawText() {
        return this.text;
    }

    public String getText() {
        return JBBCode.escapeString(this.text);
    }

    public boolean hasText() {
        return this.text != null;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.getText();
    }
}

package pl.themolka.jbb.def;

import pl.themolka.jbb.BBTag;

public class BBStrikethrough extends BBTag {
    public static final String TAG_NAME = "s";

    public BBStrikethrough() {
        this(null);
    }

    public BBStrikethrough(String text) {
        super(TAG_NAME, null);

        if (text != null) {
            this.addText(text);
        }
    }
}

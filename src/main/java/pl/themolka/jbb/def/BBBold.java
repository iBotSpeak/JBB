package pl.themolka.jbb.def;

import pl.themolka.jbb.BBTag;

public class BBBold extends BBTag {
    public static final String TAG_NAME = "b";

    public BBBold() {
        this(null);
    }

    public BBBold(String text) {
        super(TAG_NAME, null);

        if (text != null) {
            this.addText(text);
        }
    }
}

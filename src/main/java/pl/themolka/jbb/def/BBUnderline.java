package pl.themolka.jbb.def;

import pl.themolka.jbb.BBTag;

public class BBUnderline extends BBTag {
    public static final String TAG_NAME = "u";

    public BBUnderline() {
        this(null);
    }

    public BBUnderline(String text) {
        super(TAG_NAME, null);

        if (text != null) {
            this.addText(text);
        }
    }
}

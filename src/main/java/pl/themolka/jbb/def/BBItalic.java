package pl.themolka.jbb.def;

import pl.themolka.jbb.BBTag;

public class BBItalic extends BBTag {
    public static final String TAG_NAME = "i";

    public BBItalic() {
        this(null);
    }

    public BBItalic(String text) {
        super(TAG_NAME, null);

        if (text != null) {
            this.addText(text);
        }
    }
}

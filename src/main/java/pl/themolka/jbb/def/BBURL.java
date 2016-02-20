package pl.themolka.jbb.def;

import pl.themolka.jbb.BBTag;

public class BBURL extends BBTag {
    public static final String TAG_NAME = "url";

    public BBURL() {
        this(null);
    }

    public BBURL(String url) {
        this(null, url);
    }

    public BBURL(String title, String url) {
        super(TAG_NAME, null);

        if (title != null) {
            this.setAttribute(url);
            this.addText(title);
        } else if (url != null) {
            this.addText(url);
        }
    }

    public String getTitle() {
        if (this.hasAttribute()) {
            return this.getValues().toString();
        } else {
            return this.getURL();
        }
    }

    public String getURL() {
        if (this.hasAttribute()) {
            return this.getAttribute();
        } else {
            return this.getValues().toString();
        }
    }

    public boolean hasTitle() {
        return this.getTitle().equals(this.getURL());
    }
}

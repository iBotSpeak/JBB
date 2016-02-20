package pl.themolka.jbb;

public class BBSingleTag extends BBTag {
    public BBSingleTag() {
    }

    public BBSingleTag(String name) {
        this(name, null);
    }

    public BBSingleTag(String name, String attribute) {
        super(name, attribute);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.hasName()) {
            builder.append("[").append(this.getName());

            if (this.hasAttribute()) {
                builder.append("=\"").append(this.getAttribute()).append("\"");
            }

            builder.append("]");
        }

        builder.append(this.getValues().toString());

        return builder.toString();
    }
}

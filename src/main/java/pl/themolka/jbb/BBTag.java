package pl.themolka.jbb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BBTag extends BBObject implements Iterable<BBObject> {
    private String attribute;
    private String name;
    private final List<BBObject> values = new BBObjectList();

    public BBTag() {
    }

    public BBTag(String name) {
        this(name, null);
    }

    public BBTag(String name, String attribute) {
        this.name = JBBCode.escapeString(name);
        this.attribute = attribute;
    }

    public BBTag add(BBObject... objects) {
        for (BBObject object : objects) {
            this.values.add(object);
        }
        return this;
    }

    public BBTag addText(String text) {
        this.values.add(new BBText(text));
        return this;
    }

    @Override
    public Iterator<BBObject> iterator() {
        return this.values.iterator();
    }

    public String getName() {
        return this.name;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public List<BBObject> getValues() {
        return new BBObjectList(this.values);
    }

    public boolean hasName() {
        return this.name != null;
    }

    public boolean hasAttribute() {
        return this.attribute != null;
    }

    public boolean hasValues() {
        return !this.values.isEmpty();
    }

    public boolean remove(BBObject object) {
        return this.values.remove(object);
    }

    public BBTag setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    public BBTag setName(String name) {
        this.name = JBBCode.escapeString(name);
        return this;
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

        builder.append(this.values.toString());

        if (this.hasName()) {
            builder.append("[/").append(this.getName()).append("]");
        }

        return builder.toString();
    }

    private class BBObjectList extends ArrayList<BBObject> {
        public BBObjectList() {
        }

        public BBObjectList(Collection list) {
            super(list);
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            for (BBObject object : this) {
                String string = object.toString();

                if (string != null) {
                    builder.append(string);
                }
            }

            return builder.toString();
        }
    }
}

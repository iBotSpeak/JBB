package pl.themolka.jbb;

import java.io.Serializable;
import pl.themolka.jbb.layout.BBLayout;
import pl.themolka.jbb.layout.BBLayoutException;

public class JBBCode implements Serializable {
    private BBTag root;

    public JBBCode() {
        this.root = new BBTag();
    }

    public final BBTag getRoot() {
        return this.root;
    }

    public void setRoot(BBTag root) {
        this.root = root;
    }

    public void executeLayout(BBLayout layout) throws BBLayoutException {
        try {
            layout.executeLayout(this.getRoot());
        } catch (Throwable ex) {
            throw new BBLayoutException(ex.getMessage(), ex.getCause());
        }
    }

    @Override
    public String toString() {
        return this.getRoot().toString();
    }

    public static String escapeString(String string) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char escape = string.charAt(i);

            if (escape == '\\' || escape == '[') {
                builder.append("\\");
            }

            builder.append(escape);
        }

        return builder.toString();
    }
}

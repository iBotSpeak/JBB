package pl.themolka.jbb.layout;

import pl.themolka.jbb.BBObject;
import pl.themolka.jbb.BBTag;

public class TagCaseLayout extends BBLayout {
    private final TagCaseState state;

    public TagCaseLayout(TagCaseState state) {
        this.state = state;
    }

    @Override
    public void executeLayout(BBTag root) {
        for (BBObject object : root) {
            if (object instanceof BBTag) {
                BBTag tag = (BBTag) object;

                switch (this.state) {
                    case LOWER_CASE:
                        tag.setName(tag.getName().toLowerCase());
                        break;
                    case UPPER_CASE:
                        tag.setName(tag.getName().toUpperCase());
                        break;
                }

                this.executeLayout(tag);
            }
        }
    }

    public enum TagCaseState {
        UPPER_CASE, LOWER_CASE;
    }
}

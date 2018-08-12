package issuetracker.bindingModel;

import javax.validation.constraints.NotNull;

public class IssueBindingModel {

    @NotNull
    private String title;

    @NotNull
    private String content;

    @NotNull
    private int priority;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

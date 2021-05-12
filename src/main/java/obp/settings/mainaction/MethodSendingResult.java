package obp.settings.mainaction;

import com.intellij.openapi.project.Project;

public class MethodSendingResult {
    public MethodSendingResult(MethodSendingType methodSendingType, String message, String title, Project project) {
        this.methodSendingType = methodSendingType;
        this.message = message;
        this.title = title;
        this.project=project;
    }



    private MethodSendingType methodSendingType;
    private String message;
    private final String title;
    private final Project project;

    public MethodSendingType getMethodSendingType() {
        return methodSendingType;
    }

    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }

    public Project getProject() {
        return project;
    }
}

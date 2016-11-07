import org.apache.tools.ant.Project;

public class HelloWorld {
    private Project project;

    public void setProject(Project p) {
        this.project = p;
    }

    public void execute() {
        String message = project.getProperty("ant.project.name");
        project.log("Here is the project '" + message + "'. ", Project.MSG_INFO);
    }
    
}
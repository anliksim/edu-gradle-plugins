package anliksim.hello;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

public class HelloPlugin implements Plugin<Project> {

    public void apply(Project project) {
        Task hello = project.getTasks().create("hello");
        hello.doLast(task -> task.getLogger().lifecycle("Hello!"));
    }
}

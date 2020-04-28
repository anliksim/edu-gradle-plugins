package anliksim.hello;

import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloPluginTest {

    @Test
    public void test() {
        Project project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("anliksim.hello");
        Task helloTask = project.task("hello");
        assertTrue(helloTask instanceof DefaultTask);
    }
}

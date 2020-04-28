package anliksim

import anliksim.greets.GreetingTask
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class GreetingPluginTest {

    @Test
    void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'anliksim.greets'

        assertTrue(project.tasks.greets instanceof GreetingTask)
    }
}
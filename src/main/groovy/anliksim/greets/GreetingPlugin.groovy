package anliksim.greets

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {

    void apply(Project target) {
        target.tasks.register('greets', GreetingTask)
    }
}

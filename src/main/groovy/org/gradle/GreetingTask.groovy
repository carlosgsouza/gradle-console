package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
    String greeting = '1'

    @TaskAction
    def greet() {
        println greeting
    }
}

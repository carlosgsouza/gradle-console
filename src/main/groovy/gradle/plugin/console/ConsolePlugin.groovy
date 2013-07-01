package gradle.plugin.console

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.JavaExec

class ConsolePlugin implements Plugin<Project> {
	void apply(Project project) {
		project.rootProject.task('console', dependsOn: 'classes', type: JavaExec) {
			main = 'groovy.ui.Console'
			classpath = project.sourceSets.main.runtimeClasspath
		}
	}
}
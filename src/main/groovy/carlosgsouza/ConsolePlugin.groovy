package carlosgsouza

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.api.tasks.JavaExec
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class ConsolePlugin implements Plugin<Project> {
	
	void apply(Project project) {
		project.rootProject.task('console', dependsOn: 'classes', type: JavaExec) {
			logger.debug("Opening Gradle Console")
			
			main = 'groovy.ui.Console'
			
			project.apply plugin: "groovy"
			
			Configuration consoleRuntime = project.configurations.create("consoleRuntime")
			consoleRuntime.dependencies.add(project.dependencies.localGroovy())
			
			classpath = project.sourceSets.main.runtimeClasspath + project.sourceSets.test.runtimeClasspath  + project.files(consoleRuntime.asPath)
			logger.debug("Gradle Console classpath=$classpath")
		}
	}
}

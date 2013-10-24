package org.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyHandler
import org.gradle.api.tasks.JavaExec

class ConsolePlugin implements Plugin<Project> {
	void apply(Project project) {
		project.rootProject.task('console', dependsOn: 'classes', type: JavaExec) {
			main = 'groovy.ui.Console'
			
			project.apply plugin: "groovy"
			project.dependencies.add("groovy", project.dependencies.localGroovy())
			classpath = project.sourceSets.main.runtimeClasspath
		}
	}
}

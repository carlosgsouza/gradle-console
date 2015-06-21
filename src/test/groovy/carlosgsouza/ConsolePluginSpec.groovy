package carlosgsouza

import org.gradle.api.Project
import org.gradle.api.artifacts.DependencySet
import org.gradle.testfixtures.ProjectBuilder

import spock.lang.Specification

class ConsolePluginSpec extends Specification {
	
	def "should add a task called 'console' to the project"() {
		given:
		Project project = ProjectBuilder.builder().build()
		
		when:
		project.apply plugin: ConsolePlugin

		then:
		project.tasks.console
		
		and: "no dependencies were added to standard configurations"
		project.configurations.compile.allDependencies.isEmpty()
		project.configurations.testCompile.allDependencies.isEmpty()
		project.configurations.runtime.allDependencies.isEmpty()
		project.configurations.testRuntime.allDependencies.isEmpty()
		
		and: "custom configuration consoleRuntime was created"
		project.configurations.consoleRuntime != null
		
		and: "a dependency to localGroovy() is added under the consoleRuntime configuration"
		project.configurations.consoleRuntime.allDependencies.size() == 1
		
		// using toString() since equals doesn't seem to be working properly
		project.configurations.consoleRuntime.allDependencies[0].toString() == project.dependencies.localGroovy().toString()
		
		and: "the console task classpath includes dependencies from consoleRuntime configuration"
		project.tasks.console.classpath.find{ it ==~ /.*groovy-all.*.jar/ }
	}
}

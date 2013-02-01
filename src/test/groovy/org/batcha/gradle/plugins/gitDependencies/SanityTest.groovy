package org.batcha.gradle.plugins.gitDependencies

import org.junit.Before;
import org.junit.Test;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.testfixtures.ProjectBuilder;
import org.batcha.gradle.plugins.gitDependencies.GitDependenciesPlugin;

/**
 * Based on https://github.com/kellyrob99/gradle-jslint-plugin/blob/master/src/test/groovy/org/kar/jslint/gradle/plugin/JSLintPluginTest.groovy
 * 
 * @author dperez
 *
 */
class SanityTest {

	private Project project
	private JavaPlugin pluginJava
	private GitDependenciesPlugin gitPlugin

	@Before
	public void setup() {
		project = ProjectBuilder.builder().build()

		gitPlugin = new GitDependenciesPlugin()
		
		pluginJava = new JavaPlugin()
		
		pluginJava.apply(project)		
	}

	@Test
	public void testDeps() {
		
		gitPlugin.apply(project)
		
		project.getTasksByName("resolveGitDependencies", false).iterator().next().execute()		
	}
}

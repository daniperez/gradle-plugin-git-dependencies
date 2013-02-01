package org.batcha.gradle.plugins.gitDependencies

import org.junit.Before;
import org.junit.Test;
import org.gradle.api.Project;
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
	private GitDependenciesPlugin plugin

	@Before
	public void setup() {
		project = ProjectBuilder.builder().build()

		plugin = new GitDependenciesPlugin()
	}

	@Test
	public void testDeps() {
	}
}

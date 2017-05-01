package com.aussong.data.structure.test;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML;
import static org.jbehave.core.reporters.Format.TXT;
import static org.jbehave.core.reporters.Format.XML;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

public class DataStructureStories extends JUnitStories {
	
	public Configuration configuration() {
		return new MostUsefulConfiguration()
					.useStoryLoader(new LoadFromClasspath(this.getClass()))
					.useStoryReporterBuilder(new StoryReporterBuilder()
							.withCodeLocation(codeLocationFromClass(this.getClass()))
							.withFormats(CONSOLE, TXT, HTML, XML));
				
	}

	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(), 
				new TestBinarySearchTreeToLinkedList()
			).createCandidateSteps();
	}

	@Override
	protected List<String> storyPaths() {
		return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "");
	}

}

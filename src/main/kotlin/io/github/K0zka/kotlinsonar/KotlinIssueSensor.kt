package io.github.K0zka.kotlinsonar

import org.slf4j.LoggerFactory
import org.sonar.api.batch.Sensor
import org.sonar.api.batch.SensorContext
import org.sonar.api.batch.fs.FileSystem
import org.sonar.api.component.ResourcePerspectives
import org.sonar.api.resources.Project

class KotlinIssueSensor(
		private val fileSystem: FileSystem,
		private val perspectives: ResourcePerspectives) : Sensor {

	companion object {
		private val logger = LoggerFactory.getLogger(KotlinIssueSensor::class.java)!!
	}

	override fun shouldExecuteOnProject(project: Project): Boolean
			= fileSystem.hasFiles { it.language() == kotlinLanguageName }

	override fun analyse(project: Project, context: SensorContext) {
		for (input in fileSystem.inputFiles { it.language() == kotlinLanguageName }) {
			logger.debug("Analysing {}", input.relativePath())
		}
	}
}
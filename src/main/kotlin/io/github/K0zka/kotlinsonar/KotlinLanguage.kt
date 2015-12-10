package io.github.K0zka.kotlinsonar

import org.sonar.api.config.Settings
import org.sonar.api.resources.AbstractLanguage
import org.sonar.api.resources.Language

class KotlinLanguage(private val settings : Settings) : AbstractLanguage("Kotlin", "kotlin") {
	override fun getFileSuffixes(): Array<out String>
		= arrayOf(kotlinFileExtension)
}
package io.github.K0zka.kotlinsonar

import org.sonar.api.config.Settings
import org.sonar.api.resources.AbstractLanguage

class KotlinLanguage(private val settings : Settings) : AbstractLanguage(kotlinLanguageName, kotlinLanguageName) {
	override fun getFileSuffixes(): Array<out String>
		= arrayOf(kotlinFileExtension)
}
package io.github.K0zka.kotlinsonar

import org.sonar.api.SonarPlugin

class KotlinPlugin : SonarPlugin() {
	override fun getExtensions(): List<Any>
		= listOf(
		KotlinLanguage::class.java
	)
}
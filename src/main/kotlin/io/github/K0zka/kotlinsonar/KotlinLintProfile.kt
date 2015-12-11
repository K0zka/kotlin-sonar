package io.github.K0zka.kotlinsonar

import org.sonar.api.profiles.ProfileDefinition
import org.sonar.api.profiles.RulesProfile
import org.sonar.api.utils.ValidationMessages

class KotlinLintProfile : ProfileDefinition() {
	override fun createProfile(validationMessages: ValidationMessages): RulesProfile
		= RulesProfile.create("Kotlin", kotlinLanguageName)
}
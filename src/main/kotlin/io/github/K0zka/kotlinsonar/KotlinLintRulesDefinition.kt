package io.github.K0zka.kotlinsonar

import org.slf4j.LoggerFactory
import org.sonar.api.server.rule.RulesDefinition
import org.sonar.api.server.rule.RulesDefinitionXmlLoader

class KotlinLintRulesDefinition : RulesDefinition {

	companion object {
		val logger = LoggerFactory.getLogger(KotlinLintRulesDefinition::class.java)
	}

	override fun define(context: RulesDefinition.Context) {
		val repository = context.createRepository(
				kotlinLanguageName,
				kotlinLanguageName
		)
		KotlinLintRulesDefinition::class.java.getResourceAsStream("/kotlin_rules.xml").use {
			logger.info("input stream: {}", it)
			RulesDefinitionXmlLoader().load(repository, it, "UTF-8")
		}
		repository.done()
	}
}
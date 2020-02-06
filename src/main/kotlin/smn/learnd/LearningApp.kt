package smn.learnd

import io.dropwizard.Application
import io.dropwizard.setup.Environment
import smn.learnd.health.LearningHealthcheck
import smn.learnd.ws.LearningComponent

class LearningApp : Application<LearnDroppyConfig>() {
    override fun run(configuration: LearnDroppyConfig, environment: Environment) {
        println("Running ${configuration.name}!")
        val calculatorComponent = LearningComponent()
        environment.jersey().register(calculatorComponent)

        val learningHealthCheck = LearningHealthcheck()
        environment.healthChecks().register("learning",learningHealthCheck)
    }
}
package smn.learnd.health

import com.codahale.metrics.health.HealthCheck
import org.joda.time.DateTime

class LearningHealthcheck(): HealthCheck() {
    override fun check(): Result {
        val x: Int = DateTime().minuteOfHour().get()

        if (x % 2 == 0) {
            return Result.healthy()
        } else {
            return Result.unhealthy("Current minutes of hour aren't divisible by 2.")
        }
    }
}
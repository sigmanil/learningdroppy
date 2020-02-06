package smn.learnd.data

import com.fasterxml.jackson.annotation.JsonProperty

data class LearningData(@JsonProperty val name: String, @JsonProperty val age: Int)
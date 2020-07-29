package com.elsevier

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Input

class GreetingTask extends DefaultTask {

    @Input
    String firstName = "Elsevier"

    @TaskAction
    def greet() {
        println "Hello ${firstName}"
    }
}

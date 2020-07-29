package com.elsevier

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Input

class PrintToolVersionTask extends DefaultTask {

    @Input
    String tool

    @TaskAction
    def printToolVersion() {
        switch (tool) {
            case 'java':
                println System.getProperty("java.version")
                break
            case 'groovy':
                println GroovySystem.version
                break
            default:
                throw new IllegalArgumentException("Unknown Tool")
        }
    }
}

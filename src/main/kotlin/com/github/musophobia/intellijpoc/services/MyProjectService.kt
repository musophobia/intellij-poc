package com.github.musophobia.intellijpoc.services

import com.github.musophobia.intellijpoc.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

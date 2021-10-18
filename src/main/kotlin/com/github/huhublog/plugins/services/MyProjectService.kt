package com.github.huhublog.plugins.services

import com.intellij.openapi.project.Project
import com.github.huhublog.plugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

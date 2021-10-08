package com.github.zhaoyc1469.zhaoycautoaitemplate.services

import com.intellij.openapi.project.Project
import com.github.zhaoyc1469.zhaoycautoaitemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

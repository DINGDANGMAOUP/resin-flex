package com.dingdangmaoup.resin.flex.runConfiguration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.components.BaseState
import com.intellij.openapi.project.Project

class PluginRunConfigurationFactory(pluginRunConfigurationType: PluginRunConfigurationType) : ConfigurationFactory(pluginRunConfigurationType) {
    override fun getId(): String {
        return PluginRunConfigurationType.Companion.ID
    }

    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return PluginRunConfiguration(project, this, "Resin Pura")
    }

    override fun getOptionsClass(): Class<out BaseState> {
        return PluginRunConfigurationOptions::class.java
    }
}
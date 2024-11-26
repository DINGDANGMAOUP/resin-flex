package com.dingdangmaoup.resin.flex.runConfiguration

import com.dingdangmaoup.resin.flex.IconBundle
import com.dingdangmaoup.resin.flex.ResinBundle
import com.intellij.execution.configurations.ConfigurationTypeBase
import com.intellij.openapi.util.NotNullLazyValue

class PluginRunConfigurationType :
    ConfigurationTypeBase(
        ID, ResinBundle.message("run.configuration.display.name"), "Resin Flex run configuration type",
        NotNullLazyValue.createValue { IconBundle.ResinIcon }
    ) {
    companion object {
         const val ID = "PluginRunConfigurationType"
    }

    init {
        addFactory(PluginRunConfigurationFactory(this))
    }

}
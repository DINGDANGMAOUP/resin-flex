package com.dingdangmaoup.resin.flex.runConfiguration

import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import javax.swing.JComponent
import javax.swing.JPanel


class PluginSettingsEditor : SettingsEditor<PluginRunConfiguration>() {
    private val content: JPanel = JPanel()
    private val scriptPathField: TextFieldWithBrowseButton = TextFieldWithBrowseButton()
    override fun resetEditorFrom(configuration: PluginRunConfiguration) {
        thisLogger().warn("resetEditorFrom: $configuration")
    }

    override fun applyEditorTo(configuration: PluginRunConfiguration) {
        thisLogger().warn("applyEditorTo: $configuration")
    }

    override fun createEditor(): JComponent {
        val labeledComponent = LabeledComponent.create(scriptPathField, "Script Path")
        content.add(labeledComponent)
        return content
    }

}
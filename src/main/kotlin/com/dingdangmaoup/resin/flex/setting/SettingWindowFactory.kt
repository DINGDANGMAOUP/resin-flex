package com.dingdangmaoup.resin.flex.setting

import com.dingdangmaoup.resin.flex.ResinBundle
import com.intellij.openapi.options.SearchableConfigurable
import com.intellij.ui.components.JBPanel
import java.awt.BorderLayout
import javax.swing.BorderFactory
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JTextField

class SettingWindowFactory : SearchableConfigurable {

    override fun createComponent(): JComponent {
        val settingWindow = SettingWindow()
        return settingWindow.getContent()
    }

    override fun isModified(): Boolean {
        return true
    }

    override fun apply() {
        println("apply")
    }

    override fun getDisplayName(): String {
        return ResinBundle.message("setting.display.name")
    }

    override fun getId(): String {
        return "ResinSettingWindow"
    }

    class SettingWindow {
        private val content = JBPanel<JBPanel<*>>()

        init {
            content.layout=BorderLayout(0,20)
            content.border=BorderFactory.createEmptyBorder(20,20,20,20)
            content.add(JLabel(ResinBundle.message("login.username")),BorderLayout.PAGE_START)
            content.add(JTextField().apply {
            },BorderLayout.LINE_END)
        }

        fun getContent() = content
    }
}
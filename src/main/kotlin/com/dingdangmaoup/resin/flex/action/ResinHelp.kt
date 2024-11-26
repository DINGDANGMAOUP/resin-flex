package com.dingdangmaoup.resin.flex.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.diagnostic.thisLogger

class ResinHelp : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        thisLogger().warn("ResinHelp actionPerformed: $e")
    }
}

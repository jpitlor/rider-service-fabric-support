package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.OSProcessHandler
import com.intellij.util.io.BaseDataReader
import com.intellij.util.io.BaseOutputReader

class ProcessHandler(cli: GeneralCommandLine) : OSProcessHandler(cli) {
    // Prevents parent process handler from removing \r on Windows
    // https://intellij-support.jetbrains.com/hc/en-us/community/posts/360000616664-how-to-enable-r-in-TerminalExecutionConsole-when-running-commands-which-don-t-output-r-
    override fun readerOptions(): BaseOutputReader.Options {
        return object : BaseOutputReader.Options() {
            override fun splitToLines(): Boolean = false
            override fun sendIncompleteLines(): Boolean = true
            override fun policy(): BaseDataReader.SleepingPolicy = BaseDataReader.SleepingPolicy.BLOCKING
            override fun withSeparators(): Boolean = true
        }
    }
}
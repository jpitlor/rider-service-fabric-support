package dev.pitlor.rider_service_fabric_support.swing_components.helpers

import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

@FunctionalInterface
class TextFieldChangeListener(private val onChange: (DocumentEvent) -> Unit) : DocumentListener {
    override fun insertUpdate(e: DocumentEvent) {
        onChange(e)
    }

    override fun removeUpdate(e: DocumentEvent) {
        onChange(e)
    }

    override fun changedUpdate(e: DocumentEvent) {
        onChange(e)
    }
}
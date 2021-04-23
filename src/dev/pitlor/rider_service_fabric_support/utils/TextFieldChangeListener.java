package dev.pitlor.rider_service_fabric_support.utils;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

@FunctionalInterface
public interface TextFieldChangeListener extends DocumentListener {
	void onChange(DocumentEvent e);

	@Override
	default void insertUpdate(DocumentEvent e) {
		onChange(e);
	}

	@Override
	default void removeUpdate(DocumentEvent e) {
		onChange(e);
	}

	@Override
	default void changedUpdate(DocumentEvent e) {
		onChange(e);
	}
}

package dev.pitlor.rider_service_fabric_support;

import com.intellij.DynamicBundle;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

public class Bundle extends DynamicBundle {
	@NonNls
	private static final String BUNDLE = "strings";
	private static final Bundle INSTANCE = new Bundle();

	private Bundle() { super(BUNDLE); }

	@NotNull
	public static @Nls
	String string(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, Object... params) {
		return INSTANCE.getMessage(key, params);
	}
}

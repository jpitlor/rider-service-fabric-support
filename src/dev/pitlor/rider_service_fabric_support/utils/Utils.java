package dev.pitlor.rider_service_fabric_support.utils;

import java.util.function.Function;

public class Utils {
	public static int findIndex(String[] list, Function<String, Boolean> finder) {
		for (int i = 0; i < list.length; i++) {
			if (finder.apply(list[i])) {
				return i;
			}
		}

		return 0;
	}
}

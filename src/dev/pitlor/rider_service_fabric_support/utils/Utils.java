package dev.pitlor.rider_service_fabric_support.utils;

import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;

import java.io.File;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Function;

public class Utils {
	public static <T> int findIndex(T[] list, Function<T, Boolean> finder) {
		for (int i = 0; i < list.length; i++) {
			if (finder.apply(list[i])) {
				return i;
			}
		}

		return 0;
	}

	public static String getTildePath(VirtualFile file) {
		if (file == null) return "";

		String path = FileUtil.toSystemDependentName(file.getPath());
		return FileUtil.getLocationRelativeToUserHome(path, false);
	}

	public static VirtualFile getFile(String path) {
		Path nioPath = new File(FileUtil.expandUserHome(path)).toPath();
		return VirtualFileManager.getInstance().findFileByNioPath(nioPath);
	}

	public static VirtualFile getFile(VirtualFile parent, String name) {
		return Objects.requireNonNull(parent.findChild(name));
	}
}

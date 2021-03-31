package dev.pitlor.rider_service_fabric_support;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectFileIndex;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.ProjectScope;
import com.intellij.util.text.CharArrayUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SFUtil {
	public static List<VirtualFile> getSFFolders(Project project) {
		GlobalSearchScope scope = ProjectScope
			.getContentScope(project)
			.intersectWith(GlobalSearchScope.notScope(ProjectScope.getLibrariesScope(project)));
		List<VirtualFile> result = new ArrayList<>();

		ProjectRootManager.getInstance(project);

		return result;
	}

	public static List<String> getPublishProfiles(VirtualFile sfFolder) {
		return new ArrayList<>();
	}
}

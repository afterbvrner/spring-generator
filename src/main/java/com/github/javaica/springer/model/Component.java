package com.github.javaica.springer.model;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiDirectory;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Component {
    Project project;
    PsiDirectory location;
    PsiClass original;
    ComponentType type;
    String name;
}

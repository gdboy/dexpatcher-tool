/*
 * DexPatcher - Copyright 2015, 2016 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * DexPatcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.dexpatcher.core;

public enum Marker {

	ADD("DexAdd"),
	EDIT("DexEdit"),
	REPLACE("DexReplace"),
	REMOVE("DexRemove"),
	IGNORE("DexIgnore"),

	TAG("DexTag");

	// Annotations

	private final String className;

	Marker(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	// Annotation Elements

	public static final String ELEM_TARGET = "target";
	public static final String ELEM_TARGET_CLASS = "targetClass";
	public static final String ELEM_STATIC_CONSTRUCTOR_ACTION = "staticConstructorAction";
	public static final String ELEM_DEFAULT_ACTION = "defaultAction";
	public static final String ELEM_ONLY_EDIT_MEMBERS = "onlyEditMembers";
	public static final String ELEM_RECURSIVE = "recursive";

	// Dalvik

	public static final String TYPE_VOID = Util.getTypeDescriptorFromClass(Void.class);
	private static final String NAME_INNER_CLASS = "dalvik.annotation.InnerClass";
	public static final String TYPE_INNER_CLASS = Util.getTypeDescriptorFromName(NAME_INNER_CLASS);
	public static final String ELEM_ACCESS_FLAGS = "accessFlags";
	public static final String SIGN_STATIC_CONSTRUCTOR = "<clinit>()V";
	public static final String PACKAGE_INFO = "package-info";

}

package org.bpy.electronic.grafcet.design.utils;

import java.util.Set;
import java.util.regex.Pattern;

public class CFunctionNameValidator {
	
	// valid C keywords
    private static final Set<String> C_KEYWORDS = Set.of(
        "auto", "break", "case", "char", "const", "continue", "default", "do", "double",
        "else", "enum", "extern", "float", "for", "goto", "if", "inline", "int", "long",
        "register", "restrict", "return", "short", "signed", "sizeof", "static", "struct",
        "switch", "typedef", "union", "unsigned", "void", "volatile", "while"
    );

    // Regex for check the C name
    private static final Pattern FUNCTION_NAME_PATTERN = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*$");

    public static boolean isValidCFunctionName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        // Check syntax
        if (!FUNCTION_NAME_PATTERN.matcher(name).matches()) {
            return false;
        }
        // Check keywords
        return !C_KEYWORDS.contains(name);
    }
}

package ru.team.up.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum SupParameterType {
    STRING("String"),
    INTEGER("Integer"),
    DOUBLE("Double"),
    BOOLEAN("Boolean");

    final String name;

    /**
     * Определяем тип параметра
     * @param className
     * @return
     */
    public static SupParameterType getParameterType(String className) {
        return Arrays.stream(values()).filter(v -> v.name.equals(className))
                .findFirst().orElseThrow(RuntimeException::new);
    }
}

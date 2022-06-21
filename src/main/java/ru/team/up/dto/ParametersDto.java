package ru.team.up.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametersDto {
    private String description;
    private Object value;

    @Override
    public String toString() {
        return " " + description + value;
    }
}

package ru.team.up.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class ParametersDto {
    private String description;
    private Object value;

}

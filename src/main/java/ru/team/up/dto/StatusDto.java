package ru.team.up.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusDto {
    /**
     * Первичный ключ
     */
    private Long id;

    /**
     * Статус мероприятия: проверенно, закончено, на проверки и т.д.
     */
    private String status;

    private String SUCCESS;

    private String FAILURE;
}


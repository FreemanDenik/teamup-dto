package ru.team.up.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
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


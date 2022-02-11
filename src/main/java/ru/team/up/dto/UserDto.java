package ru.team.up.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
public class UserDto extends AccountDto{

    /**
     * Город
     */
    private String city;

    /**
     * Возраст
     */
    private Long age;

    /**
     * Информация о пользователе
     */
    private String aboutUser;

    /**
     * Интересы пользователя
     */
    private Set<InterestsDto> userInterests;

}

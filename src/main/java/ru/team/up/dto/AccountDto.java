package ru.team.up.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.management.relation.Role;

/**
 * Объект для передачи данных пользователя, админа, модератора
 */

@Data
@SuperBuilder
@NoArgsConstructor
public class AccountDto {
    /**
     * Первичный ключ
     */
    private Long id;

    /**
     * Имя
     */
    private String firstName;

    /**
     * Фамилия
     */
    private String lastName;

    /**
     * Отчество
     */
    private String middleName;

    /**
     * Логин
     */
    private String username;

    /**
     * Роль
     */
    private RoleDto role;

    /**
     * Электронная почта
     */
    private String email;
}

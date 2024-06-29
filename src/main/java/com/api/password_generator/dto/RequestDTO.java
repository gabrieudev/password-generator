package com.api.password_generator.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestDTO {
    @NotNull
    @Min(value = 1)
    private int length;

    @NotNull
    private boolean includeUppercase;

    @NotNull
    private boolean includeLowercase;

    @NotNull
    private boolean includeNumber;

    @NotNull
    private boolean includeSpecial;

}

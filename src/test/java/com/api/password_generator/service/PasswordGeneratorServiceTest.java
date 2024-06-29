package com.api.password_generator.service;

import com.api.password_generator.dto.RequestDTO;
import com.api.password_generator.dto.ResponseDTO;
import com.api.password_generator.exception.InvalidParametersException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PasswordGeneratorServiceTest {

    private RequestDTO requestDTO;

    @InjectMocks
    private PasswordGeneratorService passwordGeneratorService;

    @BeforeEach
    void setUp() {

        requestDTO = new RequestDTO();
        requestDTO.setLength(8);
        requestDTO.setIncludeNumber(true);
        requestDTO.setIncludeLowercase(true);
        requestDTO.setIncludeSpecial(true);
        requestDTO.setIncludeUppercase(true);

    }

    @Test
    @DisplayName("should generate password with success")
    void ShouldGenerateWithSuccess() {
        ResponseDTO responseDTO = passwordGeneratorService.generate(requestDTO);
        assertEquals(8, responseDTO.password().length());
    }

    @Test
    @DisplayName("should throw InvalidParametersException in the generate method")
    void shouldThrowInvalidParametersExceptionInGenerate() {
        requestDTO.setIncludeUppercase(false);
        requestDTO.setIncludeNumber(false);
        requestDTO.setIncludeSpecial(false);
        requestDTO.setIncludeLowercase(false);
        InvalidParametersException thrown = assertThrows(InvalidParametersException.class, () -> passwordGeneratorService.generate(requestDTO));
        assertEquals("You need to include a character type", thrown.getLocalizedMessage());
    }

    @Test
    @DisplayName("should include lowercase characters")
    void shouldIncludeLowercase() {
        String lowercaseChars = passwordGeneratorService.includeLowercase(requestDTO);
        assertEquals("abcdefghijklmnopqrstuvwxyz", lowercaseChars);
    }

    @Test
    @DisplayName("should not include lowercase characters")
    void shouldNotIncludeLowercase() {
        requestDTO.setIncludeLowercase(false);
        String output = passwordGeneratorService.includeLowercase(requestDTO);
        assertEquals("", output);
    }

    @Test
    @DisplayName("should include uppercase characters")
    void shouldIncludeUppercase() {
        String uppercaseChars = passwordGeneratorService.includeUppercase(requestDTO);
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", uppercaseChars);
    }

    @Test
    @DisplayName("should not include uppercase characters")
    void shouldNotIncludeUppercase() {
        requestDTO.setIncludeUppercase(false);
        String output = passwordGeneratorService.includeUppercase(requestDTO);
        assertEquals("", output);
    }

    @Test
    @DisplayName("should include numeric characters")
    void shouldIncludeNumber() {
        String numericChars = passwordGeneratorService.includeNumber(requestDTO);
        assertEquals("0123456789", numericChars);
    }

    @Test
    @DisplayName("should not include numeric characters")
    void shouldNotIncludeNumber() {
        requestDTO.setIncludeNumber(false);
        String output = passwordGeneratorService.includeNumber(requestDTO);
        assertEquals("", output);
    }

    @Test
    @DisplayName("should include spacial characters")
    void shouldIncludeSpecial() {
        String specialChars = passwordGeneratorService.includeSpecial(requestDTO);
        assertEquals("!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~", specialChars);
    }

    @Test
    @DisplayName("should not include special characters")
    void shouldNotIncludeSpecial() {
        requestDTO.setIncludeSpecial(false);
        String output = passwordGeneratorService.includeSpecial(requestDTO);
        assertEquals("", output);
    }
}
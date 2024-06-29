package com.api.password_generator.service;

import com.api.password_generator.dto.RequestDTO;
import com.api.password_generator.dto.ResponseDTO;
import com.api.password_generator.exception.InvalidParametersException;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class PasswordGeneratorService {

    public ResponseDTO generate(RequestDTO requestDTO) {
        String allowedChars = "";
        if (!requestDTO.isIncludeSpecial() && !requestDTO.isIncludeNumber() && !requestDTO.isIncludeUppercase() && !requestDTO.isIncludeLowercase()) {
            throw new InvalidParametersException("You need to include a character type");
        }
        allowedChars += includeLowercase(requestDTO);
        allowedChars += includeUppercase(requestDTO);
        allowedChars += includeNumber(requestDTO);
        allowedChars += includeSpecial(requestDTO);
        String password = RandomStringUtils.random(requestDTO.getLength(), allowedChars);
        return new ResponseDTO(password);
    }

    public String includeLowercase(RequestDTO requestDTO) {
        if (requestDTO.isIncludeLowercase()) {
            return  "abcdefghijklmnopqrstuvwxyz";
        }
        return "";
    }

    public String includeUppercase(RequestDTO requestDTO) {
        if (requestDTO.isIncludeUppercase()) {
            return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        return "";
    }

    public String includeNumber(RequestDTO requestDTO) {
        if (requestDTO.isIncludeNumber()) {
            return "0123456789";
        }
        return "";
    }

    public String includeSpecial(RequestDTO requestDTO) {
        if (requestDTO.isIncludeSpecial()) {
            return "!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~";
        }
        return "";
    }

}

package com.project.hawkezx.dto.request;

import com.project.hawkezx.util.PhoneNumber;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequestDTO {

    @NotBlank(message = "username must not be left blank")
    private String username;

    @PhoneNumber
    private String phonenumber;

    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
            message = "Email không hợp lệ")
    private String email;

    private String address;

}

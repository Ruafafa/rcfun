package model.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "用户登录数据传输对象")
public class LoginDto {

    /**
     * 手机号
     */
    @Schema(description = "手机号")
    private String phone;

    /**
     * 密码
     */
    @Schema(description = "密码")
    private String password;
}

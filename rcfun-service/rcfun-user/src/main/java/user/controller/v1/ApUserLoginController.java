package user.controller.v1;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import model.common.dtos.ResponseResultVO;
import model.user.dto.LoginDto;
import org.springframework.web.bind.annotation.*;
import user.service.ApUserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/login")
@Tag(name = "app端用户登录", description = "app端用户登录")
public class ApUserLoginController {

    private final ApUserService apUserService;
    @PostMapping("/login_auth")
    @Operation(summary = "用户登录")
    public ResponseResultVO login(@RequestBody LoginDto dto) {
        return apUserService.login(dto);
    }

    @GetMapping("/login")
    @Operation(summary = "用户登录")
    public String login1() {
        return "hihi";
    }

}

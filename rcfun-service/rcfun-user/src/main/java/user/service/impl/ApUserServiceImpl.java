package user.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import model.common.enums.AppHttpStatusEnum;
import model.common.vo.ResponseResultVO;
import model.user.dtos.LoginDto;
import model.user.pojos.ApUser;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import user.mapper.ApUserMapper;
import user.service.ApUserService;

import java.util.HashMap;
import java.util.Map;

/**
* @author Stayw33
* @description 针对表【ap_user(APP用户信息表)】的数据库操作Service实现
* @createDate 2023-12-28 19:31:26
*/
@Service
public class ApUserServiceImpl extends ServiceImpl<ApUserMapper, ApUser>
    implements ApUserService {

    @Override
    public ResponseResultVO login(LoginDto dto) {
        // 正常登录（手机号+密码登录）
        if (!StrUtil.isBlank(dto.getPhone()) && !StrUtil.isBlank(dto.getPassword())) {
            // 查询用户
            ApUser apUser = getOne(Wrappers.<ApUser>lambdaQuery().eq(ApUser::getPhone, dto.getPhone()));
            if (apUser == null) {
                // 用户不存在
                return ResponseResultVO.errorResult(AppHttpStatusEnum.DATA_NOT_EXIST, "用户不存在");
            }
            // 比对密码
            String salt = apUser.getSalt();
            String pswd = dto.getPassword();
            pswd = DigestUtils.md5DigestAsHex((pswd + salt).getBytes());
            if (!pswd.equals(apUser.getPassword())) {
                // 密码错误
                return ResponseResultVO.errorResult(AppHttpStatusEnum.LOGIN_PASSWORD_ERROR);
            }
            // 成功登录
            StpUtil.login(apUser.getId().longValue());
            Map<String, Object> map = new HashMap<>();
            return ResponseResultVO.okResult(apUser);
        } else {
            //2.游客  同样返回token  id = 0
            StpUtil.login(0L);
            return ResponseResultVO.okResult("游客登录成功");
        }
    }
}





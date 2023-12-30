package user.service;

import model.common.dtos.ResponseResultVO;
import model.user.dto.LoginDto;
import model.user.pojos.ApUser;
import com.baomidou.mybatisplus.extension.service.IService;


public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录
     * @param dto
     * @return
     */
    ResponseResultVO login(LoginDto dto);

}

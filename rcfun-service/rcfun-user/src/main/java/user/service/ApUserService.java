package user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import model.common.vo.ResponseResultVO;
import model.user.dtos.LoginDto;
import model.user.pojos.ApUser;


public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录
     * @param dto
     * @return
     */
    ResponseResultVO login(LoginDto dto);

}

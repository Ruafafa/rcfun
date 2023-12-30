package user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import model.user.pojos.ApUserFan;
import user.mapper.ApUserFanMapper;
import user.service.ApUserFanService;
import org.springframework.stereotype.Service;

/**
* @author Stayw33
* @description 针对表【ap_user_fan(APP用户粉丝信息表)】的数据库操作Service实现
* @createDate 2023-12-28 19:31:26
*/
@Service
public class ApUserFanServiceImpl extends ServiceImpl<ApUserFanMapper, ApUserFan>
    implements ApUserFanService{

}





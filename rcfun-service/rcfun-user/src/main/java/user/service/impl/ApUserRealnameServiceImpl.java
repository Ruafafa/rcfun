package user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import model.user.pojos.ApUserRealname;
import org.springframework.stereotype.Service;
import user.mapper.ApUserRealnameMapper;
import user.service.ApUserRealnameService;

/**
* @author Stayw33
* @description 针对表【ap_user_realname(APP实名认证信息表)】的数据库操作Service实现
* @createDate 2023-12-28 19:31:26
*/
@Service
public class ApUserRealnameServiceImpl extends ServiceImpl<ApUserRealnameMapper, ApUserRealname>
    implements ApUserRealnameService {

}





package user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import model.user.pojos.ApUserFollow;
import org.springframework.stereotype.Service;
import user.mapper.ApUserFollowMapper;
import user.service.ApUserFollowService;

/**
* @author Stayw33
* @description 针对表【ap_user_follow(APP用户关注信息表)】的数据库操作Service实现
* @createDate 2023-12-28 19:31:26
*/
@Service
public class ApUserFollowServiceImpl extends ServiceImpl<ApUserFollowMapper, ApUserFollow>
    implements ApUserFollowService {

}





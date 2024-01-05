package article.service.impl;

import article.mapper.ApAuthorMapper;
import article.service.ApAuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import model.article.pojos.ApAuthor;
import org.springframework.stereotype.Service;

/**
* @author Stayw33
* @description 针对表【ap_author(APP文章作者信息表)】的数据库操作Service实现
* @createDate 2024-01-04 16:57:35
*/
@Service
public class ApAuthorServiceImpl extends ServiceImpl<ApAuthorMapper, ApAuthor>
    implements ApAuthorService {

}





package article.service.impl;

import article.mapper.ApArticleContentMapper;
import article.service.ApArticleContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import model.article.pojos.ApArticleContent;
import org.springframework.stereotype.Service;

/**
* @author Stayw33
* @description 针对表【ap_article_content(APP已发布文章内容表)】的数据库操作Service实现
* @createDate 2024-01-04 16:57:35
*/
@Service
public class ApArticleContentServiceImpl extends ServiceImpl<ApArticleContentMapper, ApArticleContent>
    implements ApArticleContentService {

}





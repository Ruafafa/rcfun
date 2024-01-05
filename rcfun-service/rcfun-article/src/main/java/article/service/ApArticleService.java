package article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import model.article.dto.ArticleHomeDto;
import model.article.pojos.ApArticle;
import model.common.vo.ResponseResultVO;

/**
* @author Stayw33
* @description 针对表【ap_article(文章信息表，存储已发布的文章)】的数据库操作Service
* @createDate 2024-01-04 16:57:35
*/
public interface ApArticleService extends IService<ApArticle> {
    /**
     * 根据参数加载文章列表
     * @param loadtype 1为加载更多  2为加载最新
     * @param dto
     * @return
     */
    ResponseResultVO load(Short loadtype, ArticleHomeDto dto);

}

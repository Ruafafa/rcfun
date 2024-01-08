package article.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import model.article.dtos.ArticleHomeDto;
import model.article.pojos.ApArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Stayw33
* @description 针对表【ap_article(文章信息表，存储已发布的文章)】的数据库操作Mapper
* @createDate 2024-01-04 16:57:35
* @Entity model.article.pojos.ApArticle
*/
public interface ApArticleMapper extends BaseMapper<ApArticle> {

    public List<ApArticle> loadArticleList(@Param("dto") ArticleHomeDto dto, @Param("type") Short type);

}





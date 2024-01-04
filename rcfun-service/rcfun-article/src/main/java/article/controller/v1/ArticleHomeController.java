package article.controller.v1;

import article.service.ApArticleService;
import common.constant.ArticleConstants;
import lombok.RequiredArgsConstructor;
import model.article.dto.ArticleHomeDto;
import model.common.vo.ResponseResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/article")
public class ArticleHomeController {

    private final ApArticleService apArticleService;
    @PostMapping("/load")
    public ResponseResultVO load(@RequestBody ArticleHomeDto dto) {
        return apArticleService.load(ArticleConstants.LOADTYPE_LOAD_MORE, dto);
    }

    @PostMapping("/loadmore")
    public ResponseResultVO loadMore(@RequestBody ArticleHomeDto dto) {
        return apArticleService.load(ArticleConstants.LOADTYPE_LOAD_MORE.shortValue(), dto);
    }

    @PostMapping("/loadnew")
    public ResponseResultVO loadNew(@RequestBody ArticleHomeDto dto) {
        return apArticleService.load(ArticleConstants.LOADTYPE_LOAD_NEW.shortValue(), dto);
    }
}
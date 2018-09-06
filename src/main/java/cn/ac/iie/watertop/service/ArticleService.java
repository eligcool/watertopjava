package cn.ac.iie.watertop.service;
import cn.ac.iie.watertop.core.Service;
import cn.ac.iie.watertop.model.Article;

import java.util.List;


/**
 * Created by nlpmonkey on 2018/06/21.
 */
public interface ArticleService extends Service<Article> {

   public List<Article> applist(int classid);

}

package cn.ac.iie.watertop.service.impl;

import cn.ac.iie.watertop.dao.ArticleMapper;
import cn.ac.iie.watertop.model.Article;
import cn.ac.iie.watertop.service.ArticleService;
import cn.ac.iie.watertop.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by nlpmonkey on 2018/06/21.
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> applist(int classid) {
        List<Article> list =null;
        if(classid==0)
            list = this.findAll();
        else {
            Condition condition = new Condition(Article.class);
            //   condition.selectProperties("classifier",String.valueOf(classid));
            condition.createCriteria().andEqualTo("classifier", classid);
            list = this.findByCondition(condition);
            for(Article article:list ){
                String content= article.getNewstext();
                List<String> image= getImageSrc(content);
                if(image.size()>=3) {
                    article.setTitlepic(image.get(0));
                    article.setTitlepic2(image.get(1));
                    article.setTitlepic3(image.get(2));
                }else if(image.size()==1){
                    article.setTitlepic(image.get(0));
                    article.setTitlepic2("http://118.190.26.188/upload/img/"+(int)(1+Math.random()*(10-1+1))+".jpg");
                    article.setTitlepic3("http://118.190.26.188/upload/img/"+(int)(1+Math.random()*(10-1+1))+".jpg");
                }else if(image.size()==2){
                    article.setTitlepic(image.get(0));
                    article.setTitlepic2(image.get(1));
                    article.setTitlepic3("http://118.190.26.188/upload/img/"+(int)(1+Math.random()*(10-1+1))+".jpg");

                }else {
                    article.setTitlepic("http://118.190.26.188/upload/img/"+(int)(1+Math.random()*(10-1+1))+".jpg");
                    article.setTitlepic2("http://118.190.26.188/upload/img/"+(int)(1+Math.random()*(10-1+1))+".jpg");
                    article.setTitlepic3("http://118.190.26.188/upload/img/"+(int)(1+Math.random()*(10-1+1))+".jpg");
                    //    (int)(1+Math.random()*(10-1+1))
//http://118.190.26.188/upload/img/1.jpg
                }


            }
        }
        return list;
    }
    public static List<String> getImageSrc(String htmlCode) {
        List<String> imageSrcList = new ArrayList<String>();
        Pattern p = Pattern.compile("<img\\b[^>]*\\bsrc\\b\\s*=\\s*('|\")?([^'\"\n\r\f>]+(\\.jpg|\\.bmp|\\.eps|\\.gif|\\.mif|\\.miff|\\.png|\\.tif|\\.tiff|\\.svg|\\.wmf|\\.jpe|\\.jpeg|\\.dib|\\.ico|\\.tga|\\.cut|\\.pic)\\b)[^>]*>", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(htmlCode);
        String quote = null;
        String src = null;
        while (m.find()) {
            quote = m.group(1);

            // src=https://sms.reyo.cn:443/temp/screenshot/zY9Ur-KcyY6-2fVB1-1FSH4.png
            src = (quote == null || quote.trim().length() == 0) ? m.group(2).split("\\s+")[0] : m.group(2);
            imageSrcList.add(src);

        }
        return imageSrcList;
    }
}

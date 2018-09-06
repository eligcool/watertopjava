package cn.ac.iie.watertop.service.impl;

import cn.ac.iie.watertop.model.Articleclass;
import cn.ac.iie.watertop.service.ArticleclassService;
import cn.ac.iie.watertop.dao.ArticleclassMapper;
import cn.ac.iie.watertop.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by nlpmonkey on 2018/06/21.
 */
@Service
@Transactional
public class ArticleclassServiceImpl extends AbstractService<Articleclass> implements ArticleclassService {
    @Resource
    private ArticleclassMapper articleclassMapper;

}

package cn.ac.iie.watertop.service.impl;

import cn.ac.iie.watertop.model.Imageinfo;
import cn.ac.iie.watertop.service.ImageinfoService;
import cn.ac.iie.watertop.dao.ImageinfoMapper;
import cn.ac.iie.watertop.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by nlpmonkey on 2018/06/24.
 */
@Service
@Transactional
public class ImageinfoServiceImpl extends AbstractService<Imageinfo> implements ImageinfoService {
    @Resource
    private ImageinfoMapper imageinfoMapper;

}

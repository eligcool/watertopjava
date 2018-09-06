package cn.ac.iie.watertop.service.impl;

import cn.ac.iie.watertop.dao.AppvideoMapper;
import cn.ac.iie.watertop.model.Appvideo;
import cn.ac.iie.watertop.service.AppvideoService;
import cn.ac.iie.watertop.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by nlpmonkey on 2018/06/21.
 */
@Service
@Transactional
public class AppvideoServiceImpl extends AbstractService<Appvideo> implements AppvideoService {
    @Resource
    private AppvideoMapper appvideoMapper;

}

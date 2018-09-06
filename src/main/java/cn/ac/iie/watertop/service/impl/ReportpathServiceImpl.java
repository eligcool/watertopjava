package cn.ac.iie.watertop.service.impl;

import cn.ac.iie.watertop.dao.ReportpathMapper;
import cn.ac.iie.watertop.model.Reportpath;
import cn.ac.iie.watertop.service.ReportpathService;
import cn.ac.iie.watertop.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by nlpmonkey on 2018/08/12.
 */
@Service
@Transactional
public class ReportpathServiceImpl extends AbstractService<Reportpath> implements ReportpathService {
    @Resource
    private ReportpathMapper reportpathMapper;

}

package com.billow.common.business.sysEvent.service;

import com.billow.common.business.sysEvent.model.expand.SysEventPublishDto;

import java.util.List;

/**
 * 待发布事件
 *
 * @author liuyongtao
 * @create 2018-03-01 9:25
 */
public interface SysEventPublishService {

    SysEventPublishDto findById(String id);

    void update(SysEventPublishDto sysEventPublishDto);

    void save(SysEventPublishDto sysEventPublishDto);

    void deleteById(String id);

    List<SysEventPublishDto> findByStatus(String status);

    List<SysEventPublishDto> findByStatusAndCountLessThanEqual(String status, int count);

    void removeSysEventPublishToEventPublishLog();
}
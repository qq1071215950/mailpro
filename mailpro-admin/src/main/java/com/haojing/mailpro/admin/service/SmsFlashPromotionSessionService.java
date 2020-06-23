package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.admin.dto.SmsFlashPromotionSessionDetail;
import com.haojing.mailpro.mbg.model.SmsFlashPromotionSession;

import java.util.List;

/**
 * 限时购场次管理Service
 * @author jiange
 * @date 2020/6/23 19:48
 */
public interface SmsFlashPromotionSessionService {
    /**
     * 添加场次
     */
    int create(SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次
     */
    int update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次启用状态
     */
    int updateStatus(Long id, Integer status);

    /**
     * 删除场次
     */
    int delete(Long id);

    /**
     * 获取详情
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * 根据启用状态获取场次列表
     */
    List<SmsFlashPromotionSession> list();

    /**
     * 获取全部可选场次及其数量
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}

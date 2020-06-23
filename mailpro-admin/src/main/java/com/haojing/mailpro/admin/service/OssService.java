package com.haojing.mailpro.admin.service;

import com.haojing.mailpro.admin.dto.OssCallbackResult;
import com.haojing.mailpro.admin.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jiange
 * @date 2020/6/23 15:43
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}

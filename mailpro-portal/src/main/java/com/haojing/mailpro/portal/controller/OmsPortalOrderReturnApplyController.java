package com.haojing.mailpro.portal.controller;

import com.haojing.mailpro.common.api.CommonResult;
import com.haojing.mailpro.portal.domain.OmsOrderReturnApplyParam;
import com.haojing.mailpro.portal.service.OmsPortalOrderReturnApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 申请退货管理Controller
 * @author jiange
 * @date 2020/6/16 17:10
 */
@RestController
@Api(tags = "OmsPortalOrderReturnApplyController", description = "申请退货管理")
@RequestMapping("/returnApply")
public class OmsPortalOrderReturnApplyController {
    @Autowired
    private OmsPortalOrderReturnApplyService returnApplyService;

    @ApiOperation("申请退货")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody OmsOrderReturnApplyParam returnApply) {
        int count = returnApplyService.create(returnApply);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}

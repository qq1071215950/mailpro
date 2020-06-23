package com.haojing.mailpro.admin.controller.oms;

import com.haojing.mailpro.admin.service.OmsOrderSettingService;
import com.haojing.mailpro.common.api.CommonResult;
import com.haojing.mailpro.mbg.model.OmsOrderSetting;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 订单设置管理
 * @author jiange
 * @date 2020/6/23 17:18
 */
@Api(tags = "OmsOrderSettingController", description = "订单设置管理")
@RequestMapping("/orderSetting")
@RestController
public class OmsOrderSettingController {
    @Autowired
    private OmsOrderSettingService orderSettingService;

    @ApiOperation("获取指定订单设置")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<OmsOrderSetting> getItem(@PathVariable Long id) {
        OmsOrderSetting orderSetting = orderSettingService.getItem(id);
        return CommonResult.success(orderSetting);
    }

    @ApiOperation("修改指定订单设置")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public CommonResult update(@PathVariable Long id, @RequestBody OmsOrderSetting orderSetting) {
        int count = orderSettingService.update(id,orderSetting);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}

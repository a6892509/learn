package com.billow.product.app;

//import com.alipay.api.domain.AlipayTradePrecreateModel;

import com.billow.product.pojo.po.GoodsSpuPo;
import com.billow.product.pojo.vo.GoodsSpuVo;
import com.billow.product.service.GoodsSpuService;
import com.billow.tools.utlis.ConvertUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * spu表 前端控制器
 * </p>
 *
 * @author billow
 * @version v1.0
 * @since 2019-11-27
 */
@Api(tags = {"GoodsSpuApp"}, value = "spu表")
@RestController
@RequestMapping("/goodsSpuApp")
public class GoodsSpuApp {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private GoodsSpuService goodsSpuService;

    @ApiOperation(value = "根据id查询spu表数据")
    @GetMapping(value = "/getById/{id}")
    public GoodsSpuVo getById(@PathVariable("id") Long id) {
        GoodsSpuPo po = goodsSpuService.getById(id);
        return ConvertUtils.convert(po, GoodsSpuVo.class);
    }
}

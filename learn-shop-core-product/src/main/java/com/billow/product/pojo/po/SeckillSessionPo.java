package com.billow.product.pojo.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.billow.mybatis.pojo.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalTime;

/**
 * <p>
 * 限时购场次表。用于存储限时购场次的信息，在一天中，一个限时购活动会有多个不同的活动时间段。
 * </p>
 *
 * @author billow
 * @since 2021-08-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sms_seckill_session")
@ApiModel(value="SeckillSessionPo对象", description="限时购场次表。用于存储限时购场次的信息，在一天中，一个限时购活动会有多个不同的活动时间段。")
public class SeckillSessionPo extends BasePo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "场次名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "每日开始时间")
    @TableField("start_time")
    private LocalTime startTime;

    @ApiModelProperty(value = "每日结束时间")
    @TableField("end_time")
    private LocalTime endTime;

    @ApiModelProperty(value = "启用状态：0->不启用；1->启用")
    @TableField("status")
    private Integer status;


}

package com.billow.product.pojo.cache;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * <p>
 * 限时购场次表。用于存储限时购场次的信息，在一天中，一个限时购活动会有多个不同的活动时间段信息.
 * </p>
 *
 * @author billow
 * @version v1.0
 * @since 2021-08-27
 */
@Data
@Accessors(chain = true)
public class SeckillSessionCacheDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "场次名称")
    private String name;

    @ApiModelProperty(value = "每日开始时间")
    private LocalTime startTime;

    @ApiModelProperty(value = "每日结束时间")
    private LocalTime endTime;

    @ApiModelProperty(value = "启用状态：0->不启用；1->启用")
    private Integer status;


}

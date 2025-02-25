package com.billow.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liuyongtao
 * @create 2018-04-27 12:28
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class BasePo extends BasePage implements Serializable {

    // 主键id
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    // 创建人
    @TableField(value = "creator_code", fill = FieldFill.INSERT)
    private String creatorCode;
    // 创建人
    @TableField(value = "updater_code", fill = FieldFill.INSERT_UPDATE)
    private String updaterCode;
    // 创建时间
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;
    // 更新时间
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    // 有效标志
    @TableField(value = "valid_ind", fill = FieldFill.INSERT)
    private Boolean validInd;
}
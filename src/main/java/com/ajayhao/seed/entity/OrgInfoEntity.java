package com.ajayhao.seed.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机构信息
 * </p>
 *
 * @author Ajay Hao
 * @since 2021-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ORG_INFO")
public class OrgInfoEntity extends Model<OrgInfoEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 机构Id
     */
    @TableField("ORG_ID")
    private BigDecimal orgId;

    /**
     * 机构名称
     */
    @TableField("ORG_NAME")
    private String orgName;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

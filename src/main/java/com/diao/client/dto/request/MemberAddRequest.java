package com.diao.client.dto.request;

import com.diao.client.entity.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 会员新增入参
 * @author dxf
 */
@Data
public class MemberAddRequest extends BaseEntity {
    @NotNull(message = "手机号不能为空")
    private String mobile;

    private String openId;

    private String province;

    private String storeId;

    private String city;

    private String address;
}

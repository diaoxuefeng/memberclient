package com.diao.client.dto.response;

import com.diao.client.entity.BaseEntity;
import lombok.Data;

@Data
public class MemberResponse extends BaseEntity {

    private String mobile;

    private String openId;

    private String province;

    private String storeId;

    private String city;

    private String address;
}

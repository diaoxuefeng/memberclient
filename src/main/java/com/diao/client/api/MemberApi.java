package com.diao.client.api;

import com.diao.base.dto.RestRequest;
import com.diao.base.dto.RestResponse;
import com.diao.client.dto.request.MemberAddRequest;
import com.diao.client.dto.response.CommonResponse;
import com.diao.client.dto.response.MemberResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "/member-server")
public interface MemberApi {

    /**
     * 会员新增
     * @param restRequest
     * @return
     */
    @RequestMapping(value = "/addMember")
    public RestResponse<MemberResponse> addMember(@Validated @RequestBody RestRequest<MemberAddRequest> restRequest);
}

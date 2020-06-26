package com.abu.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 测试请求数据类
 *
 * @author spring-cloud-template-nacos-archetype
 * @date 2019/11/19 10:09 AM
 */
@ApiModel("测试请求数据类")
@Data
public class FeignTestRequest {

    /**
     * 参数1 <br> 非必填 <br>
     */
    @ApiModelProperty(value = "参数1", dataType = "String", required = false)
    private String param1;
    /**
     * 参数2<br> 必填 <br>
     */
    @ApiModelProperty(value = "参数2", dataType = "String", required = true)
    private Integer param2;

}

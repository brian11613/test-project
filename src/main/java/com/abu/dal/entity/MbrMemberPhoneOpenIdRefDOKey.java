package com.abu.dal.entity;

import lombok.Data;

@Data
public class MbrMemberPhoneOpenIdRefDOKey {
    /**
     * 字段: id 主键
     */
    private Long id;

    /**
     * 字段: hashValuePhone 分区键。根据手机号取得的哈希值
     */
    private Integer hashValuePhone;
}
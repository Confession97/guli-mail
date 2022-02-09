package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @author xiangxiao
 * @create 2022-02-09-9:31
 */
@Data
public class AttrRespVo extends AttrVo {

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;
}

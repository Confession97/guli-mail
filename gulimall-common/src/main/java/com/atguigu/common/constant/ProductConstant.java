package com.atguigu.common.constant;

/**
 * @author xiangxiao
 * @create 2022-02-09-11:04
 */
public class ProductConstant {
    public enum  AttrEnum{
        ATTR_TYPE_BASE(1,"基本属性"),ATTR_TYPE_SALE(0,"销售属性");
        private int code;
        private String message;

        AttrEnum(int code,String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}

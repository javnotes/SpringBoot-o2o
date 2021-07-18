package cn.vuffy.o2o.exceptions;

import cn.vuffy.o2o.entity.ShopCategory;

public class ShopCategoryOperationException extends RuntimeException {

    public ShopCategoryOperationException(String msg) {
        super(msg);
    }
}

package cn.vuffy.o2o.entity;

import java.util.Date;

/**
 * 某店铺某商品的销售量，相当也是顾客消费记录
 */
public class ProductSellDaily {
    // 哪天的销量，精确到天
    private Date createTime;
    // 销量
    private Integer total;
    // 商品信息实体类
    private cn.vuffy.o2o.entity.Product product;
    // 店铺信息实体类
    private cn.vuffy.o2o.entity.Shop shop;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public cn.vuffy.o2o.entity.Product getProduct() {
        return product;
    }

    public void setProduct(cn.vuffy.o2o.entity.Product product) {
        this.product = product;
    }

    public cn.vuffy.o2o.entity.Shop getShop() {
        return shop;
    }

    public void setShop(cn.vuffy.o2o.entity.Shop shop) {
        this.shop = shop;
    }
}

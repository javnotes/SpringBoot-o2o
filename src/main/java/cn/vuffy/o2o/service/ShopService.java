package cn.vuffy.o2o.service;

import cn.vuffy.o2o.dto.ImageHolder;
import cn.vuffy.o2o.dto.ShopExecution;
import cn.vuffy.o2o.entity.Shop;
import cn.vuffy.o2o.exceptions.ShopOperationException;

public interface ShopService {

  /**
   * 根据 shopCondition 返回相应列表店铺列表
   * @param: [shopCondition, pageIndex, pageSize]
   * @return: cn.vuffy.o2o.dto.ShopExecution
   * @author vuffy
   * @date: 2021/6/5 5:08 下午
   */
  ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);

  /**
   * 注册店铺信息 fileName 文件名, InputStream 无法获取文件名 重构前： ShopExecution addShop(Shop shop, File file); //
   * 可以直接传入 InputStream
   *
   * @param: [shop, shopImgInputStream, fileName]
   * @return: cn.vuffy.o2o.dto.ShopExecution
   * @author vuffy
   * @date: 2021/5/30 5:30 下午
   */
  ShopExecution addShop(Shop shop, ImageHolder imageHolder)
      throws ShopOperationException;

  /**
   * 通过店铺 id 获取店铺信息
   *
   * @param: [shopId]
   * @return: cn.vuffy.o2o.entity.Shop
   * @author vuffy
   * @date: 2021/5/30 5:30 下午
   */
  Shop getShopById(long shopId);

  /**
   * 更新店铺全信息，包括店铺图片
   *
   * @param: [shop, shopImgInputStream]，根据传入的 shop 进行修改
   * @return: cn.vuffy.o2o.dto.ShopExecution
   * @author vuffy
   * @date: 2021/5/30 5:30 下午
   */
  ShopExecution modifyShop(Shop shop, ImageHolder imageHolder)
      throws ShopOperationException;
}

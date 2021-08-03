package cn.vuffy.o2o.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PathUtil {

    private static String seperator = System.getProperty("file.separator");

    private static String winPath;

    private static String macPath;

    private static String linuxPath;

    private static String shopPath;

    private static String headLinePath;

    private static String shopCategoryPath;

    @Value("${win.base.path}")
    public void setWinPath(String winPath) {
        PathUtil.winPath = winPath;
    }

    @Value("${mac.base.path}")
    public void setMacPath(String macPath) {
        PathUtil.macPath = macPath;
    }

    @Value("${linux.base.path}")
    public void setLinuxPath(String linuxPath) {
        PathUtil.linuxPath = linuxPath;
    }

    @Value("${shop.relevant.path}")
    public void setShopPath(String shopPath) {
        PathUtil.shopPath = shopPath;
    }

    @Value("${headline.relevant.path}")
    public void setHeadLinePath(String headLinePath) {
        PathUtil.headLinePath = headLinePath;
    }

    @Value("${shopcategory.relevant.path}")
    public void setShopCategoryPath(String shopCategoryPath) {
        PathUtil.shopCategoryPath = shopCategoryPath;
    }

    public static String getImageBasePath() {
        String os = System.getProperty("os.name");
        String bathPath = "";

        if (os.toLowerCase().startsWith("win")) {
            bathPath = winPath;
        } else if (os.toLowerCase().startsWith("mac")) {
            bathPath = macPath;
        } else {
            // Linux 路径，在阿里云中，需先创建该路径
            // bathPath = "/home/o2o/image"
            bathPath = linuxPath;
        }
        bathPath = bathPath.replace("/", seperator);
        return bathPath;
    }

    public static String getShopImagePath(long shopId) {
//        String imagePath = "/upload/images/item/shop/" + shopId + "/";
        String imagePath = shopPath + shopId + "/";
        return imagePath.replace("/", seperator);
    }

    public static String getHeadLinePath(long shopId) {
        String imagePath = headLinePath + shopId + "/";
        return imagePath.replace("/", seperator);
    }

    public static String getShopCategoryPath(long shopId) {
        String imagePath = shopCategoryPath + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
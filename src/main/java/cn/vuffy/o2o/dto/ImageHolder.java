package cn.vuffy.o2o.dto;

import java.io.InputStream;

/**
 * @author vuffy
 * @version 1.0
 * @description: TODO
 * @date 2021/6/16 5:36 上午
 */
public class ImageHolder {

    private String imageName;
    private InputStream image;

    public ImageHolder(String imageName, InputStream image) {
        this.imageName = imageName;
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }
}
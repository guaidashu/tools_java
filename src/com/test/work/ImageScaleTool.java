package com.test.work;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

/**
 * @Author: yy
 * @Date: 18-11-11 16:43
 * @Description:
 **/
public class ImageScaleTool {

    public ImageScaleTool() {
    }

    /**
     * @param file
     * @return
     */
    public static int[] getImageSize(File file) {
        InputStream inputStream = null;
        BufferedImage bufferedImage = null;
        int[] result = {0, 0};
        try {
            // get InputStream from file
            inputStream = new FileInputStream(file);
            // get imageBuffered Obj from inputStream
            bufferedImage = ImageIO.read(inputStream);
            // get image size
            result[0] = bufferedImage.getWidth();
            result[1] = bufferedImage.getHeight();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @param imgOriginSrc
     * @param imgAimSrc
     * @param param        this param is a map
     *                     {
     *                     "type": 1(default)
     *                     # If type is 1, the program will scale according to proportion.
     *                     # If type is 2, the program will scale according to the param which you given below
     *                     "targetWidth": target image width
     *                     "targetHeight": target image height
     *                     }
     */
    public static void scaleImage(String imgOriginSrc, String imgAimSrc, Map<String, Object> param) {
        // judge operation type which will do
        int type = filterTypeObj(param.get("type"));
    }

    /**
     * @param type
     * @return A Integer converted from param(type)
     */
    public static int filterTypeObj(Object type) {
        int result = 0;
        if (type instanceof Integer) {
            result = (Integer) type;
        }
        return result;
    }

}

package cn.ch1jia2.erp.util;

/**
 * Created by wangdj on 2016/7/7.
 */
public class MapUtil {

    /**
     * 测试两个经纬度之间的距离
     * @param lng1 车主当前位置经度
     * @param lat1 车主当前位置纬度
     * @param lng2 门店位置经度
     * @param lat2 门店位置纬度
     * @return
     */
    public static double getDistance(double lng1,double lat1,double lng2,double lat2){
        double radLat1 = Math.toRadians(lat1);
        double radLat2 = Math.toRadians(lat2);
        double a = radLat1 - radLat2;
        double b = Math.toRadians(lng1) - Math.toRadians(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1)
                * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * 6378137.0;// 取WGS84标准参考椭球中的地球长半径(单位:m)
        s = Math.round(s * 10000) / 10000;
        return s;
    }
}

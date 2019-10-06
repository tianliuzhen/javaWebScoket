package com.aaa.alipay;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091300502654";//例：2016082600317257
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCD29FgN9NFs7MO4gSkK+NCohcusOJid5SLqyDbwLf9eCQERfEXtS3R3w6owMiqnM3DpES3AAC0uZmdCAZkci9mrk9CMGHfOSxYUfoT1zhXKtD6ZCQsw0b+QdqnEuGQ8P3PnE4tLToLOKTsEdYwIqbZWdTIfnQyBuQLhJfjS1ErWxmTt2jTcEUGnySG+mpZxJlxGGRJn10lBraImu4nQtxYrVq9VVy93QcxYU/XViuigPDtP9dVR+DZPWovZMiXxci5ucbX4AUaGVBAvIArLPla6Nbag5U++UxLcE3jtTw59YahwIn1XySN0IbvC6wUaSGZZxm+hy9AAmlMusjNxBNNAgMBAAECggEAbOdw1ndFF5yDlxc1niJhYPdfDkEpuQnqtjBwww845zADD0R1C4+oeF4yTU5sbf10NNHHrx1hd+KS7Q9juDJW1AfDjndHXoZqCcgrM5feAKBsWWG8PvxJ9lWNsc/2XS+tcXs3Vji0Z/Awxok0zizQgVOgWreWYHswfhLVH/Vk5Nj5FU7x6s9jgYPgUrFD58f2B4uJsKO0kpBegzgAO8C6eV7qQITiuiL7ws6QvgQ98GdL2K746gfgBi2N6OtXRYHb/w6qcV5NUJAv92rchqHSzfXIwjnWH+p2bimWGt9OodE9ERF8F68CbfT0CNqSOWdRYnFJGUn4uPWPLibiTVcgQQKBgQDCv5IHkoG+khcsm5p8Xz0ShUH76ChYVWBtHpv8KH+orC3vpqZa05exF2KsYtL4lybG3vq4l2ThOo7IldoaPmvbTE5p2witWsSmYnZvMChR1WcW7gOQSOpIV1HrSvndgFQWYgRthHWnfZXLuei/n0y8ZPDGfSdzoUJfrvKXy/85HwKBgQCtVJmUIpS1vwiaW3ArAOfK9ACz64D7oAc310/SpiU+cnz6yxdE0HCEdh1roAAnXmpznAdwgEkb2tptIMzkwOdaKhibuFD0ZRC1CCUhUZhl6hxRGfeK2vcSqz761Bv1dZoHIQTFJbd/MlKiZbmJAUlx8onyCrlR0O3bSYekAlRqEwKBgQCIj9VSwgWBIOhnO2YFOLOWvSMcBhvkdVn8qq4vECcUnEhJ+M5GeoGwiPmEcHgIIdXrNokRz/fJiEp/lbUvGf5/9O43hIR9K10iX4E1Tsu3NrHnfle5YagHulOTbyvviwFsAKeiNHRcUtAr3926IXap1Q6R4Uk86COm/QLYNxBteQKBgGjk8tBYISDgDCfFwFr2AFCtW6OGmRcuIFAl6DO1woJJLONldp55ei5fgKx6Nr2cgNWYDlSB/jxyNI+oMvcY2qmRIjVS1QMiCntUA4xnYdADXsGh8lHA85cDtWh8ZrMkSWOZEtbwXV0HqkSHRUHpWnYv7lVhMgeWZeu4UvLpSgarAoGAAak49lZweIba4iv8bgPql3BuGnvWWxh1U8jEZyo3UkY/tp5wcY4rs4ZDgO6aCbSSeCEHHnlnXdjvqYf/Red3QbPBsHtQAUROHHEOhCpZI2cu7W6plM19HsJVWcoSJ2UjvLkGs2Ic5V/EQfI95yOh0nfbHHR/7wZtylaIkw7pOL0=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2+aRmZr/Mu0Ysi2d3iudY2iF/pouNtjXIqlRF/360OSFDPn+wVgCFyEpGaFEHpGfLkJPau3pNRva3GMmn5ARjetWfHE7fD8qN1IFX5HSLQGeBf/ipsHtVcJBf11GUKMyuyTnSpRAkdeML6YksDgTBiSKNMpOGbRCnn3nn5BcdcqiBcz7pz03qZlbsG8i9vPHa7kMcpat1ZV/gGh05P0zJSHzlyoSNuPLSt41r0rc4xEOoyhl7zG5K/P9weDTZWpOEutpV6hGLyYNWBtv3gSPd1yODgYsDfhDTV9k9hHkr7FZQQzx6T26YdI/4+bytQD5q4nxz3QcIi73WvS6aMeGMQIDAQAB";
    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 返回的时候此页面不会返回到用户页面，只会执行你写到控制器里的地址
     */
   public static String notify_url = "https://www.baidu.com/";   //服务器通知，
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 此页面是同步返回用户页面，也就是用户支付后看到的页面，上面的notify_url是异步返回商家操作，谢谢
     * 要是看不懂就找度娘，或者多读几遍，或者去看支付宝第三方接口API，不看API直接拿去就用，遇坑不怪别人
     */
  public static String return_url = "https://www.baidu.com/";  //页面跳转通知
   
   /*如果是普通支付类接口调用不需要配置这两个参数的 
   单纯的支付接口是不需要配置这两个信息的，简单来说就是：应用网关是用于接收口碑或是生活号的信息的，授权回调地址是第三方授权或是用户信息授权使用的，如果用不到是可以不配置的！
   */
   
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "gbk";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 日志地址
    public static String log_path = "c:/logs/";
    // ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * 
     * @param sWord
     *            要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_"
                    + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

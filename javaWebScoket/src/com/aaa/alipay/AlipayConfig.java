package com.aaa.alipay;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // �����������������������������������Ļ�����Ϣ������������������������������

    // Ӧ��ID,����APPID���տ��˺ż�������APPID��Ӧ֧�����˺�
    public static String app_id = "2016091300502654";//����2016082600317257
    // �̻�˽Կ������PKCS8��ʽRSA2˽Կ
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCD29FgN9NFs7MO4gSkK+NCohcusOJid5SLqyDbwLf9eCQERfEXtS3R3w6owMiqnM3DpES3AAC0uZmdCAZkci9mrk9CMGHfOSxYUfoT1zhXKtD6ZCQsw0b+QdqnEuGQ8P3PnE4tLToLOKTsEdYwIqbZWdTIfnQyBuQLhJfjS1ErWxmTt2jTcEUGnySG+mpZxJlxGGRJn10lBraImu4nQtxYrVq9VVy93QcxYU/XViuigPDtP9dVR+DZPWovZMiXxci5ucbX4AUaGVBAvIArLPla6Nbag5U++UxLcE3jtTw59YahwIn1XySN0IbvC6wUaSGZZxm+hy9AAmlMusjNxBNNAgMBAAECggEAbOdw1ndFF5yDlxc1niJhYPdfDkEpuQnqtjBwww845zADD0R1C4+oeF4yTU5sbf10NNHHrx1hd+KS7Q9juDJW1AfDjndHXoZqCcgrM5feAKBsWWG8PvxJ9lWNsc/2XS+tcXs3Vji0Z/Awxok0zizQgVOgWreWYHswfhLVH/Vk5Nj5FU7x6s9jgYPgUrFD58f2B4uJsKO0kpBegzgAO8C6eV7qQITiuiL7ws6QvgQ98GdL2K746gfgBi2N6OtXRYHb/w6qcV5NUJAv92rchqHSzfXIwjnWH+p2bimWGt9OodE9ERF8F68CbfT0CNqSOWdRYnFJGUn4uPWPLibiTVcgQQKBgQDCv5IHkoG+khcsm5p8Xz0ShUH76ChYVWBtHpv8KH+orC3vpqZa05exF2KsYtL4lybG3vq4l2ThOo7IldoaPmvbTE5p2witWsSmYnZvMChR1WcW7gOQSOpIV1HrSvndgFQWYgRthHWnfZXLuei/n0y8ZPDGfSdzoUJfrvKXy/85HwKBgQCtVJmUIpS1vwiaW3ArAOfK9ACz64D7oAc310/SpiU+cnz6yxdE0HCEdh1roAAnXmpznAdwgEkb2tptIMzkwOdaKhibuFD0ZRC1CCUhUZhl6hxRGfeK2vcSqz761Bv1dZoHIQTFJbd/MlKiZbmJAUlx8onyCrlR0O3bSYekAlRqEwKBgQCIj9VSwgWBIOhnO2YFOLOWvSMcBhvkdVn8qq4vECcUnEhJ+M5GeoGwiPmEcHgIIdXrNokRz/fJiEp/lbUvGf5/9O43hIR9K10iX4E1Tsu3NrHnfle5YagHulOTbyvviwFsAKeiNHRcUtAr3926IXap1Q6R4Uk86COm/QLYNxBteQKBgGjk8tBYISDgDCfFwFr2AFCtW6OGmRcuIFAl6DO1woJJLONldp55ei5fgKx6Nr2cgNWYDlSB/jxyNI+oMvcY2qmRIjVS1QMiCntUA4xnYdADXsGh8lHA85cDtWh8ZrMkSWOZEtbwXV0HqkSHRUHpWnYv7lVhMgeWZeu4UvLpSgarAoGAAak49lZweIba4iv8bgPql3BuGnvWWxh1U8jEZyo3UkY/tp5wcY4rs4ZDgO6aCbSSeCEHHnlnXdjvqYf/Red3QbPBsHtQAUROHHEOhCpZI2cu7W6plM19HsJVWcoSJ2UjvLkGs2Ic5V/EQfI95yOh0nfbHHR/7wZtylaIkw7pOL0=";
    // ֧������Կ,�鿴��ַ��https://openhome.alipay.com/platform/keyManage.htm
    // ��ӦAPPID�µ�֧������Կ��
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2+aRmZr/Mu0Ysi2d3iudY2iF/pouNtjXIqlRF/360OSFDPn+wVgCFyEpGaFEHpGfLkJPau3pNRva3GMmn5ARjetWfHE7fD8qN1IFX5HSLQGeBf/ipsHtVcJBf11GUKMyuyTnSpRAkdeML6YksDgTBiSKNMpOGbRCnn3nn5BcdcqiBcz7pz03qZlbsG8i9vPHa7kMcpat1ZV/gGh05P0zJSHzlyoSNuPLSt41r0rc4xEOoyhl7zG5K/P9weDTZWpOEutpV6hGLyYNWBtv3gSPd1yODgYsDfhDTV9k9hHkr7FZQQzx6T26YdI/4+bytQD5q4nxz3QcIi73WvS6aMeGMQIDAQAB";
    // �������첽֪ͨҳ��·�� ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
    /**
     * ���ص�ʱ���ҳ�治�᷵�ص��û�ҳ�棬ֻ��ִ����д����������ĵ�ַ
     */
   public static String notify_url = "https://www.baidu.com/";   //������֪ͨ��
    // ҳ����תͬ��֪ͨҳ��·�� ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
    /**
     * ��ҳ����ͬ�������û�ҳ�棬Ҳ�����û�֧���󿴵���ҳ�棬�����notify_url���첽�����̼Ҳ�����лл
     * Ҫ�ǿ��������Ҷ�����߶�����飬����ȥ��֧�����������ӿ�API������APIֱ����ȥ���ã����Ӳ��ֱ���
     */
  public static String return_url = "https://www.baidu.com/";  //ҳ����ת֪ͨ
   
   /*�������֧ͨ����ӿڵ��ò���Ҫ���������������� 
   ������֧���ӿ��ǲ���Ҫ������������Ϣ�ģ�����˵���ǣ�Ӧ�����������ڽ��տڱ���������ŵ���Ϣ�ģ���Ȩ�ص���ַ�ǵ�������Ȩ�����û���Ϣ��Ȩʹ�õģ�����ò����ǿ��Բ����õģ�
   */
   
    // ǩ����ʽ
    public static String sign_type = "RSA2";
    // �ַ������ʽ
    public static String charset = "gbk";
    // ֧��������
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // ��־��ַ
    public static String log_path = "c:/logs/";
    // �����������������������������������Ļ�����Ϣ������������������������������

    /**
     * д��־��������ԣ�����վ����Ҳ���ԸĳɰѼ�¼�������ݿ⣩
     * 
     * @param sWord
     *            Ҫд����־����ı�����
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

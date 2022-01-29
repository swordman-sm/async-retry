package vip.avelp.retry.core.serializer;

public interface AsyncRetrySerializer {

    /**
     * 序列化
     *
     * @param object
     * @return
     */
    String serialize(Object object);

    /**
     * 反序列化
     *
     * @param value
     * @param clazz
     * @return
     */
    Object deserialize(String value, Class<?> clazz);

}

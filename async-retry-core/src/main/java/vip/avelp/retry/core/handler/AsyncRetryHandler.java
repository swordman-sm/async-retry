package vip.avelp.retry.core.handler;

public interface AsyncRetryHandler {

    /**
     * 返回执行器自定义名称
     *
     * @return
     */
    String name();

    /**
     * 返回class所在的package路径
     *
     * @return
     */
    default String classPath() {
        return this.getClass().getPackage().getName();
    }

    /**
     * 类名
     *
     * @return
     */
    default String className() {
        return this.getClass().getSimpleName();
    }

    /**
     * 初始化延迟时间
     *
     * @return
     */
    default Integer initialDelay() {
        return 100;
    }

    /**
     * 最大重试次数
     *
     * @return
     */
    default Integer maxRetryTimes() {
        return 5;
    }

    /**
     * 忽略错误继续执行
     *
     * @return
     */
    default Boolean ignoreError() {
        return Boolean.FALSE;
    }

}

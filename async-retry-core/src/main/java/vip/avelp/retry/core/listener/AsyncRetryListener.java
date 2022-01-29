package vip.avelp.retry.core.listener;

import vip.avelp.retry.core.context.AsyncRetryContext;

public interface AsyncRetryListener {

    /**
     * 手动触发时通道
     *
     * @param ctx
     */
    void onTrigger(AsyncRetryContext ctx);

    /**
     * 执行结果匹配通道
     *
     * @param ctx
     */
    void onComplete(AsyncRetryContext ctx);

    /**
     * 异常返回匹配通道
     *
     * @param ctx
     */
    void onException(AsyncRetryContext ctx);
}

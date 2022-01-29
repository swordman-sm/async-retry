package vip.avelp.retry.core.context;

import lombok.Data;
import vip.avelp.retry.core.handler.AsyncRetryHandler;

@Data
public class AsyncRetryContext {

    private AsyncRetryHandler asyncRetryHandler;

    private Integer retryTimes;

    private Object args;

    /**
     * method return result
     */
    private Object result;
    /**
     * method occur error
     */
    private Exception exception;

    public AsyncRetryContext(AsyncRetryHandler asyncRetryHandler, Object args) {
        this.asyncRetryHandler = asyncRetryHandler;
        this.args = args;
    }

    public AsyncRetryContext(AsyncRetryHandler asyncRetryHandler, Integer retryTimes, Object args) {
        this.asyncRetryHandler = asyncRetryHandler;
        this.retryTimes = retryTimes;
        this.args = args;
    }
}

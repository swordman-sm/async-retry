package vip.avelp.retry.core.event;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Data
public class AsyncRetryEvent implements Serializable {

    /**
     * 任务Id
     */
    private String taskId;
    /**
     * 任务群组名
     */
    private String group;
    /**
     * 参数
     */
    private String params;
    /**
     * 任务状态
     */
    private Integer status;
    /**
     * 已重试次数
     */
    private Integer retryTimes;
    /**
     * 任务备注
     */
    private String remarks;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}

package org.dync.datasourcestrategy;

import org.dync.bean.Video;
import org.dync.bean.VideoSearch;

import java.util.List;

public interface IDataSourceStrategy {

    /***
     * 搜索 获取资源策略
     * @param key 关键字
     * */
    public List<VideoSearch> search(String key);

    /***
     * 获取播放列表 具体的集
     * @param url
     * */
    public List<Video> playList(String url);

}

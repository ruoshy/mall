package cn.ousky.small.seriver;

import cn.ousky.small.entity.Store;
import cn.ousky.small.mapper.IStoreMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StoreSeriver {

    @Resource
    private IStoreMapper storeMapper;

    /**
     * 通过id查找店铺记录
     *
     * @param id
     * @return
     */
    public Store findById(int id) {
        return storeMapper.findById(id);
    }
}

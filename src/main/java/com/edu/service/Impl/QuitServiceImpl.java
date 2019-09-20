package com.edu.service.Impl;

import com.edu.mapper.QuitMapper;
import com.edu.pojo.Quits;
import com.edu.service.QuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/20 16:08
 * @Description:
 */
@Service
public class QuitServiceImpl implements QuitService {
    @Autowired
    private QuitMapper quitMapper;

    /**
     * 查询所有的离职申请
     * @return  返回值为离职申请的集合
     */
    @Override
    public List<Quits> findAllQuit() {
        return quitMapper.findAllQuit();
    }

    /**
     * 添加新的离职申请
     * @param quit  参数类型为新的离职申请
     * @return  返回值为添加的结果
     */
    @Override
    public int saveQuit(Quits quit) {
        return quitMapper.saveQuit(quit);
    }

    /**
     * 根据id查询对象的离职申请
     * @param quId  参数类型为查询对象的id
     * @return  返回值为查询对象的离职申请
     */
    @Override
    public Quits selectQuitById(int quId) {
        return quitMapper.selectQuitById(quId);
    }

    /**
     * 修改离职申请
     * @param quit  参数类型为被修改对象的离职申请
     * @return  返回值为修改结果
     */
    @Override
    public int updateQuit(Quits quit) {
        return quitMapper.updateQuit(quit);
    }

    /**
     * 删除所选对象的离职申请
     * @param ids   参数类型为所选对象的id集合
     * @return  返回值为删除结果
     */
    @Override
    public int deleteQuit(List<Integer> ids) {
        return quitMapper.deleteQuit(ids);
    }
}

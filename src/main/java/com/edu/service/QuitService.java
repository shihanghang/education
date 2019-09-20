package com.edu.service;

import com.edu.pojo.Quits;

import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/20 16:07
 * @Description:
 */
public interface QuitService {
    /**
     * 查询所有的离职申请
     * @return  返回值为离职申请的集合
     */
    public List<Quits> findAllQuit();

    /**
     * 添加新的离职申请
     * @param quit  参数类型为新的离职申请
     * @return  返回值为添加的结果
     */
    public int saveQuit(Quits quit);

    /**
     * 根据id查询对象的离职申请
     * @param quId  参数类型为查询对象的id
     * @return  返回值为查询对象的离职申请
     */
    public Quits selectQuitById(int quId);

    /**
     * 修改离职申请
     * @param quit  参数类型为被修改对象的离职申请
     * @return  返回值为修改结果
     */
    public int updateQuit(Quits quit);

    /**
     * 删除所选对象的离职申请
     * @param ids   参数类型为所选对象的id集合
     * @return  返回值为删除结果
     */
    public int deleteQuit(List<Integer> ids);
}

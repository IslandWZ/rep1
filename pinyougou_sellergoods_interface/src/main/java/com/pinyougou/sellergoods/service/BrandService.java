package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 *  品牌接口
 */
public interface BrandService {

    //查询所有
    public List<TbBrand> findAll();

    /**
     * 品牌分页
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);

    /**
     * 增加方法
     * @param brand
     */
    public void add(TbBrand brand);

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     *  修改
     * @param brand
     */
    public void update(TbBrand brand);

    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 品牌分页(根据条件查询)
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(TbBrand brand ,int pageNum, int pageSize);

    /**
     * 返回下拉列表数据
     * @return
     */
    public List<Map> selectOptionList();

}

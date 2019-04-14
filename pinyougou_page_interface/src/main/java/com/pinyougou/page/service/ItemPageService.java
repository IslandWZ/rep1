package com.pinyougou.page.service;

public interface ItemPageService {

    /**
     * 生成商品详细页
     * @param goodIds
     * @return
     */
    public boolean genItemHtml(Long goodIds);


    /**
     * 删除商品详细页
     * @param goodIds
     * @return
     */
    public boolean deleteItemHtml(Long[] goodIds);
}

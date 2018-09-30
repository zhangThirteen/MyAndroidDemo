package com.zyy.myandroiddemo.base;

import android.content.Context;

/**
 * @author zyy
 * @date on 2018/9/30
 * @describe
 */

public interface BaseView {

    Context getContext();

    /**
     * 显示正在加载load view
     */
    void showLoading();

    /**
     * 隐藏正在加载的view
     **/
    void hideLoading();


    /**
     * 提示信息
     * @param msg 需要显示的提示
     */
    void showToast(String msg);

    /**
     * @param error  错误信息提示
     */
    void showError(String error);

}

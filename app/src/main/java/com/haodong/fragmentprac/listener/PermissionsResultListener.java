package com.haodong.fragmentprac.listener;

/**
 * @author linghailong
 * @date on 2018/11/4
 * @email 105354999@qq.com
 * @describe :
 */
public interface PermissionsResultListener {

    void onPermissionGranted();

    void onPermissionDenied();
}

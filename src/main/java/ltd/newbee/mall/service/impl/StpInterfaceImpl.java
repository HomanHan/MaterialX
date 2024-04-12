package ltd.newbee.mall.service.impl;

/**
 * @author homan
 * @create 2024-04-12 22:04
 */

import cn.dev33.satoken.stp.StpInterface;
import cn.dev33.satoken.stp.StpUtil;
import ltd.newbee.mall.dao.StpInterfaceMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义权限加载接口实现类
 */
@Component    // 保证此类被 SpringBoot 扫描，完成 Sa-Token 的自定义权限验证扩展
public class StpInterfaceImpl implements StpInterface {

    @Resource
    private StpInterfaceMapper stpinterfaceMapper;

    /**
     * 返回一个账号所拥有的权限码集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
//        List<String> list = new ArrayList<String>();
//        list.add("101");
//        list.add("user.add");
//        list.add("user.update");
//        list.add("user.get");
//        // list.add("user.delete");
//        list.add("art.*");
//        return list;
        return new ArrayList<>();
    }

//    返回一个账号所拥有的角色集合，用以鉴权
    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        if (!StpUtil.isLogin()) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<String>();
        list.add(stpinterfaceMapper.getrole( StpUtil.getLoginIdAsInt() ));
        return list;
    }

}

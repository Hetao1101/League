<%--
  Created by IntelliJ IDEA.
  User: 涛哥哥
  Date: 2021/8/5
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="header">
    <div id="header_left"><img src="images/英雄联盟图片/1.jpg"/>
        <ul>
            <li><h3>游戏资料</h3><p>&nbsp;&nbsp;GAME INFO</p></li>
            <li><h3>商城/合作</h3><p>&nbsp;&nbsp;STORE</p></li>
            <li><h3>社区活动</h3><p>&nbsp;&nbsp;COMMUNITY</p></li>
            <li><h3>赛事官网</h3><p>&nbsp;&nbsp;ESPORTS</p></li>
            <li><h3>自助系统</h3><p>&nbsp;&nbsp;SYSTEM</p></li>
        </ul>
    </div>
    <div id="header_right">
        <ul>
            <li><img src="images/英雄联盟图片/2.jpg"></li>
            <li><img src="images/英雄联盟图片/3.jpg"></li>
            <li><img src="images/英雄联盟图片/4.jpg"></li>
            <li>
                <span id="login_span">&nbsp;&nbsp;亲爱的召唤师，欢迎<a id="openLogin" href="javascript:void(0)">登录</a></span>
                <span id="cancel_span" style="display: none;">请<a id="openRegion" href="javascript:void(0)">绑定大区</a>或<a href="#" id="cancel_login">注销</a></span>
                <span id="role" style="display: none"></span><span id="role_span" style="display: none;"><img id="touxiang"  alt="图片无法加载" style="width: 30px; border-radius: 30px;margin-right: 10px">【<a href="javascript:void(0)" id="cancel_role">注销</a>】</span>
                <span id="id" style="display: none"></span>
            </li>
        </ul>
    </div>
</div>
<div id="login" class="login">
    <input type="button" id="closeBtn" value="关闭" />
    <div class="login_title">
        <span><h3>账号密码登录</h3></span>

        <p>推荐使用<a href="#">手机QQ扫码登录，防止盗号。</a></p>
    </div>

    <div class="login_body">
        账号：<input type="text" id="user_id" size="30" placeholder="请输入qq账号" /><br />
        密码：<input type="password" id="pwd" size="30" placeholder="请输入密码" /><br />
        <input type="button" id="btn" value="登录" />
    </div>

</div>
<div id="bg" class="bg"></div>
<div id="select_region" style="display: none">
    <div id="region_title"><h4>请选择大区</h4></div>
    <div id="region_body">
        <select>
            <option selected>请选择大区</option>
            <option>艾欧里亚 电信</option>
            <option>比尔吉沃特 网通</option>
            <option>祖安 电信</option>
            <option>洛克萨斯 电信</option>
            <option>德玛西亚 网通</option>
            <option>班德尔城 电信</option>
            <option>战争学院 电信</option>
            <option>弗雷尔卓德 网通</option>
            <option>巨神峰 电信</option>
            <option>雷瑟守备 电信</option>
            <option>无畏先锋 网通</option>
            <option>裁决之地 电信</option>
            <option>黑色玫瑰 电信</option>
            <option>暗影岛 电信</option>
            <option>钢铁烈阳 电信</option>
            <option>恕瑞玛 网通</option>
            <option>水晶之痕 电信</option>
            <option>教育网专区</option>
            <option>影流 电信</option>
            <option>守望之海 电信</option>
            <option>扭曲丛林 网通</option>
            <option>征服之海 电信</option>
            <option>卡拉曼达 电信</option>
            <option>皮城警备 电信</option>
            <option>巨龙之巢 网通</option>
            <option>男爵领域 全网络</option>
            <option>均衡教派</option>
        </select>
        <div id="region_footer">
            <button id="sure_region" class="sure">确定</button>
            <button id="cancel_region" class="cancel">取消</button>
        </div>
    </div>
</div>
</body>
</html>

<!DOCTYPE html>
<html>
<head>
    <title>管理员列表</title>
    <#include "../resource.ftl"/>
</head>
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
    
       <div class="layui-form-item">
            <label class="layui-form-label">姓名<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="realname" value="" lay-verify="required" placeholder="请输入姓名"
                      autocomplete="off" class="layui-input">
            </div>
        </div>
        
        <div class="layui-form-item">
            <label class="layui-form-label">用户名<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="username" value="" lay-verify="required|username" placeholder="请输入用户名"
                      autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">邮箱<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="email" value="" lay-verify="required|email"  placeholder="请输入邮箱" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text" name="mobile" value="" lay-verify="required|phone" placeholder="请输入手机号" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        
        <div class="layui-form-item">
          <label class="layui-form-label">部门名称<span class="span_must">*</label>
            <div class="layui-input-normal">
               <input value="${(model.parentOrgId)!""}" id="demo"
               cyType="treeTool" cyProps="url:'/yzweb/organize/select',name:'orgId',filter:'orgId'"
               placeholder="请选择部门" class="layui-input"/>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">所属角色<span class="span_must">*</span></label>
            <div cyType="selectTool" lay-verify="required" cyProps="url:'/yzweb/sys/role/findAll'"
                value="" name="roleIdList[]" class="layui-input-normal"></div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">状态</label>
            <div cyType="radioTool" cyProps="enumName:'StateEnum'" name="status"
                 value="1" class="layui-input-inline"></div>
        </div>

        <div class="page-footer">
            <div class="btn-list">
                <div class="btnlist">
                    <button class="layui-btn" lay-submit="" lay-filter="submit" data-url="/yzweb/sys/user/save"><i
                            class="fa fa-floppy-o">&nbsp;</i>保存
                    </button>
                    <button class="layui-btn" onclick="$t.closeWindow();"><i class="fa fa-undo">&nbsp;</i>返回</button>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
</html>


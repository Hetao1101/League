$(function()
{
    $("#openLogin").click(function()
    {
        var $login=$("#login");
        var $bg=$("#bg");
        $bg.css("display","block");
        $login.css("display","block");
    })
    $("#closeBtn").click(function()
    {
        var $login=$("#login");
        var $bg=$("#bg");

        $bg.css("display","none");
        $login.css("display","none");
    })
    $("#cancel_role").click(function () {
        var $role_span=$("#role_span");
        $role_span.css("display","none");
        var $role=$("#role");
        $role.css("display","none");
        var $login=$("#login_span");
        $login.css("display","block");
    })
    $("#btn").click(function()
    {
        var $user_id=$("#user_id").val();
        var $pwd=$("#pwd").val();
        $.ajax({type:"POST",url:"user",dataType:"json",data:{"action":"login","user_id":$user_id,"pwd":$pwd},success:function (data) {

                if(data!=null)
                {
                    var $login=$("#login");
                    var $bg=$("#bg");
                    $login.css("display","none");
                    $bg.css("display","none");
                    var $login_span=$("#login_span");
                    var $cancel_span=$("#cancel_span");
                    $login_span.css("display","none")
                    $cancel_span.css("display","block")
                    var $id=$("#id");
                    $id.html(data.id);
                }
                else {
                    alert("账号或者密码错误，请重试。");
                }
            },error(data)
            {
                alert("error")
                alert(data.id)
            }
        })
    })
    $("#cancel_login").click(function(){
        var $login_span=$("#login_span");
        var $cancel_span=$("#cancel_span");
        $login_span.css("display","block");
        $cancel_span.css("display","none");
    })
    $("#openRegion").click(function ()
    {
        var $select_region=$("#select_region");
        $select_region.css("display","block");
    })
    $("#cancel_region").click(function () {
        var $select_region=$("#select_region");
        $select_region.css("display","none");
    })
    $("#sure_region").click(function () {
        var $id=$("#id").text();
        var $region=$(":selected").val();
        $.ajax({async:true,type: "post",data: {"action":"region","id":$id,"region":$region},url:"user",dataType: "json",success:function (data) {
                if(data!=null)
                {
                    var $role_span=$("#role_span");
                    var $region=$("#select_region");
                    var $cancel_span=$("#cancel_span");
                    $cancel_span.css("display","none");
                    $region.css("display","none");
                    $role_span.css("display","inline");
                    var $role=$("#role");
                    $role.css("display","inline");
                    $role.text(data.ro_name);
                    var $touxiang=$("#touxiang");
                    $touxiang.attr("src","images/userImages/"+data.uid+".png");
                }
                else {
                    alert("在该区没有角色")
                }
            },
            error:function (data) {
                alert("error")
            }
        });
    })
})
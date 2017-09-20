$(function(){
	$("#divMsg").ajaxStart(function(){
		$(this).show();
	})
	$("#divMsg").ajaxStop(function(){
		$(this).html("用户名不能为空！").hide();
	})
	$("#Button1").click(function(){
		var $name=$("#txtName");
		var $pass=$("#txtPass");
		var $pass2=$("#txtPass2")
		if($name.val()!="" && $pass.val()!="" && $pass2.val()!="" && $pass.val()==$pass2.val() ){
			UserRegister($name.val(),$pass.val());
		}else{
			if($name.val()=="" || $pass.val()=="" || $pass2.val()){
				alert("用户名或者密码不能为空！");
				$name.focus();
				return false;
			}else{
				alert("两次密码不一致");
				$pass2.focus();
				return false;
				}
			}
	})
});
function UserRegister(name,pass){
	$.ajax({
	type:"POST",
	url:"chat",
	data:"action=Register&d="+new Date()+"&name="+name+"&pass="+pass,
	success:function(data){
		if(data){
			window.location.href="Login.html";
		}else{
			alert("注册失败");
			return false;
		}
	}
	}
	);
}
$(function(){
	$("#divMsg").ajaxStart(function(){
		$(this).show();
	})
	$("#divMsg").ajaxStop(function(){
		$(this).html("����������ɡ�").hide();
	})
	$("#Button1").click(function(){
		var $name=$("#txtName");
		var $pass=$("#txtPass");
		if($name.val()!="" && $pass.val()!=""){
			UserLogin($name.val(),$pass.val());
		}else{
			if($name.val()==""){
				alert("�û�������Ϊ�գ�");
				$name.focus();
				return false;
			}else{
				alert("���벻��Ϊ�գ�");
				$pass.focus();
				return false;
			}
		}
	})
	$("#Button2").click(function(){
		window.location.href="Register.html";
    })
});
function UserLogin(name,pass){
	$.ajax({
	type:"POST",
	url:"chat",
	data:"action=Login&d="+new Date()+"&name="+name+"&pass="+pass,
	success:function(data){
		if(data){
			window.location.href="ChatMain.html";
		}else{
			alert("�û������������");
			return false;
		}
	}
	}
	);
}
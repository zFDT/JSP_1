/*Define a variable to display error message */
 var err="";
 /*set variables for all inputs,the initial values is  false*/
 var name_valid=false;
 var pw_valid=false;
 var email_valid=false;
 /* function--return the object with specified*/
 function $(id){
	 obj=document.getElementById(id);
	 if(obj==null)
		 obj=document.all.id;
	 return obj;
 }
 /*
 *function return the length of string double-byte character account for two
 *characters
 */
 String.prototype.chlength=function(){
	 var len =this.replace(/^\x00-\xff]/g,"**").length;
	 return len;
 }
 /* call it when press reset*/
 function init(){
 $('#uname').focus();//Focus on the first input
 $('msg').innerHTML="";//clear error message
 err='';
 
 }

 
 function checkUser(input){

	 var reg=/^[1-9]+[0-9]*]*$/; 
	 var num=document.getElementById(input).value;

	 if(!reg.test(num)){

	         alert("请输入数字");

	     document.getElementById(input).value="";

	     return false;

	     }

	 }
	
   //function chkUser(){
 // User_vaild=false;
 //var User=$('User').values;
 //if(name==null||name==''){
 //err+='User name cannot be null.<br/>' ;
 // }
 // else if(name.chlength()>16||name.chlength()<3){
 // err+= 'The length of user must be 3-16.<br/>';
 // }
 //else{name_valid=true;
 //}
 //}
 function chkPassword(){
		pw_valid=false;
		var pw=$('#pw').value;
		var cpw=$('#cpw').value;
		if(pw!=cpw){
			err+='Confirmed password is not consistent to the password.<br/>';
			
		}else{
			var patton = /^([\w$_]){3,12}$/;
			if(!pattern.text(pw)){
				err +='Password contains 3-12 letters,digits or signs likes $,_.<br/>';
			}else
				pw_valid=true;
		}
	}
 
 function chkAll(){
	 $('msg').innerHTML ="";
	 err='';
	 chkpassword();
	 chkEmail();
	 if (name_valid && pw_vaild && email_vaild)
		 return true;
	 else{
		 $('msg').innerHTML=err;
		 return false;
	 }
   
 
 
 
 
 }
 
 
 
 
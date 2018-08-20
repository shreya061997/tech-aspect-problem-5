function myfunction()
{

var e=firstnamecheck();
var f=lastnamecheck();
if( e &&f ){
return true;
}
else{
return false;
}
}

function firstnamecheck()
{
var z=document.getElementById("firstname").value;
if(!isNaN(z)){
document.getElementById("firstname2").innerHTML="please enter only characters";
document.myForm.firstname.select();
return false;
}
else if(z.length<5 || z.length>15)
{
document.getElementById("firstname2").innerHTML="your character must be 5 to 15 characters";
document.myForm.firstname.select;
return false;
}
else
return true;
}
function lastnamecheck()
{
var z=document.getElementById("lastname").value;
if(!isNaN(z)){
document.getElementById("lastname2").innerHTML="please enter only characters";
document.myForm.lastname.select();
return false;
}
else if(z.length<5 || z.length>15)
{
document.getElementById("lastname2").innerHTML="your character must be 5 to 15 characters";
document.myForm.lastname.select;
return false;
}
else
return true;
}
